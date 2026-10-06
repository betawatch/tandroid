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
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.td;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ar0;
import org.telegram.ui.br0;
import org.telegram.ui.ct0;
import org.telegram.ui.du0;
import org.telegram.ui.pu0;
import org.telegram.ui.tg0;
import org.telegram.ui.ug0;
import org.telegram.ui.vb0;
import org.telegram.ui.vb1;
import org.telegram.ui.wq0;
import org.telegram.ui.yn;
import org.telegram.ui.yu0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
        of ofVar;
        switch (this.a) {
            case 0:
                e6 e6Var = (e6) this.c;
                boolean z10 = this.b;
                MessagesController.getInstance(e6Var.C2).setStoryQuality(!z10);
                new yc(e6Var.c1, e6Var.B0).M(LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage), R.raw.chats_infotip).j();
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
                vb1 vb1Var = (vb1) this.c;
                boolean z14 = this.b;
                for (int i10 = 0; i10 < 2; i10++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) vb1Var.b)[i10];
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
                if (!z15 && (ofVar = chatActivityEnterView.L0) != null) {
                    ofVar.h(!S0);
                    chatActivityEnterView.L0 = null;
                    break;
                } else {
                    chatActivityEnterView.E4 = !S0;
                    AndroidUtilities.cancelRunOnUIThread(tdVar);
                    AndroidUtilities.runOnUIThread(tdVar, 500L);
                    break;
                }
            case 5:
                xi xiVar = (xi) this.c;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = xiVar.f0;
                if (xiVar.Q0 != 0) {
                    xiVar.Z1.u0();
                    xiVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    br0 br0Var = new br0(hashMap, arrayList, 0, true, (yn) n2Var);
                    mi miVar = new mi(xiVar, hashMap, arrayList);
                    wq0 wq0Var = br0Var.a;
                    wq0Var.s0 = miVar;
                    wq0 wq0Var2 = br0Var.b;
                    wq0Var2.s0 = miVar;
                    wq0Var.t0 = new ar0(br0Var, 0);
                    wq0Var2.t0 = new ar0(br0Var, 1);
                    int i11 = xiVar.S1;
                    boolean z17 = xiVar.T1;
                    wq0Var.f0(i11, z17);
                    br0Var.b.f0(i11, z17);
                    if (z16) {
                        n2Var.showAsSheet(br0Var);
                    } else {
                        n2Var.presentFragment(br0Var);
                    }
                    xiVar.dismiss();
                    break;
                }
            case 6:
                rg0 rg0Var = (rg0) this.c;
                boolean z18 = this.b;
                rg0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z19 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z18 && (!z19 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new qu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(TLObject.FLAG_28);
                    context.startActivity(intent);
                    break;
                } else {
                    zu zuVar = rg0Var.U;
                    if (zuVar != null) {
                        zuVar.G();
                        break;
                    } else {
                        PhotoViewer photoViewer = rg0Var.V;
                        if (photoViewer != null && photoViewer.J3) {
                            if (PhotoViewer.a9 != null) {
                                PhotoViewer.a9.G0(false, true);
                            }
                            du0 du0Var = photoViewer.f0;
                            if (du0Var != null && du0Var.f != null) {
                                if (ApplicationLoader.mainInterfacePaused) {
                                    try {
                                        du0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th2) {
                                        FileLog.e(th2);
                                    }
                                }
                                du0Var.h.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) du0Var.f.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(du0Var.f);
                                }
                                du0Var.addView(du0Var.f, 0, w7.z5.e(-1, -1, 51));
                                rg0.j(false);
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
                                uk0 o9 = rg0.o(photoViewer.y2.getAspectRatio(), false);
                                float f7 = o9.c / photoViewer.x3.getLayoutParams().width;
                                photoViewer.x3.setScaleX(f7);
                                photoViewer.x3.setScaleY(f7);
                                photoViewer.x3.setTranslationX(o9.a);
                                photoViewer.x3.setTranslationY(o9.b);
                                view2.setScaleX(f7);
                                view2.setScaleY(f7);
                                view2.setTranslationX(o9.a - photoViewer.y2.getX());
                                view2.setTranslationY(o9.b - photoViewer.y2.getY());
                                pu0 pu0Var = photoViewer.E2;
                                if (pu0Var != null) {
                                    pu0Var.setScaleX(f7);
                                    photoViewer.E2.setScaleY(f7);
                                    photoViewer.E2.setTranslationX(view2.getTranslationX());
                                    photoViewer.E2.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.W = 0.0f;
                                ct0 ct0Var = new ct0(photoViewer, f7, 1);
                                view2.setOutlineProvider(ct0Var);
                                view2.setClipToOutline(true);
                                photoViewer.x3.setOutlineProvider(ct0Var);
                                photoViewer.x3.setClipToOutline(true);
                                pu0 pu0Var2 = photoViewer.E2;
                                if (pu0Var2 != null) {
                                    pu0Var2.setOutlineProvider(ct0Var);
                                    photoViewer.E2.setClipToOutline(true);
                                }
                            } else {
                                rg0.j(true);
                            }
                            try {
                                photoViewer.e = true;
                                photoViewer.f = true;
                                ((WindowManager) photoViewer.y.getSystemService("window")).addView(photoViewer.g0, photoViewer.d0);
                                Activity activity = photoViewer.y;
                                if (activity instanceof LaunchActivity) {
                                    ((LaunchActivity) activity).a1.add(photoViewer.s1);
                                }
                                yu0 yu0Var = photoViewer.d5;
                                if (yu0Var != null && !yu0Var.s) {
                                    yu0Var.a.setVisible(false, false);
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
                vb0 vb0Var = (vb0) this.c;
                if (!this.b) {
                    org.telegram.ui.Cells.w8 w8Var = vb0Var.n;
                    if (w8Var == null || !w8Var.e.h) {
                        org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                        boolean z20 = w8Var2.e.h;
                        w8Var2.setChecked(!z20);
                        vb0Var.Y(z20);
                        org.telegram.ui.Cells.w8 w8Var3 = vb0Var.n;
                        if (w8Var3 != null) {
                            if (w8Var2.e.h) {
                                w8Var3.setChecked(false);
                                vb0Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                vb0Var.r.setVisibility(8);
                                break;
                            } else if (vb0Var.e == null) {
                                w8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i12 = -vb0Var.N;
                        vb0Var.N = i12;
                        AndroidUtilities.shakeViewSpring(w8Var, i12);
                        break;
                    }
                }
                break;
            default:
                tg0 tg0Var = (tg0) this.c;
                boolean z21 = this.b;
                ug0 ug0Var = tg0Var.V;
                if (ug0Var.getParentActivity() != null) {
                    boolean z22 = !ug0Var.E;
                    ug0Var.E = z22;
                    ((org.telegram.ui.Cells.a2) view).c(z22, true);
                    if ((z21 && ug0Var.getConnectionsManager().isTestBackend()) != ug0Var.E) {
                        ug0Var.getConnectionsManager().switchBackend(false);
                    }
                    tg0Var.s();
                    break;
                }
                break;
        }
    }
}
