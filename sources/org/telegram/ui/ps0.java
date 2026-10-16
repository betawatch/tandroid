package org.telegram.ui;

import android.graphics.Typeface;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ps0 implements org.telegram.ui.ActionBar.z1, Utilities.Callback2Return, org.telegram.ui.Components.rw0, q3.g, g2.g, qg.h0, androidx.car.app.utils.d {
    public final /* synthetic */ int a;

    public /* synthetic */ ps0(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration c(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // qg.h0
    public Typeface a() {
        switch (this.a) {
            case 21:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM);
            case 22:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
            case 23:
                return Typeface.create("serif", 1);
            case 24:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 25:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            default:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD);
        }
    }

    @Override // q3.g
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // androidx.car.app.utils.d
    public void call() {
        throw null;
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                a2Var.dismiss();
                break;
            case 1:
                a2Var.dismiss();
                break;
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                a2Var.dismiss();
                break;
            case 3:
                a2Var.dismiss();
                break;
            case 4:
                a2Var.dismiss();
                break;
            case 10:
                a2Var.dismiss();
                break;
            case 11:
                a2Var.dismiss();
                break;
            case 12:
                a2Var.dismiss();
                break;
            case 13:
                a2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.rw0
    public void h(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return ((Integer) obj).intValue() == 0 ? zh.p7.Y0(false, LocaleController.formatPluralStringComma("Stars", ((Integer) obj2).intValue()), 0.66f, null) : LocaleController.formatNumber(r4.intValue(), ',');
    }

    public /* synthetic */ ps0(r.a aVar, int i10, w.b bVar) {
        this.a = 27;
    }

    @Override // org.telegram.ui.Components.rw0
    public /* synthetic */ void m() {
    }
}
