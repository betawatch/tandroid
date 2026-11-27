// default package

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class fj3 implements yn5 {
    public final /* synthetic */ uj3 a;

    public fj3(uj3 uj3Var) {
        this.a = uj3Var;
    }

    @Override // yn5
    public final void H(float f) {
        v21 v21Var = this.a.k4;
        if (v21Var != null) {
            ((m21) v21Var.e).setProgress(f * 0.9f);
        }
    }

    @Override // yn5
    public final void O(boolean z, boolean z2) {
        vnb vnbVar;
        vnb vnbVar2;
        uj3 uj3Var = this.a;
        v21 v21Var = uj3Var.k4;
        if (v21Var != null) {
            v21Var.b();
            uj3Var.k4 = null;
        }
        Activity parentActivity = uj3Var.getParentActivity();
        vnbVar = ((e) uj3Var).resourceProvider;
        m21 m21Var = new m21(parentActivity, vnbVar);
        l21 l21Var = new l21(m21Var, parentActivity);
        m21Var.b = l21Var;
        l21Var.setWillNotDraw(false);
        m21Var.addView(l21Var, tre.i(32.0f, 32.0f, 8388627, 12.0f, 8.0f, 12.0f, 8.0f));
        de0 de0Var = new de0(parentActivity);
        m21Var.c = de0Var;
        de0Var.setRoundRadius(hl.L(14.0f));
        l21Var.addView(de0Var, tre.e(28, 28, 17));
        in inVar = new in(parentActivity, false, false, false);
        m21Var.d = inVar;
        inVar.setTypeface(Typeface.SANS_SERIF);
        inVar.setTextSize(hl.L(15.0f));
        inVar.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        m21Var.addView(inVar, tre.i(-2.0f, 18.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        m21Var.setTextColor(m21Var.getThemedColor(aob.yj));
        m21Var.setBackground(m21Var.getThemedColor(aob.wj));
        if (z) {
            de0Var.setImageBitmap(uj3Var.h4.r);
        } else {
            de0Var.setImageBitmap(PhotoViewer.q0().B4.n());
        }
        Activity parentActivity2 = uj3Var.getParentActivity();
        vnbVar2 = ((e) uj3Var).resourceProvider;
        t21 t21Var = new t21(vnbVar2, parentActivity2, true);
        t21Var.e(ob6.M0(2131743215, null));
        t21Var.b = new zg3(this, (byte) 6);
        m21Var.setButton(t21Var);
        m21Var.getButton().setVisibility(8);
        inVar.c(ob6.M0(z2 ? 2131742423 : 2131742425, null), true, true);
        v21 b = d31.b0(uj3Var).b(m21Var, -1);
        uj3Var.k4 = b;
        b.s = false;
        b.i(false);
        v21 v21Var2 = uj3Var.k4;
        v21Var2.t = true;
        v21Var2.j();
    }

    @Override // yn5
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z, final TLRPC.VideoSize videoSize) {
        hl.c3(new Runnable() { // from class: ej3
            @Override // java.lang.Runnable
            public final void run() {
                a aVar;
                fj3 fj3Var = fj3.this;
                uj3 uj3Var = fj3Var.a;
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                TLRPC.VideoSize videoSize2 = videoSize;
                if (inputFile3 == null && inputFile4 == null && videoSize2 == null) {
                    uj3Var.i4 = photoSize2.location;
                    uj3Var.j4 = photoSize.location;
                } else {
                    if (uj3Var.i4 == null) {
                        return;
                    }
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i | 6;
                    }
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    uj3Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new vi1(fj3Var, str, z, (byte) 2));
                }
                aVar = ((e) uj3Var).actionBar;
                aVar.u().requestLayout();
            }
        });
    }

    @Override // yn5
    public final boolean f() {
        return true;
    }

    @Override // yn5
    public final fd8 getCloseIntoObject() {
        uj3 uj3Var = this.a;
        v21 v21Var = uj3Var.k4;
        if (v21Var == null) {
            return null;
        }
        m21 m21Var = (m21) v21Var.e;
        fd8 fd8Var = new fd8();
        int[] iArr = new int[2];
        de0 de0Var = m21Var.c;
        de0 de0Var2 = m21Var.c;
        de0Var.getLocationInWindow(iArr);
        fd8Var.b = iArr[0];
        fd8Var.c = iArr[1];
        fd8Var.d = uj3Var.fragmentView;
        ImageReceiver imageReceiver = de0Var2.getImageReceiver();
        fd8Var.a = imageReceiver;
        fd8Var.e = imageReceiver.p();
        fd8Var.i = 0;
        fd8Var.h = fd8Var.a.X0;
        fd8Var.k = de0Var2.getScaleX();
        return fd8Var;
    }

    @Override // yn5
    public final String getInitialSearchString() {
        return null;
    }

    @Override // yn5
    public final boolean x() {
        return true;
    }

    @Override // yn5
    public final void T() {
    }
}
