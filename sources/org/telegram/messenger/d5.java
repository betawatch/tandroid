package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
