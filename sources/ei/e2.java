package ei;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import b8.mf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.nt;
import org.telegram.ui.Components.qh;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.e90;
import org.telegram.ui.fq0;
import org.telegram.ui.mq0;
import org.telegram.ui.s51;
import org.telegram.ui.sm0;
import org.telegram.ui.tm0;
import org.telegram.ui.tp0;
import org.telegram.ui.vm0;
import org.telegram.ui.wm;
import org.telegram.ui.wo0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e2(int i3, Object obj, boolean z10) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        se seVar;
        int i3 = 2;
        int i10 = 1;
        switch (this.a) {
            case 0:
                j4 j4Var = (j4) this.c;
                boolean z10 = this.b;
                boolean z11 = !z10;
                hp s12 = hp.s1(j4Var.m2);
                if (s12.p6 != z11) {
                    SharedPreferences.Editor edit = s12.e7.edit();
                    s12.p6 = z11;
                    edit.putBoolean("storyQualityFull", z11).apply();
                    s12.getNotificationCenter().k(hs.m3, new Object[0]);
                }
                new fc(j4Var.M0, j4Var.l0).I(R.raw.chats_infotip, bd.M0(!z10 ? 2131744517 : 2131744520, null), bd.M0(!z10 ? 2131744518 : 2131744521, null)).j();
                b4 b4Var = j4Var.d1;
                if (b4Var != null) {
                    b4Var.a();
                    break;
                }
                break;
            case 1:
                b4 b4Var2 = (b4) this.c;
                boolean z12 = this.b;
                g1 g1Var = g1.X;
                if (g1Var != null) {
                    boolean z13 = !z12;
                    if (g1Var.n && g1Var.r != z13) {
                        g1Var.r = z13;
                        NativeInstance nativeInstance = g1Var.F;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z13);
                        }
                    }
                }
                b4 b4Var3 = b4Var2.x.d1;
                if (b4Var3 != null) {
                    b4Var3.a();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.c;
                boolean z14 = this.b;
                if (q0Var.x() && z14) {
                    if (!q0Var.U) {
                        q0Var.U = true;
                        q0Var.q();
                    }
                }
                org.telegram.ui.ActionBar.x xVar = q0Var.c;
                if (xVar != null) {
                    xVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    org.telegram.ui.ActionBar.l0 l0Var = q0Var.Q;
                    if (l0Var != null) {
                        l0Var.i(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 3:
                s51 s51Var = (s51) this.c;
                boolean z15 = this.b;
                for (int i11 = 0; i11 < 2; i11++) {
                    org.telegram.ui.Cells.v0 v0Var = ((org.telegram.ui.Cells.v0[]) s51Var.b)[i11];
                    ((org.telegram.ui.Cells.u0) v0Var.d).a(v0Var == view, true);
                }
                az.p1 = z15;
                SharedPreferences.Editor edit2 = hp.e1().edit();
                edit2.putBoolean("useThreeLinesLayout", az.p1);
                edit2.apply();
                hs.e().k(3, Boolean.TRUE);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                boolean z16 = this.b;
                yc ycVar = chatActivityEnterView.G4;
                chatActivityEnterView.N0 = System.currentTimeMillis();
                boolean R0 = chatActivityEnterView.R0();
                if (!z16 && (seVar = chatActivityEnterView.M0) != null) {
                    seVar.g(!R0);
                    chatActivityEnterView.M0 = null;
                    break;
                } else {
                    chatActivityEnterView.F4 = !R0;
                    org.telegram.messenger.g0.r(ycVar);
                    org.telegram.messenger.g0.i3(ycVar, 500L);
                    break;
                }
                break;
            case 5:
                bi biVar = (bi) this.c;
                boolean z17 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
                if (biVar.L2 != 0) {
                    biVar.U3.r0();
                    biVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    vm0 vm0Var = new vm0(hashMap, arrayList, 0, true, (wm) d2Var);
                    qh qhVar = new qh(biVar, hashMap, arrayList);
                    sm0 sm0Var = vm0Var.a;
                    sm0Var.t0 = qhVar;
                    sm0 sm0Var2 = vm0Var.b;
                    sm0Var2.t0 = qhVar;
                    sm0Var.u0 = new tm0(vm0Var, i10);
                    sm0Var2.u0 = new tm0(vm0Var, i3);
                    int i12 = biVar.N3;
                    boolean z18 = biVar.O3;
                    sm0Var.k0(i12, z18);
                    vm0Var.b.k0(i12, z18);
                    if (z17) {
                        d2Var.showAsSheet(vm0Var);
                    } else {
                        d2Var.presentFragment(vm0Var);
                    }
                    biVar.dismiss();
                    break;
                }
            case 6:
                ie0 ie0Var = (ie0) this.c;
                boolean z19 = this.b;
                ie0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z20 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z19 && (!z20 || !LaunchActivity.I1)) {
                    LaunchActivity.J1 = new nt(0, view);
                    Context context = org.telegram.messenger.t0.b;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(TLObject.FLAG_28);
                    context.startActivity(intent);
                    break;
                } else {
                    ut utVar = ie0Var.V;
                    if (utVar != null) {
                        utVar.J0();
                        break;
                    } else {
                        PhotoViewer photoViewer = ie0Var.W;
                        if (photoViewer != null && photoViewer.K3) {
                            if (PhotoViewer.b9 != null) {
                                PhotoViewer.b9.H0(false, true);
                            }
                            tp0 tp0Var = photoViewer.g0;
                            if (tp0Var != null && tp0Var.f != null) {
                                if (org.telegram.messenger.t0.x) {
                                    try {
                                        tp0Var.getContext().startService(new Intent(org.telegram.messenger.t0.b, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th2) {
                                        org.telegram.messenger.a8.g(th2, true);
                                    }
                                }
                                tp0Var.h.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) tp0Var.f.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(tp0Var.f);
                                }
                                tp0Var.addView(tp0Var.f, 0, mf.e(-1, -1, 51));
                                ie0.b(false);
                            }
                            PhotoViewer.b9 = PhotoViewer.c9;
                            PhotoViewer.c9 = null;
                            if (photoViewer.g0 == null) {
                                photoViewer.M3 = true;
                                Bitmap bitmap = photoViewer.D3;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    photoViewer.D3 = null;
                                }
                                photoViewer.G3 = true;
                            }
                            photoViewer.K3 = false;
                            View view2 = photoViewer.E2 ? photoViewer.D2 : photoViewer.C2;
                            if (photoViewer.g0 == null && view2 != null) {
                                org.telegram.messenger.g0.E2(view2);
                                view2.setVisibility(4);
                                photoViewer.z2.addView(view2);
                            }
                            if (org.telegram.messenger.t0.x) {
                                try {
                                    photoViewer.E.startService(new Intent(org.telegram.messenger.t0.b, (Class<?>) BringAppForegroundService.class));
                                } catch (Throwable th3) {
                                    org.telegram.messenger.a8.g(th3, true);
                                }
                            }
                            if (photoViewer.g0 != null) {
                                photoViewer.n6 = 0.0f;
                            } else if (view2 != null) {
                                photoViewer.C3 = true;
                                ni0 j10 = ie0.j(false, photoViewer.z2.getAspectRatio());
                                float f10 = j10.c / photoViewer.y3.getLayoutParams().width;
                                photoViewer.y3.setScaleX(f10);
                                photoViewer.y3.setScaleY(f10);
                                photoViewer.y3.setTranslationX(j10.a);
                                photoViewer.y3.setTranslationY(j10.b);
                                view2.setScaleX(f10);
                                view2.setScaleY(f10);
                                view2.setTranslationX(j10.a - photoViewer.z2.getX());
                                view2.setTranslationY(j10.b - photoViewer.z2.getY());
                                fq0 fq0Var = photoViewer.F2;
                                if (fq0Var != null) {
                                    fq0Var.setScaleX(f10);
                                    photoViewer.F2.setScaleY(f10);
                                    photoViewer.F2.setTranslationX(view2.getTranslationX());
                                    photoViewer.F2.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.X = 0.0f;
                                wo0 wo0Var = new wo0(photoViewer, f10, 1);
                                view2.setOutlineProvider(wo0Var);
                                view2.setClipToOutline(true);
                                photoViewer.y3.setOutlineProvider(wo0Var);
                                photoViewer.y3.setClipToOutline(true);
                                fq0 fq0Var2 = photoViewer.F2;
                                if (fq0Var2 != null) {
                                    fq0Var2.setOutlineProvider(wo0Var);
                                    photoViewer.F2.setClipToOutline(true);
                                }
                            } else {
                                ie0.b(true);
                            }
                            try {
                                photoViewer.e = true;
                                photoViewer.f = true;
                                ((WindowManager) photoViewer.E.getSystemService("window")).addView(photoViewer.h0, photoViewer.e0);
                                Activity activity = photoViewer.E;
                                if (activity instanceof LaunchActivity) {
                                    ((LaunchActivity) activity).c1.add(photoViewer.t1);
                                }
                                mq0 mq0Var = photoViewer.e5;
                                if (mq0Var != null && !mq0Var.s) {
                                    mq0Var.a.O0(false, false);
                                }
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                            if (photoViewer.E2) {
                                k2.i0 i0Var = photoViewer.G2.d;
                                if (i0Var != null) {
                                    i0Var.z1(null);
                                }
                                photoViewer.G2.z0(photoViewer.D2);
                                photoViewer.D2.setVisibility(4);
                                photoViewer.H3 = 2;
                                photoViewer.G3 = false;
                                photoViewer.f0.invalidate();
                                photoViewer.w3 = 4;
                                break;
                            } else {
                                photoViewer.w3 = 4;
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                e90 e90Var = (e90) this.c;
                if (!this.b) {
                    org.telegram.ui.Cells.q8 q8Var = e90Var.n;
                    if (q8Var == null || !q8Var.e.h) {
                        org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                        boolean z21 = q8Var2.e.h;
                        q8Var2.setChecked(!z21);
                        e90Var.e0(z21);
                        org.telegram.ui.Cells.q8 q8Var3 = e90Var.n;
                        if (q8Var3 != null) {
                            if (q8Var2.e.h) {
                                q8Var3.setChecked(false);
                                e90Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                e90Var.r.setVisibility(8);
                                break;
                            } else if (e90Var.e == null) {
                                q8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i13 = -e90Var.N;
                        e90Var.N = i13;
                        org.telegram.messenger.g0.G3(i13, q8Var, null);
                        break;
                    }
                }
                break;
        }
    }
}
