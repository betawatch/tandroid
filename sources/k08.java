// default package

import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class k08 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k08(v39 v39Var, IOException iOException, boolean z) {
        this.a = (byte) 20;
        this.c = v39Var;
        this.b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (r10 >= 2) goto L31;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        boolean z = true;
        switch (this.a) {
            case 0:
                ((m08) this.c).e.q0.J.E(1 - (this.b ? 1 : 0));
                break;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z2 = this.b;
                Drawable[] drawableArr = PhotoViewer.f9;
                if (!z2) {
                    photoViewer.W0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                boolean z3 = this.b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.Y3(z3, true);
                break;
            case 3:
                ((FrameLayout) this.c).setVisibility(this.b ? 4 : 0);
                break;
            case 4:
                d01.t(((ko8) this.c).e.getParentActivity(), k96.M0(this.b ? 2131746511 : 2131746513, null));
                break;
            case 5:
                mg9 mg9Var = (mg9) this.c;
                rh9 rh9Var = mg9Var.a;
                boolean z4 = !this.b;
                TLObject tLObject = mg9Var.H;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z4;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z4;
                }
                View view = rh9Var.Q;
                if (view != null) {
                    mg9Var.r.a = view;
                }
                mg9Var.r.f(-1, z4, true);
                View view2 = rh9Var.Q;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 6:
                ((zi9) this.c).q0(this.b ? "shown after a change away" : "shown, height differs", false);
                break;
            case 7:
                ak9 ak9Var = (ak9) this.c;
                boolean z5 = this.b;
                ak9Var.O = z5;
                ak9Var.P = ak9Var.E();
                ak9Var.Q = 0;
                ak9Var.R = 0;
                ak9Var.j.b("torch requested: enabled=" + z5 + ", available=" + ak9Var.E() + ", cameraId=" + ak9Var.o + ", facing=" + ak9Var.F);
                ak9Var.a();
                break;
            case 8:
                nn9 nn9Var = (nn9) this.c;
                nn9Var.P.X = this.b ? 1.0f : 0.0f;
                nn9Var.L = true;
                nn9Var.requestLayout();
                break;
            case 9:
                ao9 ao9Var = (ao9) this.c;
                boolean z6 = this.b;
                pz0 pz0Var = ao9Var.e;
                boolean z7 = !z6;
                pz0Var.getClass();
                pz0Var.y = z7;
                break;
            case 10:
                ((hs9) this.c).H.presentFragment(new PremiumPreviewFragment(0, this.b ? "upload_speed" : "download_speed"));
                break;
            case 11:
                oy9 oy9Var = (oy9) this.c;
                if (!this.b) {
                    oy9Var.setVisibility(8);
                    break;
                }
                break;
            case 12:
                nfa nfaVar = (nfa) this.c;
                if (!this.b) {
                    nfaVar.p0.setVisibility(8);
                    break;
                }
                break;
            case 13:
                lca lcaVar = (lca) this.c;
                if (!this.b) {
                    lcaVar.W.t0.setVisibility(8);
                    break;
                }
                break;
            case 14:
                oca ocaVar = (oca) this.c;
                if (!this.b) {
                    ocaVar.x.t0.setVisibility(8);
                    break;
                }
                break;
            case 15:
                cja cjaVar = (cja) this.c;
                boolean z8 = this.b;
                ArrayList arrayList = cjaVar.r;
                bja bjaVar = cjaVar.n;
                if (bjaVar != null) {
                    bjaVar.L(cjaVar.f, z8);
                }
                while (r7 < arrayList.size()) {
                    ((bja) arrayList.get(r7)).L(cjaVar.f, z8);
                    r7++;
                }
                break;
            case 16:
                dja djaVar = (dja) this.c;
                boolean z9 = this.b;
                ArrayList arrayList2 = djaVar.r;
                bja bjaVar2 = djaVar.n;
                if (bjaVar2 != null) {
                    bjaVar2.L(djaVar.o0, z9);
                }
                while (r7 < arrayList2.size()) {
                    ((bja) arrayList2.get(r7)).L(djaVar.o0, z9);
                    r7++;
                }
                break;
            case 17:
                kna knaVar = (kna) this.c;
                if (!this.b) {
                    knaVar.l2.setVisibility(8);
                    break;
                }
                break;
            case 18:
                vqa vqaVar = (vqa) this.c;
                vqaVar.u2(vqaVar.h3, gl.T2(k96.a0(null, null, this.b ? 2131750408 : 2131750405, vqaVar.s1())), true);
                break;
            case 19:
                fpa fpaVar = (fpa) this.c;
                boolean z10 = this.b;
                vqa vqaVar2 = fpaVar.W;
                TL_stars.SavedStarGift x1 = vqaVar2.x1(z10);
                if (x1 != null) {
                    vqaVar2.Z2 = true;
                    vqaVar2.n2(x1, vqaVar2.B2);
                } else {
                    TL_stars.TL_starGiftUnique y1 = vqaVar2.y1(z10);
                    if (y1 != null) {
                        vqaVar2.Z2 = true;
                        vqaVar2.m2(y1.slug, y1, vqaVar2.B2);
                    }
                }
                vqaVar2.P2 = -1;
                m21 m21Var = m21.w;
                if (m21Var != null) {
                    m21Var.c(0L, false);
                    break;
                }
                break;
            case 20:
                v39 v39Var = (v39) this.c;
                boolean z11 = this.b;
                pj4 pj4Var = (pj4) ((cv8) v39Var.b).f;
                pj4Var.getClass();
                se5 se5Var = (se5) pj4Var.b;
                gre.p(se5Var.k);
                if (z11 && se5Var.m == null) {
                    se5Var.f();
                    break;
                }
                break;
            case 21:
                x6b x6bVar = (x6b) this.c;
                if (!this.b) {
                    x6bVar.u2.k1.setVisibility(8);
                    break;
                }
                break;
            case 22:
                jpb jpbVar = (jpb) this.c;
                boolean z12 = this.b;
                gl.d3(new cpb(jpbVar, r6 ? (byte) 1 : (byte) 0));
                gb2 gb2Var = jpbVar.L;
                if (gb2Var != null) {
                    gb2Var.setVisibility(0);
                    if (!z12) {
                        gb2 gb2Var2 = jpbVar.L;
                        int e2 = gb2Var2.e2(jpbVar.P);
                        hpb hpbVar = jpbVar.J;
                        CheckBoxBase[] checkBoxBaseArr2 = gb2Var2.f7;
                        if (checkBoxBaseArr2 != null && e2 >= 0 && e2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[e2]) != null && hpbVar != null && (checkBoxBaseArr = hpbVar.f7) != null && e2 >= 0 && e2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[e2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    gb2 gb2Var3 = jpbVar.L;
                    gb2Var3.c6 = -1;
                    gb2Var3.invalidate();
                }
                ft1 ft1Var = jpbVar.d0;
                if (ft1Var != null) {
                    gl.d3(ft1Var);
                    jpbVar.d0 = null;
                    break;
                }
                break;
            case 23:
                ((i8c) this.c).a(null, Boolean.valueOf(this.b));
                break;
            case 24:
                ((l5c) this.c).Q(this.b);
                break;
            case 25:
                ((VideoCapturerDevice) this.c).lambda$new$0(this.b);
                break;
            case 26:
                ((VoIPService) this.c).lambda$startGroupCall$30(this.b);
                break;
            case 27:
                ((AudioManager) this.c).setSpeakerphoneOn(this.b);
                break;
            case 28:
                ((View) this.c).setVisibility(this.b ? 0 : 8);
                break;
            default:
                z zVar = (z) this.c;
                boolean z13 = this.b;
                if (!zVar.A && zVar.v != 0) {
                    zVar.v = 0L;
                    zVar.o.set(false);
                    zVar.U = "Widget engine stopped";
                    bwc bwcVar = zVar.R;
                    if (bwcVar != null) {
                        if (!z13) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - bwcVar.C > 60000) {
                                bwcVar.C = elapsedRealtime;
                                bwcVar.B = 0;
                            }
                            if (bwcVar.n) {
                                int i = bwcVar.B;
                                bwcVar.B = i + 1;
                                break;
                            }
                            z = false;
                            bwcVar.m();
                            if (bwcVar.d != null) {
                                c6e.j(bwcVar, z);
                            } else if (z) {
                                bwcVar.a();
                            }
                            if (!z) {
                                bwcVar.f("Widget engine stopped");
                                break;
                            }
                        } else {
                            if (bwcVar.n && bwcVar.m && !bwcVar.o) {
                                r7 = 1;
                            }
                            bwcVar.m();
                            if (r7 != 0) {
                                if (bwcVar.d == null) {
                                    bwcVar.a();
                                    break;
                                } else {
                                    c6e.j(bwcVar, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k08(m08 m08Var, int i) {
        this.a = (byte) 0;
        this.c = m08Var;
        this.b = i;
    }

    public /* synthetic */ k08(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }
}
