package org.telegram.ui;

import android.content.ComponentName;
import android.content.Context;
import org.telegram.messenger.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'h' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bb0 {
    public static final bb0 h;
    public static final /* synthetic */ bb0[] n;
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public ComponentName f;

    static {
        int i10 = R.drawable.icon_background_sa;
        int i11 = R.mipmap.icon_foreground_sa;
        bb0 bb0Var = new bb0("DEFAULT", 0, "DefaultIcon", i10, i11, R.string.AppIconDefault, false);
        h = bb0Var;
        n = new bb0[]{bb0Var, new bb0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new bb0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i11, R.string.AppIconAqua, false), new bb0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new bb0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new bb0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i11, R.string.AppIconNox, true)};
    }

    public bb0(String str, int i10, String str2, int i11, int i12, int i13, boolean z4) {
        this.a = str2;
        this.b = i11;
        this.c = i12;
        this.d = i13;
        this.e = z4;
    }

    public static bb0 valueOf(String str) {
        return (bb0) Enum.valueOf(bb0.class, str);
    }

    public static bb0[] values() {
        return (bb0[]) n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f == null) {
            this.f = new ComponentName(context.getPackageName(), "org.telegram.messenger." + this.a);
        }
        return this.f;
    }
}
