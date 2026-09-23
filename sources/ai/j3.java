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
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.sd;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ar0;
import org.telegram.ui.at0;
import org.telegram.ui.bu0;
import org.telegram.ui.nu0;
import org.telegram.ui.qg0;
import org.telegram.ui.rg0;
import org.telegram.ui.sb0;
import org.telegram.ui.ub1;
import org.telegram.ui.uq0;
import org.telegram.ui.wu0;
import org.telegram.ui.xn;
import org.telegram.ui.zq0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        mf mfVar;
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
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.c;
                boolean z13 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = v0Var.d;
                if (n1Var != null && n1Var.isShowing() && z13) {
                    if (!v0Var.T) {
                        v0Var.T = true;
                        v0Var.d.d(v0Var.R);
                    }
                }
                org.telegram.ui.ActionBar.z zVar = v0Var.c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    org.telegram.ui.ActionBar.r0 r0Var = v0Var.P;
                    if (r0Var != null) {
                        r0Var.m(((Integer) view.getTag()).intValue());
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
                sd sdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean T0 = chatActivityEnterView.T0();
                if (!z15 && (mfVar = chatActivityEnterView.L0) != null) {
                    mfVar.h(!T0);
                    chatActivityEnterView.L0 = null;
                    break;
                } else {
                    chatActivityEnterView.E4 = !T0;
                    AndroidUtilities.cancelRunOnUIThread(sdVar);
                    AndroidUtilities.runOnUIThread(sdVar, 500L);
                    break;
                }
            case 5:
                wi wiVar = (wi) this.c;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = wiVar.f0;
                if (wiVar.Q0 != 0) {
                    wiVar.Z1.u0();
                    wiVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    ar0 ar0Var = new ar0(hashMap, arrayList, 0, true, (xn) n2Var);
                    vh vhVar = new vh(wiVar, hashMap, arrayList);
                    uq0 uq0Var = ar0Var.a;
                    uq0Var.s0 = vhVar;
                    uq0 uq0Var2 = ar0Var.b;
                    uq0Var2.s0 = vhVar;
                    uq0Var.t0 = new zq0(ar0Var, 0);
                    uq0Var2.t0 = new zq0(ar0Var, 1);
                    int i11 = wiVar.S1;
                    boolean z17 = wiVar.T1;
                    uq0Var.f0(i11, z17);
                    ar0Var.b.f0(i11, z17);
                    if (z16) {
                        n2Var.showAsSheet(ar0Var);
                    } else {
                        n2Var.presentFragment(ar0Var);
                    }
                    wiVar.dismiss();
                    break;
                }
            case 6:
                eg0 eg0Var = (eg0) this.c;
                boolean z18 = this.b;
                eg0Var.getClass();
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
                    wu wuVar = eg0Var.U;
                    if (wuVar != null) {
                        wuVar.I();
                        break;
                    } else {
                        PhotoViewer photoViewer = eg0Var.V;
                        if (photoViewer != null && photoViewer.J3) {
                            if (PhotoViewer.a9 != null) {
                                PhotoViewer.a9.G0(false, true);
                            }
                            bu0 bu0Var = photoViewer.f0;
                            if (bu0Var != null && bu0Var.f != null) {
                                if (ApplicationLoader.mainInterfacePaused) {
                                    try {
                                        bu0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th2) {
                                        FileLog.e(th2);
                                    }
                                }
                                bu0Var.h.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) bu0Var.f.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(bu0Var.f);
                                }
                                bu0Var.addView(bu0Var.f, 0, w7.x5.e(-1, -1, 51));
                                eg0.j(false);
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
                                ik0 o9 = eg0.o(photoViewer.y2.getAspectRatio(), false);
                                float f7 = o9.c / photoViewer.x3.getLayoutParams().width;
                                photoViewer.x3.setScaleX(f7);
                                photoViewer.x3.setScaleY(f7);
                                photoViewer.x3.setTranslationX(o9.a);
                                photoViewer.x3.setTranslationY(o9.b);
                                view2.setScaleX(f7);
                                view2.setScaleY(f7);
                                view2.setTranslationX(o9.a - photoViewer.y2.getX());
                                view2.setTranslationY(o9.b - photoViewer.y2.getY());
                                nu0 nu0Var = photoViewer.E2;
                                if (nu0Var != null) {
                                    nu0Var.setScaleX(f7);
                                    photoViewer.E2.setScaleY(f7);
                                    photoViewer.E2.setTranslationX(view2.getTranslationX());
                                    photoViewer.E2.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.W = 0.0f;
                                at0 at0Var = new at0(photoViewer, f7, 1);
                                view2.setOutlineProvider(at0Var);
                                view2.setClipToOutline(true);
                                photoViewer.x3.setOutlineProvider(at0Var);
                                photoViewer.x3.setClipToOutline(true);
                                nu0 nu0Var2 = photoViewer.E2;
                                if (nu0Var2 != null) {
                                    nu0Var2.setOutlineProvider(at0Var);
                                    photoViewer.E2.setClipToOutline(true);
                                }
                            } else {
                                eg0.j(true);
                            }
                            try {
                                photoViewer.e = true;
                                photoViewer.f = true;
                                ((WindowManager) photoViewer.y.getSystemService("window")).addView(photoViewer.g0, photoViewer.d0);
                                Activity activity = photoViewer.y;
                                if (activity instanceof LaunchActivity) {
                                    ((LaunchActivity) activity).a1.add(photoViewer.s1);
                                }
                                wu0 wu0Var = photoViewer.d5;
                                if (wu0Var != null && !wu0Var.s) {
                                    wu0Var.a.setVisible(false, false);
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
                sb0 sb0Var = (sb0) this.c;
                if (!this.b) {
                    org.telegram.ui.Cells.x8 x8Var = sb0Var.n;
                    if (x8Var == null || !x8Var.e.h) {
                        org.telegram.ui.Cells.x8 x8Var2 = (org.telegram.ui.Cells.x8) view;
                        boolean z20 = x8Var2.e.h;
                        x8Var2.setChecked(!z20);
                        sb0Var.Z(z20);
                        org.telegram.ui.Cells.x8 x8Var3 = sb0Var.n;
                        if (x8Var3 != null) {
                            if (x8Var2.e.h) {
                                x8Var3.setChecked(false);
                                sb0Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                sb0Var.r.setVisibility(8);
                                break;
                            } else if (sb0Var.e == null) {
                                x8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i12 = -sb0Var.N;
                        sb0Var.N = i12;
                        AndroidUtilities.shakeViewSpring(x8Var, i12);
                        break;
                    }
                }
                break;
            default:
                qg0 qg0Var = (qg0) this.c;
                boolean z21 = this.b;
                rg0 rg0Var = qg0Var.V;
                if (rg0Var.getParentActivity() != null) {
                    boolean z22 = !rg0Var.E;
                    rg0Var.E = z22;
                    ((org.telegram.ui.Cells.z1) view).c(z22, true);
                    if ((z21 && rg0Var.getConnectionsManager().isTestBackend()) != rg0Var.E) {
                        rg0Var.getConnectionsManager().switchBackend(false);
                    }
                    qg0Var.s();
                    break;
                }
                break;
        }
    }
}
