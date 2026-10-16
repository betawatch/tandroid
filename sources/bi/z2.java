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
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.hv;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ah0;
import org.telegram.ui.av0;
import org.telegram.ui.fo;
import org.telegram.ui.fr0;
import org.telegram.ui.ic1;
import org.telegram.ui.jr0;
import org.telegram.ui.jv0;
import org.telegram.ui.kr0;
import org.telegram.ui.nt0;
import org.telegram.ui.ou0;
import org.telegram.ui.zb0;
import org.telegram.ui.zg0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z2(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        of ofVar;
        switch (this.a) {
            case 0:
                q5 q5Var = (q5) this.c;
                boolean z10 = this.b;
                MessagesController.getInstance(q5Var.C2).setStoryQuality(!z10);
                new zc(q5Var.c1, q5Var.B0).M(LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage), R.raw.chats_infotip).j();
                h5 h5Var = q5Var.t1;
                if (h5Var != null) {
                    h5Var.a();
                    break;
                }
                break;
            case 1:
                h5 h5Var2 = (h5) this.c;
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
                h5 h5Var3 = h5Var2.l.t1;
                if (h5Var3 != null) {
                    h5Var3.a();
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
                        q0Var.k(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 3:
                ic1 ic1Var = (ic1) this.c;
                boolean z14 = this.b;
                for (int i10 = 0; i10 < 2; i10++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) ic1Var.b)[i10];
                    y0Var.a.a(y0Var == view, true);
                }
                SharedConfig.setUseThreeLinesLayout(z14);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                boolean z15 = this.b;
                td tdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean Q0 = chatActivityEnterView.Q0();
                if (!z15 && (ofVar = chatActivityEnterView.L0) != null) {
                    ofVar.h(!Q0);
                    chatActivityEnterView.L0 = null;
                    break;
                } else {
                    chatActivityEnterView.E4 = !Q0;
                    AndroidUtilities.cancelRunOnUIThread(tdVar);
                    AndroidUtilities.runOnUIThread(tdVar, 500L);
                    break;
                }
            case 5:
                vi viVar = (vi) this.c;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.m2 m2Var = viVar.f0;
                if (viVar.T0 != 0) {
                    viVar.c2.z();
                    viVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    kr0 kr0Var = new kr0(hashMap, arrayList, 0, true, (fo) m2Var);
                    uh uhVar = new uh(viVar, hashMap, arrayList);
                    fr0 fr0Var = kr0Var.a;
                    fr0Var.s0 = uhVar;
                    fr0 fr0Var2 = kr0Var.b;
                    fr0Var2.s0 = uhVar;
                    fr0Var.t0 = new jr0(kr0Var, 0);
                    fr0Var2.t0 = new jr0(kr0Var, 1);
                    int i11 = viVar.V1;
                    boolean z17 = viVar.W1;
                    fr0Var.f0(i11, z17);
                    kr0Var.b.f0(i11, z17);
                    if (z16) {
                        m2Var.showAsSheet(kr0Var);
                    } else {
                        m2Var.presentFragment(kr0Var);
                    }
                    viVar.dismiss();
                    break;
                }
            case 6:
                fh0 fh0Var = (fh0) this.c;
                boolean z18 = this.b;
                fh0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z19 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z18 && (!z19 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new zu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(TLObject.FLAG_28);
                    context.startActivity(intent);
                    break;
                } else {
                    hv hvVar = fh0Var.U;
                    if (hvVar != null) {
                        hvVar.I();
                        break;
                    } else {
                        PhotoViewer photoViewer = fh0Var.V;
                        if (photoViewer != null && photoViewer.J3) {
                            if (PhotoViewer.a9 != null) {
                                PhotoViewer.a9.G0(false, true);
                            }
                            ou0 ou0Var = photoViewer.f0;
                            if (ou0Var != null && ou0Var.f != null) {
                                if (ApplicationLoader.mainInterfacePaused) {
                                    try {
                                        ou0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th2) {
                                        FileLog.e(th2);
                                    }
                                }
                                ou0Var.h.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) ou0Var.f.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(ou0Var.f);
                                }
                                ou0Var.addView(ou0Var.f, 0, w7.z5.e(-1, -1, 51));
                                fh0.j(false);
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
                                il0 o10 = fh0.o(photoViewer.y2.getAspectRatio(), false);
                                float f7 = o10.c / photoViewer.x3.getLayoutParams().width;
                                photoViewer.x3.setScaleX(f7);
                                photoViewer.x3.setScaleY(f7);
                                photoViewer.x3.setTranslationX(o10.a);
                                photoViewer.x3.setTranslationY(o10.b);
                                view2.setScaleX(f7);
                                view2.setScaleY(f7);
                                view2.setTranslationX(o10.a - photoViewer.y2.getX());
                                view2.setTranslationY(o10.b - photoViewer.y2.getY());
                                av0 av0Var = photoViewer.E2;
                                if (av0Var != null) {
                                    av0Var.setScaleX(f7);
                                    photoViewer.E2.setScaleY(f7);
                                    photoViewer.E2.setTranslationX(view2.getTranslationX());
                                    photoViewer.E2.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.W = 0.0f;
                                nt0 nt0Var = new nt0(photoViewer, f7, 1);
                                view2.setOutlineProvider(nt0Var);
                                view2.setClipToOutline(true);
                                photoViewer.x3.setOutlineProvider(nt0Var);
                                photoViewer.x3.setClipToOutline(true);
                                av0 av0Var2 = photoViewer.E2;
                                if (av0Var2 != null) {
                                    av0Var2.setOutlineProvider(nt0Var);
                                    photoViewer.E2.setClipToOutline(true);
                                }
                            } else {
                                fh0.j(true);
                            }
                            try {
                                photoViewer.e = true;
                                photoViewer.f = true;
                                ((WindowManager) photoViewer.y.getSystemService("window")).addView(photoViewer.g0, photoViewer.d0);
                                Activity activity = photoViewer.y;
                                if (activity instanceof LaunchActivity) {
                                    ((LaunchActivity) activity).a1.add(photoViewer.s1);
                                }
                                jv0 jv0Var = photoViewer.d5;
                                if (jv0Var != null && !jv0Var.s) {
                                    jv0Var.a.setVisible(false, false);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            if (photoViewer.D2) {
                                i2.h0 h0Var = photoViewer.F2.d;
                                if (h0Var != null) {
                                    h0Var.z1(null);
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
                zb0 zb0Var = (zb0) this.c;
                if (!this.b) {
                    org.telegram.ui.Cells.w8 w8Var = zb0Var.n;
                    if (w8Var == null || !w8Var.e.h) {
                        org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                        boolean z20 = w8Var2.e.h;
                        w8Var2.setChecked(!z20);
                        zb0Var.Z(z20);
                        org.telegram.ui.Cells.w8 w8Var3 = zb0Var.n;
                        if (w8Var3 != null) {
                            if (w8Var2.e.h) {
                                w8Var3.setChecked(false);
                                zb0Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                zb0Var.r.setVisibility(8);
                                break;
                            } else if (zb0Var.e == null) {
                                w8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i12 = -zb0Var.N;
                        zb0Var.N = i12;
                        AndroidUtilities.shakeViewSpring(w8Var, i12);
                        break;
                    }
                }
                break;
            default:
                zg0 zg0Var = (zg0) this.c;
                boolean z21 = this.b;
                ah0 ah0Var = zg0Var.V;
                if (ah0Var.getParentActivity() != null) {
                    boolean z22 = !ah0Var.E;
                    ah0Var.E = z22;
                    ((org.telegram.ui.Cells.a2) view).c(z22, true);
                    if ((z21 && ah0Var.getConnectionsManager().isTestBackend()) != ah0Var.E) {
                        ah0Var.getConnectionsManager().switchBackend(false);
                    }
                    zg0Var.r();
                    break;
                }
                break;
        }
    }
}
