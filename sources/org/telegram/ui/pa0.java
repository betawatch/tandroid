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
/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pa0 {
    public static final pa0 h;
    public static final /* synthetic */ pa0[] n;
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public ComponentName f;

    static {
        int i9 = R.drawable.icon_background_sa;
        int i10 = R.mipmap.icon_foreground_sa;
        pa0 pa0Var = new pa0("DEFAULT", 0, "DefaultIcon", i9, i10, R.string.AppIconDefault, false);
        h = pa0Var;
        n = new pa0[]{pa0Var, new pa0("VINTAGE", 1, "VintageIcon", R.drawable.icon_6_background_sa, R.mipmap.icon_6_foreground_sa, R.string.AppIconVintage, false), new pa0("AQUA", 2, "AquaIcon", R.drawable.icon_4_background_sa, i10, R.string.AppIconAqua, false), new pa0("PREMIUM", 3, "PremiumIcon", R.drawable.icon_3_background_sa, R.mipmap.icon_3_foreground_sa, R.string.AppIconPremium, true), new pa0("TURBO", 4, "TurboIcon", R.drawable.icon_5_background_sa, R.mipmap.icon_5_foreground_sa, R.string.AppIconTurbo, true), new pa0("NOX", 5, "NoxIcon", R.mipmap.icon_2_background_sa, i10, R.string.AppIconNox, true)};
    }

    public pa0(String str, int i9, String str2, int i10, int i11, int i12, boolean z10) {
        this.a = str2;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = z10;
    }

    public static pa0 valueOf(String str) {
        return (pa0) Enum.valueOf(pa0.class, str);
    }

    public static pa0[] values() {
        return (pa0[]) n.clone();
    }

    public final ComponentName a(Context context) {
        if (this.f == null) {
            this.f = new ComponentName(context.getPackageName(), "org.telegram.messenger." + this.a);
        }
        return this.f;
    }
}
