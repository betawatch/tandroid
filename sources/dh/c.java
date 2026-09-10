package dh;

import android.graphics.Color;
import androidx.emoji2.text.w;
import ch.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import w7.q;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class c {
    public static e a(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new a(4);
        eVar.d(385875968, 402653183);
        eVar.c(385875968, 402653183);
        eVar.b(285212672, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        eVar.n = dpf2;
        eVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e b(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new b(0, f6Var);
        eVar.d(-1, 687865855);
        eVar.c(-1, 352321535);
        eVar.b(TLObject.FLAG_29, 0);
        float dpf2 = AndroidUtilities.dpf2(0.5f);
        float dpf22 = AndroidUtilities.dpf2(0.5f);
        eVar.f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static boolean c(int i10, f6 f6Var) {
        boolean a2 = f6Var != null ? f6Var.a() : j6.I.q();
        boolean chatBlurEnabled = SharedConfig.chatBlurEnabled();
        if (chatBlurEnabled && !a2 && MessagesController.getInstance(i10).config.disableBlurInLightTheme.get()) {
            chatBlurEnabled = false;
        }
        if (chatBlurEnabled && a2 && MessagesController.getInstance(i10).config.disableBlurInDarkTheme.get()) {
            return false;
        }
        return chatBlurEnabled;
    }

    public static e d(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new a(8);
        eVar.d(-1, 687865855);
        eVar.c(-1, 352321535);
        eVar.b(TLObject.FLAG_30, 0);
        float dpf2 = AndroidUtilities.dpf2(3.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.n = dpf2;
        eVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.5f);
        float dpf24 = AndroidUtilities.dpf2(0.5f);
        eVar.f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e e(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new w(24);
        eVar.d(687865855, 687865855);
        eVar.c(352321535, 352321535);
        eVar.b(TLObject.FLAG_29, 0);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.n = dpf2;
        eVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e f(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new a(3);
        eVar.d(285212672, 117440511);
        eVar.c(TLObject.FLAG_29, 301989887);
        eVar.b(TLObject.FLAG_29, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        eVar.n = dpf2;
        eVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e g(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new w(25);
        eVar.d(1157627903, 0);
        eVar.c(587202559, 0);
        eVar.b(939524096, 0);
        eVar.n = AndroidUtilities.dpf2(3.5f);
        eVar.r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e h(f6 f6Var) {
        return g(f6Var);
    }

    public static e i(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new a(7);
        eVar.d(687865855, 687865855);
        eVar.c(352321535, 352321535);
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e j(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new a(5);
        eVar.d(-1, 553648127);
        eVar.c(0, 553648127);
        eVar.b(1207959552, 83886079);
        eVar.n = AndroidUtilities.dpf2(0.6666667f);
        eVar.r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.67f);
        float dpf22 = AndroidUtilities.dpf2(0.67f);
        eVar.f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e k(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new a(2);
        eVar.d(1157627903, 0);
        eVar.c(587202559, 0);
        eVar.b(637534208, 0);
        eVar.n = AndroidUtilities.dpf2(4.0f);
        eVar.r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        eVar.f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e l(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.d(0, 687865855);
        eVar.c(0, 352321535);
        eVar.b(805306368, 83886079);
        float dpf2 = AndroidUtilities.dpf2(4.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        eVar.n = dpf2;
        eVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static int m(float f7, int i10, int i11) {
        float a2 = q.a(f7, 0.0f, 1.0f);
        if (a2 <= 0.0f) {
            return Color.argb(0, 0, 0, 0);
        }
        if (a2 >= 1.0f) {
            return Color.argb(255, Color.red(i11), Color.green(i11), Color.blue(i11));
        }
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        float f10 = 1.0f - a2;
        return Color.argb(q.b(Math.round(a2 * 255.0f), 0, 255), q.b(Math.round((Color.red(i11) - (red * f10)) / a2), 0, 255), q.b(Math.round((Color.green(i11) - (green * f10)) / a2), 0, 255), q.b(Math.round((Color.blue(i11) - (blue * f10)) / a2), 0, 255));
    }

    public static e n(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new w(26);
        eVar.d(285212672, 117440511);
        eVar.c(TLObject.FLAG_29, 301989887);
        eVar.b(TLObject.FLAG_29, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        eVar.n = dpf2;
        eVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        eVar.f = dpf23;
        eVar.h = dpf24;
        return eVar;
    }

    public static e o(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new b(2, f6Var);
        eVar.d(-1, 553648127);
        eVar.c(-1, 352321535);
        eVar.b(TLObject.FLAG_29, 0);
        float dpf2 = AndroidUtilities.dpf2(0.55f);
        float dpf22 = AndroidUtilities.dpf2(0.55f);
        eVar.f = dpf2;
        eVar.h = dpf22;
        return eVar;
    }

    public static e p(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new a(6);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        eVar.n = 0.0f;
        eVar.r = 0.0f;
        eVar.f = 0.0f;
        eVar.h = 0.0f;
        return eVar;
    }

    public static e q(f6 f6Var) {
        e eVar = new e(f6Var);
        eVar.e = new b(1, f6Var);
        eVar.d(0, 0);
        eVar.c(0, 0);
        eVar.b(0, 0);
        eVar.n = 0.0f;
        eVar.r = 0.0f;
        eVar.f = 0.0f;
        eVar.h = 0.0f;
        return eVar;
    }
}
