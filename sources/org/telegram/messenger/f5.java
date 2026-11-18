package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class f5 {
    public int a;
    public String b;
    public String c;
    public boolean d;
    public final ArrayList e = new ArrayList(4);
    public final ArrayList f = new ArrayList(4);
    public final ArrayList g = new ArrayList(4);
    public final ArrayList h = new ArrayList(4);
    public String i;
    public String j;
    public boolean k;
    public int l;
    public TLRPC.User m;

    public static String a(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str.substring(0, 1) : !TextUtils.isEmpty(str2) ? str2.substring(0, 1) : "#";
    }
}
