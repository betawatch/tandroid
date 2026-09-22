package org.telegram.ui;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ja0 implements GenericProvider, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.bd0, Utilities.Callback2Return, org.telegram.ui.Components.fw0, pg.i0, q3.g, q9.e {
    public final /* synthetic */ int a;

    public /* synthetic */ ja0(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration d(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info f(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // pg.i0
    public Typeface a() {
        switch (this.a) {
            case 22:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM);
            case 23:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
            case 24:
                return Typeface.create("serif", 1);
            case 25:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 26:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            default:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD);
        }
    }

    @Override // q9.e
    public List b(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // q3.g
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // org.telegram.ui.Components.bd0
    public String e(int i10) {
        return i10 == 0 ? LocaleController.getString(R.string.AutoLockDisabled) : i10 == 1 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 1, new Object[0])) : i10 == 2 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 5, new Object[0])) : i10 == 3 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 1, new Object[0])) : i10 == 4 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 5, new Object[0])) : "";
    }

    @Override // org.telegram.ui.Components.fw0
    public void g(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                b2Var.dismiss();
                break;
            case 3:
            case 7:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
                b2Var.dismiss();
                break;
            case 4:
                Drawable[] drawableArr = PhotoViewer.U8;
                break;
            case 5:
                b2Var.dismiss();
                break;
            case 6:
                b2Var.dismiss();
                break;
            case 8:
                b2Var.dismiss();
                break;
            case 9:
                b2Var.dismiss();
                break;
            case 15:
                b2Var.dismiss();
                break;
            case 16:
                b2Var.dismiss();
                break;
            case 17:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        Pattern pattern = LaunchActivity.B1;
        return new gh0();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return ((Integer) obj).intValue() == 0 ? yh.w7.X0(false, LocaleController.formatPluralStringComma("Stars", ((Integer) obj2).intValue()), 0.66f, null) : LocaleController.formatNumber(r4.intValue(), ',');
    }

    @Override // org.telegram.ui.Components.fw0
    public /* synthetic */ void l() {
    }
}
