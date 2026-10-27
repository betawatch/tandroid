package org.telegram.ui;

import android.graphics.Typeface;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class li1 implements org.telegram.ui.ActionBar.b2, q3.g, androidx.car.app.utils.c, g2.g, rg.h0 {
    public final /* synthetic */ int a;

    public /* synthetic */ li1(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration a(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // rg.h0
    public Typeface b() {
        switch (this.a) {
            case 14:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM);
            case 15:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
            case 16:
                return Typeface.create("serif", 1);
            case 17:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 18:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            default:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD);
        }
    }

    @Override // q3.g
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // androidx.car.app.utils.c
    public void call() {
        throw null;
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                e2Var.dismiss();
                break;
            case 1:
                e2Var.dismiss();
                break;
            default:
                e2Var.dismiss();
                break;
        }
    }

    public /* synthetic */ li1(r.a aVar, int i10, w.b bVar) {
        this.a = 7;
    }
}
