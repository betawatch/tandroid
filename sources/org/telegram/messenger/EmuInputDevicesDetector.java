package org.telegram.messenger;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class EmuInputDevicesDetector {
    private static final String INPUT_DEVICES_FILE = "/proc/bus/input/devices";
    private static final String NAME_PREFIX = "N: Name=\"";
    private static final String[] RESTRICTED_DEVICES = {"bluestacks", "memuhyperv", "virtualbox"};

    private EmuInputDevicesDetector() {
    }

    public static boolean detect() {
        List<String> inputDevicesNames = getInputDevicesNames();
        if (inputDevicesNames != null) {
            for (String str : inputDevicesNames) {
                for (String str2 : RESTRICTED_DEVICES) {
                    if (str.toLowerCase().contains(str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static List<String> getInputDevicesNames() {
        File file = new File(INPUT_DEVICES_FILE);
        if (!file.canRead()) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return arrayList;
                }
                if (readLine.startsWith(NAME_PREFIX)) {
                    String substring = readLine.substring(9, readLine.length() - 1);
                    if (!TextUtils.isEmpty(substring)) {
                        arrayList.add(substring);
                    }
                }
            }
        } catch (IOException e7) {
            FileLog.e(e7);
            return null;
        }
    }
}
