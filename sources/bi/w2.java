package bi;

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
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.sd;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.br0;
import org.telegram.ui.cc1;
import org.telegram.ui.co;
import org.telegram.ui.cv0;
import org.telegram.ui.fr0;
import org.telegram.ui.gr0;
import org.telegram.ui.gt0;
import org.telegram.ui.hu0;
import org.telegram.ui.tu0;
import org.telegram.ui.vg0;
import org.telegram.ui.wg0;
import org.telegram.ui.xb0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class w2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w2(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nf nfVar;
        switch (this.a) {
            case 0:
                o5 o5Var = (o5) this.c;
                boolean z10 = this.b;
                MessagesController.getInstance(o5Var.C2).setStoryQuality(!z10);
                new yc(o5Var.c1, o5Var.B0).M(LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage), R.raw.chats_infotip).j();
                f5 f5Var = o5Var.t1;
                if (f5Var != null) {
                    f5Var.a();
                    break;
                }
                break;
            case 1:
                f5 f5Var2 = (f5) this.c;
                boolean z11 = this.b;
                t1 t1Var = t1.W;
                if (t1Var != null) {
                    boolean z12 = !z11;
                    if (t1Var.n && t1Var.r != z12) {
                        t1Var.r = z12;
                        NativeInstance nativeInstance = t1Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z12);
                        }
                    }
                }
                f5 f5Var3 = f5Var2.l.t1;
                if (f5Var3 != null) {
                    f5Var3.a();
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
                cc1 cc1Var = (cc1) this.c;
                boolean z14 = this.b;
                for (int i10 = 0; i10 < 2; i10++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) cc1Var.b)[i10];
                    y0Var.a.a(y0Var == view, true);
                }
                SharedConfig.setUseThreeLinesLayout(z14);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                boolean z15 = this.b;
                sd sdVar = chatActivityEnterView.E4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z15 && (nfVar = chatActivityEnterView.L0) != null) {
                    nfVar.h(!S0);
                    chatActivityEnterView.L0 = null;
                    break;
                } else {
                    chatActivityEnterView.D4 = !S0;
                    AndroidUtilities.cancelRunOnUIThread(sdVar);
                    AndroidUtilities.runOnUIThread(sdVar, 500L);
                    break;
                }
            case 5:
                vi viVar = (vi) this.c;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = viVar.f0;
                if (viVar.Q0 != 0) {
                    viVar.Z1.x();
                    viVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    gr0 gr0Var = new gr0(hashMap, arrayList, 0, true, (co) n2Var);
                    uh uhVar = new uh(viVar, hashMap, arrayList);
                    br0 br0Var = gr0Var.a;
                    br0Var.s0 = uhVar;
                    br0 br0Var2 = gr0Var.b;
                    br0Var2.s0 = uhVar;
                    br0Var.t0 = new fr0(gr0Var, 0);
                    br0Var2.t0 = new fr0(gr0Var, 1);
                    int i11 = viVar.S1;
                    boolean z17 = viVar.T1;
                    br0Var.f0(i11, z17);
                    gr0Var.b.f0(i11, z17);
                    if (z16) {
                        n2Var.showAsSheet(gr0Var);
                    } else {
                        n2Var.presentFragment(gr0Var);
                    }
                    viVar.dismiss();
                    break;
                }
            case 6:
                eg0 eg0Var = (eg0) this.c;
                boolean z18 = this.b;
                eg0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z19 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z18 && (!z19 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new lu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(TLObject.FLAG_28);
                    context.startActivity(intent);
                    break;
                } else {
                    tu tuVar = eg0Var.U;
                    if (tuVar != null) {
                        tuVar.I();
                        break;
                    } else {
                        PhotoViewer photoViewer = eg0Var.V;
                        if (photoViewer != null && photoViewer.J3) {
                            if (PhotoViewer.Z8 != null) {
                                PhotoViewer.Z8.G0(false, true);
                            }
                            hu0 hu0Var = photoViewer.f0;
                            if (hu0Var != null && hu0Var.f != null) {
                                if (ApplicationLoader.mainInterfacePaused) {
                                    try {
                                        hu0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th2) {
                                        FileLog.e(th2);
                                    }
                                }
                                hu0Var.h.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) hu0Var.f.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(hu0Var.f);
                                }
                                hu0Var.addView(hu0Var.f, 0, w7.x5.e(-1, -1, 51));
                                eg0.j(false);
                            }
                            PhotoViewer.Z8 = PhotoViewer.a9;
                            PhotoViewer.a9 = null;
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
                                hk0 o9 = eg0.o(photoViewer.y2.getAspectRatio(), false);
                                float f7 = o9.c / photoViewer.x3.getLayoutParams().width;
                                photoViewer.x3.setScaleX(f7);
                                photoViewer.x3.setScaleY(f7);
                                photoViewer.x3.setTranslationX(o9.a);
                                photoViewer.x3.setTranslationY(o9.b);
                                view2.setScaleX(f7);
                                view2.setScaleY(f7);
                                view2.setTranslationX(o9.a - photoViewer.y2.getX());
                                view2.setTranslationY(o9.b - photoViewer.y2.getY());
                                tu0 tu0Var = photoViewer.E2;
                                if (tu0Var != null) {
                                    tu0Var.setScaleX(f7);
                                    photoViewer.E2.setScaleY(f7);
                                    photoViewer.E2.setTranslationX(view2.getTranslationX());
                                    photoViewer.E2.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.W = 0.0f;
                                gt0 gt0Var = new gt0(photoViewer, f7, 1);
                                view2.setOutlineProvider(gt0Var);
                                view2.setClipToOutline(true);
                                photoViewer.x3.setOutlineProvider(gt0Var);
                                photoViewer.x3.setClipToOutline(true);
                                tu0 tu0Var2 = photoViewer.E2;
                                if (tu0Var2 != null) {
                                    tu0Var2.setOutlineProvider(gt0Var);
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
                                cv0 cv0Var = photoViewer.d5;
                                if (cv0Var != null && !cv0Var.s) {
                                    cv0Var.a.setVisible(false, false);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
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
                xb0 xb0Var = (xb0) this.c;
                if (!this.b) {
                    org.telegram.ui.Cells.w8 w8Var = xb0Var.n;
                    if (w8Var == null || !w8Var.e.h) {
                        org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                        boolean z20 = w8Var2.e.h;
                        w8Var2.setChecked(!z20);
                        xb0Var.Z(z20);
                        org.telegram.ui.Cells.w8 w8Var3 = xb0Var.n;
                        if (w8Var3 != null) {
                            if (w8Var2.e.h) {
                                w8Var3.setChecked(false);
                                xb0Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                xb0Var.r.setVisibility(8);
                                break;
                            } else if (xb0Var.e == null) {
                                w8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i12 = -xb0Var.N;
                        xb0Var.N = i12;
                        AndroidUtilities.shakeViewSpring(w8Var, i12);
                        break;
                    }
                }
                break;
            default:
                vg0 vg0Var = (vg0) this.c;
                boolean z21 = this.b;
                wg0 wg0Var = vg0Var.V;
                if (wg0Var.getParentActivity() != null) {
                    boolean z22 = !wg0Var.E;
                    wg0Var.E = z22;
                    ((org.telegram.ui.Cells.z1) view).c(z22, true);
                    if ((z21 && wg0Var.getConnectionsManager().isTestBackend()) != wg0Var.E) {
                        wg0Var.getConnectionsManager().switchBackend(false);
                    }
                    vg0Var.s();
                    break;
                }
                break;
        }
    }
}
