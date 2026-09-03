package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.media.AudioRecordingConfiguration;
import android.net.Uri;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl0 implements org.telegram.ui.Components.tc0, org.telegram.ui.ActionBar.c2, Utilities.Callback2Return, org.telegram.ui.Components.tv0, j3.f, GenericProvider, androidx.car.app.utils.e, qg.c {
    public final /* synthetic */ int a;

    public /* synthetic */ cl0(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration b(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public Constructor a() {
        switch (this.a) {
            case 24:
                if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(r3.k.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(r3.k.class).getConstructor(null);
        }
    }

    @Override // j3.f
    public j3.g c(Bundle bundle) {
        p4.a[] aVarArr;
        switch (this.a) {
            case 13:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(p4.b.n);
                if (parcelableArrayList == null) {
                    aVarArr = new p4.a[0];
                } else {
                    p4.a[] aVarArr2 = new p4.a[parcelableArrayList.size()];
                    for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                        aVarArr2[i10] = (p4.a) p4.a.D.c((Bundle) parcelableArrayList.get(i10));
                    }
                    aVarArr = aVarArr2;
                }
                return new p4.b(aVarArr, bundle.getLong(p4.b.r, 0L), bundle.getLong(p4.b.s, -9223372036854775807L), bundle.getInt(p4.b.v, 0));
            default:
                long j10 = bundle.getLong(p4.a.r);
                int i11 = bundle.getInt(p4.a.s);
                int i12 = bundle.getInt(p4.a.C);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(p4.a.v);
                int[] intArray = bundle.getIntArray(p4.a.w);
                long[] longArray = bundle.getLongArray(p4.a.x);
                long j11 = bundle.getLong(p4.a.y);
                boolean z4 = bundle.getBoolean(p4.a.B);
                int[] iArr = intArray;
                if (iArr == null) {
                    iArr = new int[0];
                }
                Uri[] uriArr = parcelableArrayList2 == null ? new Uri[0] : (Uri[]) parcelableArrayList2.toArray(new Uri[0]);
                if (longArray == null) {
                    longArray = new long[0];
                }
                return new p4.a(j10, i11, i12, iArr, uriArr, longArray, j11, z4);
        }
    }

    @Override // androidx.car.app.utils.e
    public void call() {
        throw null;
    }

    @Override // org.telegram.ui.Components.tc0
    public String e(int i10) {
        return i10 == 0 ? LocaleController.getString(R.string.AutoLockDisabled) : i10 == 1 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 1, new Object[0])) : i10 == 2 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 5, new Object[0])) : i10 == 3 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 1, new Object[0])) : i10 == 4 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 5, new Object[0])) : "";
    }

    @Override // qg.c
    public int f(org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        switch (this.a) {
            case 26:
                return rg.b.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sd, f6Var));
            case 27:
                if (!LiteMode.isEnabled(256)) {
                    return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                }
                return org.telegram.ui.ActionBar.j6.l1(z4 ? 0.85f : 0.825f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false));
            case 28:
                return rg.b.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Zk, f6Var));
            default:
                return org.telegram.ui.ActionBar.j6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fi, f6Var));
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public void g(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                Drawable[] drawableArr = PhotoViewer.Q8;
                break;
            case 2:
                d2Var.dismiss();
                break;
            case 3:
                d2Var.dismiss();
                break;
            case 4:
            case 7:
            default:
                d2Var.dismiss();
                break;
            case 5:
                d2Var.dismiss();
                break;
            case 6:
                d2Var.dismiss();
                break;
            case 8:
                d2Var.dismiss();
                break;
            case 9:
                d2Var.dismiss();
                break;
            case 10:
                d2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        MediaController.AlbumEntry albumEntry = ph.a3.g0;
        return 0;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.a) {
            case 4:
                return num.intValue() == 0 ? lh.ja.X0(false, LocaleController.formatPluralStringComma("Stars", num2.intValue()), 0.66f, null) : LocaleController.formatNumber(num2.intValue(), ',');
            default:
                if (num.intValue() == 0) {
                    return num2.intValue() == 0 ? LocaleController.getString(R.string.LiveStoryPricePerCommentFree) : LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    public /* synthetic */ cl0(r.a aVar, int i10, w.b bVar) {
        this.a = 19;
    }

    @Override // org.telegram.ui.Components.tv0
    public /* synthetic */ void j() {
    }
}
