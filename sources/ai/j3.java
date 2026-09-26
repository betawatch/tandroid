package ai;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.au0;
import org.telegram.ui.mu0;
import org.telegram.ui.pg0;
import org.telegram.ui.qg0;
import org.telegram.ui.rb0;
import org.telegram.ui.tq0;
import org.telegram.ui.ub1;
import org.telegram.ui.vu0;
import org.telegram.ui.wn;
import org.telegram.ui.xq0;
import org.telegram.ui.yq0;
import org.telegram.ui.zs0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j3(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nf nfVar;
        switch (this.a) {
            case 0:
                e6 e6Var = (e6) this.c;
                boolean z10 = this.b;
                MessagesController.getInstance(e6Var.C2).setStoryQuality(!z10);
                new xc(e6Var.c1, e6Var.B0).M(LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage), R.raw.chats_infotip).j();
                v5 v5Var = e6Var.t1;
                if (v5Var != null) {
                    v5Var.a();
                    break;
                }
                break;
            case 1:
                v5 v5Var2 = (v5) this.c;
                boolean z11 = this.b;
                d2 d2Var = d2.W;
                if (d2Var != null) {
                    boolean z12 = !z11;
                    if (d2Var.n && d2Var.r != z12) {
                        d2Var.r = z12;
                        NativeInstance nativeInstance = d2Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z12);
                        }
                    }
                }
                v5 v5Var3 = v5Var2.l.t1;
                if (v5Var3 != null) {
                    v5Var3.a();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.c;
                boolean z13 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var = u0Var.d;
                if (m1Var != null && m1Var.isShowing() && z13) {
                    if (!u0Var.T) {
                        u0Var.T = true;
                        u0Var.d.d(u0Var.R);
                    }
                }
                org.telegram.ui.ActionBar.y yVar = u0Var.c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    org.telegram.ui.ActionBar.q0 q0Var = u0Var.P;
                    if (q0Var != null) {
                        q0Var.m(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 3:
                ub1 ub1Var = (ub1) this.c;
                boolean z14 = this.b;
                for (int i10 = 0; i10 < 2; i10++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) ub1Var.b)[i10];
                    y0Var.a.a(y0Var == view, true);
                }
                SharedConfig.setUseThreeLinesLayout(z14);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                boolean z15 = this.b;
                td tdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z15 && (nfVar = chatActivityEnterView.L0) != null) {
                    nfVar.h(!S0);
                    chatActivityEnterView.L0 = null;
                    break;
                } else {
                    chatActivityEnterView.E4 = !S0;
                    AndroidUtilities.cancelRunOnUIThread(tdVar);
                    AndroidUtilities.runOnUIThread(tdVar, 500L);
                    break;
                }
            case 5:
                wi wiVar = (wi) this.c;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.m2 m2Var = wiVar.f0;
                if (wiVar.Q0 != 0) {
                    wiVar.Z1.u0();
                    wiVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    yq0 yq0Var = new yq0(hashMap, arrayList, 0, true, (wn) m2Var);
                    vh vhVar = new vh(wiVar, hashMap, arrayList);
                    tq0 tq0Var = yq0Var.a;
                    tq0Var.s0 = vhVar;
                    tq0 tq0Var2 = yq0Var.b;
                    tq0Var2.s0 = vhVar;
                    tq0Var.t0 = new xq0(yq0Var, 0);
                    tq0Var2.t0 = new xq0(yq0Var, 1);
                    int i11 = wiVar.S1;
                    boolean z17 = wiVar.T1;
                    tq0Var.f0(i11, z17);
                    yq0Var.b.f0(i11, z17);
                    if (z16) {
                        m2Var.showAsSheet(yq0Var);
                    } else {
                        m2Var.presentFragment(yq0Var);
                    }
                    wiVar.dismiss();
                    break;
                }
            case 6:
                og0 og0Var = (og0) this.c;
                boolean z18 = this.b;
                og0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z19 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z18 && (!z19 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new ou(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(TLObject.FLAG_28);
                    context.startActivity(intent);
                    break;
                } else {
                    wu wuVar = og0Var.U;
                    if (wuVar != null) {
                        wuVar.I();
                        break;
                    } else {
                        PhotoViewer photoViewer = og0Var.V;
                        if (photoViewer != null && photoViewer.J3) {
                            if (PhotoViewer.a9 != null) {
                                PhotoViewer.a9.G0(false, true);
                            }
                            au0 au0Var = photoViewer.f0;
                            if (au0Var != null && au0Var.f != null) {
                                if (ApplicationLoader.mainInterfacePaused) {
                                    try {
                                        au0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th2) {
                                        FileLog.e(th2);
                                    }
                                }
                                au0Var.h.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) au0Var.f.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(au0Var.f);
                                }
                                au0Var.addView(au0Var.f, 0, w7.y5.e(-1, -1, 51));
                                og0.j(false);
                            }
                            PhotoViewer.a9 = PhotoViewer.b9;
                            PhotoViewer.b9 = null;
                            if (photoViewer.f0 == null) {
                                photoViewer.L3 = true;
                                Bitmap bitmap = photoViewer.C3;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    photoViewer.C3 = null;
                                }
                                photoViewer.F3 = true;
                            }
                            photoViewer.J3 = false;
                            View view2 = photoViewer.D2 ? photoViewer.C2 : photoViewer.B2;
                            if (photoViewer.f0 == null && view2 != null) {
                                AndroidUtilities.removeFromParent(view2);
                                view2.setVisibility(4);
                                photoViewer.y2.addView(view2);
                            }
                            if (ApplicationLoader.mainInterfacePaused) {
                                try {
                                    photoViewer.y.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                }
                            }
                            if (photoViewer.f0 != null) {
                                photoViewer.m6 = 0.0f;
                            } else if (view2 != null) {
                                photoViewer.B3 = true;
                                sk0 o9 = og0.o(photoViewer.y2.getAspectRatio(), false);
                                float f7 = o9.c / photoViewer.x3.getLayoutParams().width;
                                photoViewer.x3.setScaleX(f7);
                                photoViewer.x3.setScaleY(f7);
                                photoViewer.x3.setTranslationX(o9.a);
                                photoViewer.x3.setTranslationY(o9.b);
                                view2.setScaleX(f7);
                                view2.setScaleY(f7);
                                view2.setTranslationX(o9.a - photoViewer.y2.getX());
                                view2.setTranslationY(o9.b - photoViewer.y2.getY());
                                mu0 mu0Var = photoViewer.E2;
                                if (mu0Var != null) {
                                    mu0Var.setScaleX(f7);
                                    photoViewer.E2.setScaleY(f7);
                                    photoViewer.E2.setTranslationX(view2.getTranslationX());
                                    photoViewer.E2.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.W = 0.0f;
                                zs0 zs0Var = new zs0(photoViewer, f7, 1);
                                view2.setOutlineProvider(zs0Var);
                                view2.setClipToOutline(true);
                                photoViewer.x3.setOutlineProvider(zs0Var);
                                photoViewer.x3.setClipToOutline(true);
                                mu0 mu0Var2 = photoViewer.E2;
                                if (mu0Var2 != null) {
                                    mu0Var2.setOutlineProvider(zs0Var);
                                    photoViewer.E2.setClipToOutline(true);
                                }
                            } else {
                                og0.j(true);
                            }
                            try {
                                photoViewer.e = true;
                                photoViewer.f = true;
                                ((WindowManager) photoViewer.y.getSystemService("window")).addView(photoViewer.g0, photoViewer.d0);
                                Activity activity = photoViewer.y;
                                if (activity instanceof LaunchActivity) {
                                    ((LaunchActivity) activity).a1.add(photoViewer.s1);
                                }
                                vu0 vu0Var = photoViewer.d5;
                                if (vu0Var != null && !vu0Var.s) {
                                    vu0Var.a.setVisible(false, false);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            if (photoViewer.D2) {
                                i2.f0 f0Var = photoViewer.F2.d;
                                if (f0Var != null) {
                                    f0Var.v1(null);
                                }
                                photoViewer.F2.U(photoViewer.C2);
                                photoViewer.C2.setVisibility(4);
                                photoViewer.G3 = 2;
                                photoViewer.F3 = false;
                                photoViewer.e0.invalidate();
                                photoViewer.v3 = 4;
                                break;
                            } else {
                                photoViewer.v3 = 4;
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                rb0 rb0Var = (rb0) this.c;
                if (!this.b) {
                    org.telegram.ui.Cells.w8 w8Var = rb0Var.n;
                    if (w8Var == null || !w8Var.e.h) {
                        org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                        boolean z20 = w8Var2.e.h;
                        w8Var2.setChecked(!z20);
                        rb0Var.Z(z20);
                        org.telegram.ui.Cells.w8 w8Var3 = rb0Var.n;
                        if (w8Var3 != null) {
                            if (w8Var2.e.h) {
                                w8Var3.setChecked(false);
                                rb0Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                rb0Var.r.setVisibility(8);
                                break;
                            } else if (rb0Var.e == null) {
                                w8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i12 = -rb0Var.N;
                        rb0Var.N = i12;
                        AndroidUtilities.shakeViewSpring(w8Var, i12);
                        break;
                    }
                }
                break;
            default:
                pg0 pg0Var = (pg0) this.c;
                boolean z21 = this.b;
                qg0 qg0Var = pg0Var.V;
                if (qg0Var.getParentActivity() != null) {
                    boolean z22 = !qg0Var.E;
                    qg0Var.E = z22;
                    ((org.telegram.ui.Cells.a2) view).c(z22, true);
                    if ((z21 && qg0Var.getConnectionsManager().isTestBackend()) != qg0Var.E) {
                        qg0Var.getConnectionsManager().switchBackend(false);
                    }
                    pg0Var.s();
                    break;
                }
                break;
        }
    }
}
