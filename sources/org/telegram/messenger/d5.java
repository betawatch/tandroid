package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class d5 {
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
