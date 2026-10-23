package ci;

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
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.rd;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.du0;
import org.telegram.ui.gb0;
import org.telegram.ui.hg0;
import org.telegram.ui.ig0;
import org.telegram.ui.mq0;
import org.telegram.ui.mu0;
import org.telegram.ui.qq0;
import org.telegram.ui.qs0;
import org.telegram.ui.rq0;
import org.telegram.ui.rt0;
import org.telegram.ui.sn;
import org.telegram.ui.va1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g2(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mf mfVar;
        switch (this.a) {
            case 0:
                p4 p4Var = (p4) this.c;
                boolean z10 = this.b;
                MessagesController.getInstance(p4Var.C2).setStoryQuality(!z10);
                new xc(p4Var.c1, p4Var.B0).M(LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage), R.raw.chats_infotip).j();
                g4 g4Var = p4Var.t1;
                if (g4Var != null) {
                    g4Var.a();
                    break;
                }
                break;
            case 1:
                g4 g4Var2 = (g4) this.c;
                boolean z11 = this.b;
                h1 h1Var = h1.W;
                if (h1Var != null) {
                    boolean z12 = !z11;
                    if (h1Var.n && h1Var.r != z12) {
                        h1Var.r = z12;
                        NativeInstance nativeInstance = h1Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z12);
                        }
                    }
                }
                g4 g4Var3 = g4Var2.l.t1;
                if (g4Var3 != null) {
                    g4Var3.a();
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
                        q0Var.h(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 3:
                va1 va1Var = (va1) this.c;
                boolean z14 = this.b;
                for (int i10 = 0; i10 < 2; i10++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) va1Var.b)[i10];
                    x0Var.a.a(x0Var == view, true);
                }
                SharedConfig.setUseThreeLinesLayout(z14);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                boolean z15 = this.b;
                rd rdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean Q0 = chatActivityEnterView.Q0();
                if (!z15 && (mfVar = chatActivityEnterView.L0) != null) {
                    mfVar.g(!Q0);
                    chatActivityEnterView.L0 = null;
                    break;
                } else {
                    chatActivityEnterView.E4 = !Q0;
                    AndroidUtilities.cancelRunOnUIThread(rdVar);
                    AndroidUtilities.runOnUIThread(rdVar, 500L);
                    break;
                }
            case 5:
                ti tiVar = (ti) this.c;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.o2 o2Var = tiVar.f0;
                if (tiVar.T0 != 0) {
                    tiVar.c2.E();
                    tiVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    rq0 rq0Var = new rq0(hashMap, arrayList, 0, true, (sn) o2Var);
                    th thVar = new th(tiVar, hashMap, arrayList);
                    mq0 mq0Var = rq0Var.a;
                    mq0Var.s0 = thVar;
                    mq0 mq0Var2 = rq0Var.b;
                    mq0Var2.s0 = thVar;
                    mq0Var.t0 = new qq0(rq0Var, 0);
                    mq0Var2.t0 = new qq0(rq0Var, 1);
                    int i11 = tiVar.V1;
                    boolean z17 = tiVar.W1;
                    mq0Var.f0(i11, z17);
                    rq0Var.b.f0(i11, z17);
                    if (z16) {
                        o2Var.showAsSheet(rq0Var);
                    } else {
                        o2Var.presentFragment(rq0Var);
                    }
                    tiVar.dismiss();
                    break;
                }
            case 6:
                dh0 dh0Var = (dh0) this.c;
                boolean z18 = this.b;
                dh0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z19 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z18 && (!z19 || !LaunchActivity.H1)) {
                    LaunchActivity.I1 = new uu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(TLObject.FLAG_28);
                    context.startActivity(intent);
                    break;
                } else {
                    cv cvVar = dh0Var.U;
                    if (cvVar != null) {
                        cvVar.G();
                        break;
                    } else {
                        PhotoViewer photoViewer = dh0Var.V;
                        if (photoViewer != null && photoViewer.J3) {
                            if (PhotoViewer.a9 != null) {
                                PhotoViewer.a9.H0(false, true);
                            }
                            rt0 rt0Var = photoViewer.f0;
                            if (rt0Var != null && rt0Var.f != null) {
                                if (ApplicationLoader.mainInterfacePaused) {
                                    try {
                                        rt0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th2) {
                                        FileLog.e(th2);
                                    }
                                }
                                rt0Var.h.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) rt0Var.f.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(rt0Var.f);
                                }
                                rt0Var.addView(rt0Var.f, 0, w7.z5.e(-1, -1, 51));
                                dh0.j(false);
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
                                il0 o10 = dh0.o(photoViewer.y2.getAspectRatio(), false);
                                float f7 = o10.c / photoViewer.x3.getLayoutParams().width;
                                photoViewer.x3.setScaleX(f7);
                                photoViewer.x3.setScaleY(f7);
                                photoViewer.x3.setTranslationX(o10.a);
                                photoViewer.x3.setTranslationY(o10.b);
                                view2.setScaleX(f7);
                                view2.setScaleY(f7);
                                view2.setTranslationX(o10.a - photoViewer.y2.getX());
                                view2.setTranslationY(o10.b - photoViewer.y2.getY());
                                du0 du0Var = photoViewer.E2;
                                if (du0Var != null) {
                                    du0Var.setScaleX(f7);
                                    photoViewer.E2.setScaleY(f7);
                                    photoViewer.E2.setTranslationX(view2.getTranslationX());
                                    photoViewer.E2.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.W = 0.0f;
                                qs0 qs0Var = new qs0(photoViewer, f7, 1);
                                view2.setOutlineProvider(qs0Var);
                                view2.setClipToOutline(true);
                                photoViewer.x3.setOutlineProvider(qs0Var);
                                photoViewer.x3.setClipToOutline(true);
                                du0 du0Var2 = photoViewer.E2;
                                if (du0Var2 != null) {
                                    du0Var2.setOutlineProvider(qs0Var);
                                    photoViewer.E2.setClipToOutline(true);
                                }
                            } else {
                                dh0.j(true);
                            }
                            try {
                                photoViewer.e = true;
                                photoViewer.f = true;
                                ((WindowManager) photoViewer.y.getSystemService("window")).addView(photoViewer.g0, photoViewer.d0);
                                Activity activity = photoViewer.y;
                                if (activity instanceof LaunchActivity) {
                                    ((LaunchActivity) activity).b1.add(photoViewer.s1);
                                }
                                mu0 mu0Var = photoViewer.d5;
                                if (mu0Var != null && !mu0Var.s) {
                                    mu0Var.a.setVisible(false, false);
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
                gb0 gb0Var = (gb0) this.c;
                if (!this.b) {
                    org.telegram.ui.Cells.w8 w8Var = gb0Var.n;
                    if (w8Var == null || !w8Var.e.h) {
                        org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                        boolean z20 = w8Var2.e.h;
                        w8Var2.setChecked(!z20);
                        gb0Var.Z(z20);
                        org.telegram.ui.Cells.w8 w8Var3 = gb0Var.n;
                        if (w8Var3 != null) {
                            if (w8Var2.e.h) {
                                w8Var3.setChecked(false);
                                gb0Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                gb0Var.r.setVisibility(8);
                                break;
                            } else if (gb0Var.e == null) {
                                w8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i12 = -gb0Var.N;
                        gb0Var.N = i12;
                        AndroidUtilities.shakeViewSpring(w8Var, i12);
                        break;
                    }
                }
                break;
            default:
                hg0 hg0Var = (hg0) this.c;
                boolean z21 = this.b;
                ig0 ig0Var = hg0Var.a0;
                if (ig0Var.getParentActivity() != null) {
                    boolean z22 = !ig0Var.E;
                    ig0Var.E = z22;
                    ((org.telegram.ui.Cells.z1) view).c(z22, true);
                    if ((z21 && ig0Var.getConnectionsManager().isTestBackend()) != ig0Var.E) {
                        ig0Var.getConnectionsManager().switchBackend(false);
                    }
                    hg0Var.q();
                    break;
                }
                break;
        }
    }
}
