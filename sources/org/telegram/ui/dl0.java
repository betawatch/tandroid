package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dl0 {
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public TLRPC.Document e;
    public String f;
    public String g;

    public final Uri a(int i10) {
        if (!TextUtils.isEmpty(this.g)) {
            return Uri.fromFile(new File(this.g));
        }
        TLRPC.Document document = this.e;
        if (document == null) {
            return null;
        }
        String str = document.file_name_fixed;
        String documentExtension = FileLoader.getDocumentExtension(document);
        if (documentExtension == null) {
            return null;
        }
        String lowerCase = documentExtension.toLowerCase();
        if (!str.endsWith(lowerCase)) {
            str = a1.g.D(str, ".", lowerCase);
        }
        File file = new File(AndroidUtilities.getCacheDir(), str);
        if (!file.exists()) {
            try {
                AndroidUtilities.copyFile(FileLoader.getInstance(i10).getPathToAttach(this.e), file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Uri.fromFile(file);
    }
}
