package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioRecordingConfiguration;
import android.os.Bundle;
import android.text.Layout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fk0 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.xb0, Utilities.Callback2Return, org.telegram.ui.Components.av0, og.b, androidx.car.app.utils.e, h3.f {
    public final /* synthetic */ int a;

    public /* synthetic */ fk0(int i9) {
        this.a = i9;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration d(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    @Override // og.b
    public Object a(Bitmap bitmap) {
        switch (this.a) {
            case 17:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
                stackBlurBitmapWithScaleFactor.setHasAlpha(false);
                return stackBlurBitmapWithScaleFactor;
            case 18:
                int i9 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i9 = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                }
                return Integer.valueOf(i9);
            default:
                int i10 = 0;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i10 = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                }
                return Integer.valueOf(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0065  */
    @Override // h3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h3.g c(Bundle bundle) {
        float f10;
        int i9;
        String str;
        int i10;
        float f11;
        String str2;
        boolean z10;
        int i11;
        CharSequence charSequence = bundle.getCharSequence(r4.b.E);
        CharSequence charSequence2 = charSequence != null ? charSequence : null;
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(r4.b.F);
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(r4.b.G);
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(r4.b.H);
        Bitmap bitmap2 = bitmap != null ? bitmap : null;
        String str3 = r4.b.I;
        if (bundle.containsKey(str3)) {
            String str4 = r4.b.J;
            if (bundle.containsKey(str4)) {
                f10 = bundle.getFloat(str3);
                i9 = bundle.getInt(str4);
                String str5 = r4.b.K;
                int i12 = !bundle.containsKey(str5) ? bundle.getInt(str5) : TLObject.FLAG_31;
                String str6 = r4.b.L;
                float f12 = !bundle.containsKey(str6) ? bundle.getFloat(str6) : -3.4028235E38f;
                String str7 = r4.b.M;
                int i13 = !bundle.containsKey(str7) ? bundle.getInt(str7) : TLObject.FLAG_31;
                str = r4.b.O;
                if (bundle.containsKey(str)) {
                    String str8 = r4.b.N;
                    if (bundle.containsKey(str8)) {
                        float f13 = bundle.getFloat(str);
                        i10 = bundle.getInt(str8);
                        f11 = f13;
                        String str9 = r4.b.P;
                        float f14 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
                        String str10 = r4.b.Q;
                        float f15 = bundle.containsKey(str10) ? bundle.getFloat(str10) : -3.4028235E38f;
                        str2 = r4.b.R;
                        if (bundle.containsKey(str2)) {
                            z10 = true;
                            i11 = bundle.getInt(str2);
                        } else {
                            z10 = false;
                            i11 = -16777216;
                        }
                        boolean z11 = bundle.getBoolean(r4.b.S, false) ? z10 : false;
                        String str11 = r4.b.T;
                        int i14 = bundle.containsKey(str11) ? bundle.getInt(str11) : TLObject.FLAG_31;
                        String str12 = r4.b.U;
                        return new r4.b(charSequence2, alignment2, alignment4, bitmap2, f10, i9, i12, f12, i13, i10, f11, f14, f15, z11, i11, i14, bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f);
                    }
                }
                i10 = TLObject.FLAG_31;
                f11 = -3.4028235E38f;
                String str92 = r4.b.P;
                if (bundle.containsKey(str92)) {
                }
                String str102 = r4.b.Q;
                if (bundle.containsKey(str102)) {
                }
                str2 = r4.b.R;
                if (bundle.containsKey(str2)) {
                }
                if (bundle.getBoolean(r4.b.S, false)) {
                }
                String str112 = r4.b.T;
                if (bundle.containsKey(str112)) {
                }
                String str122 = r4.b.U;
                return new r4.b(charSequence2, alignment2, alignment4, bitmap2, f10, i9, i12, f12, i13, i10, f11, f14, f15, z11, i11, i14, bundle.containsKey(str122) ? bundle.getFloat(str122) : 0.0f);
            }
        }
        f10 = -3.4028235E38f;
        i9 = TLObject.FLAG_31;
        String str52 = r4.b.K;
        if (!bundle.containsKey(str52)) {
        }
        String str62 = r4.b.L;
        if (!bundle.containsKey(str62)) {
        }
        String str72 = r4.b.M;
        if (!bundle.containsKey(str72)) {
        }
        str = r4.b.O;
        if (bundle.containsKey(str)) {
        }
        i10 = TLObject.FLAG_31;
        f11 = -3.4028235E38f;
        String str922 = r4.b.P;
        if (bundle.containsKey(str922)) {
        }
        String str1022 = r4.b.Q;
        if (bundle.containsKey(str1022)) {
        }
        str2 = r4.b.R;
        if (bundle.containsKey(str2)) {
        }
        if (bundle.getBoolean(r4.b.S, false)) {
        }
        String str1122 = r4.b.T;
        if (bundle.containsKey(str1122)) {
        }
        String str1222 = r4.b.U;
        return new r4.b(charSequence2, alignment2, alignment4, bitmap2, f10, i9, i12, f12, i13, i10, f11, f14, f15, z11, i11, i14, bundle.containsKey(str1222) ? bundle.getFloat(str1222) : 0.0f);
    }

    @Override // androidx.car.app.utils.e
    public void call() {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                c2Var.dismiss();
                break;
            case 1:
            case 5:
            case 8:
            case 13:
            case 14:
            default:
                c2Var.dismiss();
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.P8;
                break;
            case 3:
                c2Var.dismiss();
                break;
            case 4:
                c2Var.dismiss();
                break;
            case 6:
                c2Var.dismiss();
                break;
            case 7:
                c2Var.dismiss();
                break;
            case 9:
                c2Var.dismiss();
                break;
            case 10:
                c2Var.dismiss();
                break;
            case 11:
                c2Var.dismiss();
                break;
            case 12:
                c2Var.dismiss();
                break;
            case 15:
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.xb0
    public String g(int i9) {
        return i9 == 0 ? LocaleController.getString(R.string.AutoLockDisabled) : i9 == 1 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 1, new Object[0])) : i9 == 2 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 5, new Object[0])) : i9 == 3 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 1, new Object[0])) : i9 == 4 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 5, new Object[0])) : "";
    }

    @Override // org.telegram.ui.Components.av0
    public void h(int i9) {
        SharedConfig.proxyRotationTimeout = i9;
        SharedConfig.saveConfig();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return ((Integer) obj).intValue() == 0 ? gh.oa.X0(false, LocaleController.formatPluralStringComma("Stars", ((Integer) obj2).intValue()), 0.66f, null) : LocaleController.formatNumber(r4.intValue(), ',');
    }

    public /* synthetic */ fk0(r.a aVar, int i9, w.b bVar) {
        this.a = 21;
    }

    @Override // org.telegram.ui.Components.av0
    public /* synthetic */ void m() {
    }
}
