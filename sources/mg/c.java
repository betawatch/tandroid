package mg;

import android.graphics.Color;
import g7.n;
import i3.i;
import lg.d;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class c {
    public static d a(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.e = new b(1);
        dVar.d(385875968, 402653183);
        dVar.c(385875968, 402653183);
        dVar.b(285212672, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        dVar.n = dpf2;
        dVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        dVar.f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d b(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.e = new a(0, b6Var);
        dVar.d(-1, 687865855);
        dVar.c(-1, 352321535);
        dVar.b(TLObject.FLAG_29, 0);
        float dpf2 = AndroidUtilities.dpf2(0.5f);
        float dpf22 = AndroidUtilities.dpf2(0.5f);
        dVar.f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static boolean c(int i9, b6 b6Var) {
        boolean a2 = b6Var != null ? b6Var.a() : f6.I.q();
        boolean chatBlurEnabled = SharedConfig.chatBlurEnabled();
        if (chatBlurEnabled && !a2 && MessagesController.getInstance(i9).config.disableBlurInLightTheme.get()) {
            chatBlurEnabled = false;
        }
        if (chatBlurEnabled && a2 && MessagesController.getInstance(i9).config.disableBlurInDarkTheme.get()) {
            return false;
        }
        return chatBlurEnabled;
    }

    public static d d(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.e = new b(5);
        dVar.d(-1, 687865855);
        dVar.c(-1, 352321535);
        dVar.b(TLObject.FLAG_30, 0);
        float dpf2 = AndroidUtilities.dpf2(3.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.n = dpf2;
        dVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.5f);
        float dpf24 = AndroidUtilities.dpf2(0.5f);
        dVar.f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d e(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.e = new i(22);
        dVar.d(687865855, 687865855);
        dVar.c(352321535, 352321535);
        dVar.b(TLObject.FLAG_29, 0);
        float dpf2 = AndroidUtilities.dpf2(3.3333333f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.n = dpf2;
        dVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d f(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.e = new b(0);
        dVar.d(285212672, 117440511);
        dVar.c(TLObject.FLAG_29, 301989887);
        dVar.b(TLObject.FLAG_29, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        dVar.n = dpf2;
        dVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        dVar.f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d g(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.e = new i(23);
        dVar.d(1157627903, 0);
        dVar.c(587202559, 0);
        dVar.b(939524096, 0);
        dVar.n = AndroidUtilities.dpf2(3.5f);
        dVar.r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d h(b6 b6Var) {
        return g(b6Var);
    }

    public static d i(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.e = new b(4);
        dVar.d(687865855, 687865855);
        dVar.c(352321535, 352321535);
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d j(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.e = new i(29);
        dVar.d(1157627903, 0);
        dVar.c(587202559, 0);
        dVar.b(637534208, 0);
        dVar.n = AndroidUtilities.dpf2(4.0f);
        dVar.r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.6666667f);
        float dpf22 = AndroidUtilities.dpf2(0.6666667f);
        dVar.f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d k(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.d(0, 687865855);
        dVar.c(0, 352321535);
        dVar.b(805306368, 83886079);
        float dpf2 = AndroidUtilities.dpf2(4.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        dVar.n = dpf2;
        dVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        dVar.f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static int l(float f10, int i9, int i10) {
        float a2 = n.a(f10, 0.0f, 1.0f);
        if (a2 <= 0.0f) {
            return Color.argb(0, 0, 0, 0);
        }
        if (a2 >= 1.0f) {
            return Color.argb(255, Color.red(i10), Color.green(i10), Color.blue(i10));
        }
        int red = Color.red(i9);
        int green = Color.green(i9);
        int blue = Color.blue(i9);
        float f11 = 1.0f - a2;
        return Color.argb(n.b(Math.round(a2 * 255.0f), 0, 255), n.b(Math.round((Color.red(i10) - (red * f11)) / a2), 0, 255), n.b(Math.round((Color.green(i10) - (green * f11)) / a2), 0, 255), n.b(Math.round((Color.blue(i10) - (blue * f11)) / a2), 0, 255));
    }

    public static d m(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.e = new i(24);
        dVar.d(285212672, 117440511);
        dVar.c(TLObject.FLAG_29, 301989887);
        dVar.b(TLObject.FLAG_29, 83886079);
        float dpf2 = AndroidUtilities.dpf2(2.667f);
        float dpf22 = AndroidUtilities.dpf2(0.85f);
        dVar.n = dpf2;
        dVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.4f);
        float dpf24 = AndroidUtilities.dpf2(0.4f);
        dVar.f = dpf23;
        dVar.h = dpf24;
        return dVar;
    }

    public static d n(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.e = new a(2, b6Var);
        dVar.d(-1, 553648127);
        dVar.c(-1, 352321535);
        dVar.b(TLObject.FLAG_29, 0);
        float dpf2 = AndroidUtilities.dpf2(0.55f);
        float dpf22 = AndroidUtilities.dpf2(0.55f);
        dVar.f = dpf2;
        dVar.h = dpf22;
        return dVar;
    }

    public static d o(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.e = new b(3);
        dVar.d(0, 0);
        dVar.c(0, 0);
        dVar.b(0, 0);
        dVar.n = 0.0f;
        dVar.r = 0.0f;
        dVar.f = 0.0f;
        dVar.h = 0.0f;
        return dVar;
    }

    public static d p(b6 b6Var) {
        d dVar = new d(b6Var);
        dVar.e = new a(1, b6Var);
        dVar.d(0, 0);
        dVar.c(0, 0);
        dVar.b(0, 0);
        dVar.n = 0.0f;
        dVar.r = 0.0f;
        dVar.f = 0.0f;
        dVar.h = 0.0f;
        return dVar;
    }
}
