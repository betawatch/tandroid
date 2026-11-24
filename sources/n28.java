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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class n28 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n28(oo8 oo8Var, IOException iOException, boolean z) {
        this.a = (byte) 20;
        this.c = oo8Var;
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
                ((p28) this.c).e.q0.J.E(1 - (this.b ? 1 : 0));
                break;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                boolean z2 = this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (!z2) {
                    photoViewer.W0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                boolean z3 = this.b;
                RectF rectF = ProfileActivity.e7;
                profileActivity.c4(z3, true);
                break;
            case 3:
                ((FrameLayout) this.c).setVisibility(this.b ? 4 : 0);
                break;
            case 4:
                l11.u(((lq8) this.c).e.getParentActivity(), jb6.M0(this.b ? 2131746437 : 2131746439, null));
                break;
            case 5:
                qi9 qi9Var = (qi9) this.c;
                uj9 uj9Var = qi9Var.a;
                boolean z4 = !this.b;
                TLObject tLObject = qi9Var.H;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z4;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z4;
                }
                View view = uj9Var.Q;
                if (view != null) {
                    qi9Var.r.a = view;
                }
                qi9Var.r.f(-1, z4, true);
                View view2 = uj9Var.Q;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 6:
                ((al9) this.c).p0(this.b ? "shown after a change away" : "shown, height differs", false);
                break;
            case 7:
                bm9 bm9Var = (bm9) this.c;
                boolean z5 = this.b;
                bm9Var.O = z5;
                bm9Var.P = bm9Var.E();
                bm9Var.Q = 0;
                bm9Var.R = 0;
                bm9Var.j.b("torch requested: enabled=" + z5 + ", available=" + bm9Var.E() + ", cameraId=" + bm9Var.o + ", facing=" + bm9Var.F);
                bm9Var.a();
                break;
            case 8:
                op9 op9Var = (op9) this.c;
                op9Var.P.X = this.b ? 1.0f : 0.0f;
                op9Var.L = true;
                op9Var.requestLayout();
                break;
            case 9:
                bq9 bq9Var = (bq9) this.c;
                boolean z6 = this.b;
                w01 w01Var = bq9Var.e;
                boolean z7 = !z6;
                w01Var.getClass();
                w01Var.y = z7;
                break;
            case 10:
                ((ju9) this.c).H.presentFragment(new PremiumPreviewFragment(0, this.b ? "upload_speed" : "download_speed"));
                break;
            case 11:
                q0a q0aVar = (q0a) this.c;
                if (!this.b) {
                    q0aVar.setVisibility(8);
                    break;
                }
                break;
            case 12:
                nha nhaVar = (nha) this.c;
                if (!this.b) {
                    nhaVar.p0.setVisibility(8);
                    break;
                }
                break;
            case 13:
                lea leaVar = (lea) this.c;
                if (!this.b) {
                    leaVar.W.t0.setVisibility(8);
                    break;
                }
                break;
            case 14:
                oea oeaVar = (oea) this.c;
                if (!this.b) {
                    oeaVar.x.t0.setVisibility(8);
                    break;
                }
                break;
            case 15:
                ela elaVar = (ela) this.c;
                boolean z8 = this.b;
                ArrayList arrayList = elaVar.r;
                dla dlaVar = elaVar.n;
                if (dlaVar != null) {
                    dlaVar.L(elaVar.f, z8);
                }
                while (r7 < arrayList.size()) {
                    ((dla) arrayList.get(r7)).L(elaVar.f, z8);
                    r7++;
                }
                break;
            case 16:
                fla flaVar = (fla) this.c;
                boolean z9 = this.b;
                ArrayList arrayList2 = flaVar.r;
                dla dlaVar2 = flaVar.n;
                if (dlaVar2 != null) {
                    dlaVar2.L(flaVar.o0, z9);
                }
                while (r7 < arrayList2.size()) {
                    ((dla) arrayList2.get(r7)).L(flaVar.o0, z9);
                    r7++;
                }
                break;
            case 17:
                kpa kpaVar = (kpa) this.c;
                if (!this.b) {
                    kpaVar.l2.setVisibility(8);
                    break;
                }
                break;
            case 18:
                wsa wsaVar = (wsa) this.c;
                wsaVar.u2(wsaVar.h3, gm.S2(jb6.a0(null, null, this.b ? 2131750357 : 2131750354, wsaVar.s1())), true);
                break;
            case 19:
                fra fraVar = (fra) this.c;
                boolean z10 = this.b;
                wsa wsaVar2 = fraVar.W;
                TL_stars.SavedStarGift x1 = wsaVar2.x1(z10);
                if (x1 != null) {
                    wsaVar2.Z2 = true;
                    wsaVar2.n2(x1, wsaVar2.B2);
                } else {
                    TL_stars.TL_starGiftUnique y1 = wsaVar2.y1(z10);
                    if (y1 != null) {
                        wsaVar2.Z2 = true;
                        wsaVar2.m2(y1.slug, y1, wsaVar2.B2);
                    }
                }
                wsaVar2.P2 = -1;
                u31 u31Var = u31.x;
                if (u31Var != null) {
                    u31Var.c(0L, false);
                    break;
                }
                break;
            case 20:
                oo8 oo8Var = (oo8) this.c;
                boolean z11 = this.b;
                k44 k44Var = (k44) ((dx8) oo8Var.b).f;
                k44Var.getClass();
                rg5 rg5Var = (rg5) k44Var.b;
                jte.p(rg5Var.k);
                if (z11 && rg5Var.m == null) {
                    rg5Var.f();
                    break;
                }
                break;
            case 21:
                z8b z8bVar = (z8b) this.c;
                if (!this.b) {
                    z8bVar.u2.k1.setVisibility(8);
                    break;
                }
                break;
            case 22:
                krb krbVar = (krb) this.c;
                boolean z12 = this.b;
                gm.c3(new drb(krbVar, r6 ? (byte) 1 : (byte) 0));
                rc2 rc2Var = krbVar.L;
                if (rc2Var != null) {
                    rc2Var.setVisibility(0);
                    if (!z12) {
                        rc2 rc2Var2 = krbVar.L;
                        int e2 = rc2Var2.e2(krbVar.P);
                        irb irbVar = krbVar.J;
                        CheckBoxBase[] checkBoxBaseArr2 = rc2Var2.f7;
                        if (checkBoxBaseArr2 != null && e2 >= 0 && e2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[e2]) != null && irbVar != null && (checkBoxBaseArr = irbVar.f7) != null && e2 >= 0 && e2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[e2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    rc2 rc2Var3 = krbVar.L;
                    rc2Var3.c6 = -1;
                    rc2Var3.invalidate();
                }
                ru1 ru1Var = krbVar.d0;
                if (ru1Var != null) {
                    gm.c3(ru1Var);
                    krbVar.d0 = null;
                    break;
                }
                break;
            case 23:
                ((jac) this.c).a(null, Boolean.valueOf(this.b));
                break;
            case 24:
                ((l7c) this.c).Q(this.b);
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
                    cyc cycVar = zVar.R;
                    if (cycVar != null) {
                        if (!z13) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - cycVar.C > 60000) {
                                cycVar.C = elapsedRealtime;
                                cycVar.B = 0;
                            }
                            if (cycVar.n) {
                                int i = cycVar.B;
                                cycVar.B = i + 1;
                                break;
                            }
                            z = false;
                            cycVar.n();
                            if (cycVar.d != null) {
                                f8e.j(cycVar, z);
                            } else if (z) {
                                cycVar.a();
                            }
                            if (!z) {
                                cycVar.g("Widget engine stopped");
                                break;
                            }
                        } else {
                            if (cycVar.n && cycVar.m && !cycVar.o) {
                                r7 = 1;
                            }
                            cycVar.n();
                            if (r7 != 0) {
                                if (cycVar.d == null) {
                                    cycVar.a();
                                    break;
                                } else {
                                    f8e.j(cycVar, true);
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
    public /* synthetic */ n28(p28 p28Var, int i) {
        this.a = (byte) 0;
        this.c = p28Var;
        this.b = i;
    }

    public /* synthetic */ n28(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }
}
