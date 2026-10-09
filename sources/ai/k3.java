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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.vd;
import org.telegram.ui.Components.xh;
import org.telegram.ui.Components.yi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.br0;
import org.telegram.ui.dc1;
import org.telegram.ui.ev0;
import org.telegram.ui.fr0;
import org.telegram.ui.gr0;
import org.telegram.ui.ht0;
import org.telegram.ui.ju0;
import org.telegram.ui.vb0;
import org.telegram.ui.vg0;
import org.telegram.ui.vu0;
import org.telegram.ui.wg0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k3(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        pf pfVar;
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.c;
                boolean z10 = this.b;
                MessagesController.getInstance(f6Var.C2).setStoryQuality(!z10);
                new ad(f6Var.c1, f6Var.B0).M(LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z10 ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage), R.raw.chats_infotip).j();
                w5 w5Var = f6Var.t1;
                if (w5Var != null) {
                    w5Var.a();
                    break;
                }
                break;
            case 1:
                w5 w5Var2 = (w5) this.c;
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
                w5 w5Var3 = w5Var2.l.t1;
                if (w5Var3 != null) {
                    w5Var3.a();
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
                dc1 dc1Var = (dc1) this.c;
                boolean z14 = this.b;
                for (int i10 = 0; i10 < 2; i10++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) dc1Var.b)[i10];
                    y0Var.a.a(y0Var == view, true);
                }
                SharedConfig.setUseThreeLinesLayout(z14);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                boolean z15 = this.b;
                vd vdVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean Q0 = chatActivityEnterView.Q0();
                if (!z15 && (pfVar = chatActivityEnterView.L0) != null) {
                    pfVar.h(!Q0);
                    chatActivityEnterView.L0 = null;
                    break;
                } else {
                    chatActivityEnterView.E4 = !Q0;
                    AndroidUtilities.cancelRunOnUIThread(vdVar);
                    AndroidUtilities.runOnUIThread(vdVar, 500L);
                    break;
                }
            case 5:
                yi yiVar = (yi) this.c;
                boolean z16 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = yiVar.f0;
                if (yiVar.T0 != 0) {
                    yiVar.c2.B0();
                    yiVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    gr0 gr0Var = new gr0(hashMap, arrayList, 0, true, (zn) n2Var);
                    xh xhVar = new xh(yiVar, hashMap, arrayList);
                    br0 br0Var = gr0Var.a;
                    br0Var.s0 = xhVar;
                    br0 br0Var2 = gr0Var.b;
                    br0Var2.s0 = xhVar;
                    br0Var.t0 = new fr0(gr0Var, 0);
                    br0Var2.t0 = new fr0(gr0Var, 1);
                    int i11 = yiVar.V1;
                    boolean z17 = yiVar.W1;
                    br0Var.f0(i11, z17);
                    gr0Var.b.f0(i11, z17);
                    if (z16) {
                        n2Var.showAsSheet(gr0Var);
                    } else {
                        n2Var.presentFragment(gr0Var);
                    }
                    yiVar.dismiss();
                    break;
                }
            case 6:
                gh0 gh0Var = (gh0) this.c;
                boolean z18 = this.b;
                gh0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z19 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z18 && (!z19 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new dv(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(TLObject.FLAG_28);
                    context.startActivity(intent);
                    break;
                } else {
                    lv lvVar = gh0Var.U;
                    if (lvVar != null) {
                        lvVar.I();
                        break;
                    } else {
                        PhotoViewer photoViewer = gh0Var.V;
                        if (photoViewer != null && photoViewer.J3) {
                            if (PhotoViewer.a9 != null) {
                                PhotoViewer.a9.G0(false, true);
                            }
                            ju0 ju0Var = photoViewer.f0;
                            if (ju0Var != null && ju0Var.f != null) {
                                if (ApplicationLoader.mainInterfacePaused) {
                                    try {
                                        ju0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th2) {
                                        FileLog.e(th2);
                                    }
                                }
                                ju0Var.h.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) ju0Var.f.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(ju0Var.f);
                                }
                                ju0Var.addView(ju0Var.f, 0, w7.x5.e(-1, -1, 51));
                                gh0.j(false);
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
                                ml0 o9 = gh0.o(photoViewer.y2.getAspectRatio(), false);
                                float f7 = o9.c / photoViewer.x3.getLayoutParams().width;
                                photoViewer.x3.setScaleX(f7);
                                photoViewer.x3.setScaleY(f7);
                                photoViewer.x3.setTranslationX(o9.a);
                                photoViewer.x3.setTranslationY(o9.b);
                                view2.setScaleX(f7);
                                view2.setScaleY(f7);
                                view2.setTranslationX(o9.a - photoViewer.y2.getX());
                                view2.setTranslationY(o9.b - photoViewer.y2.getY());
                                vu0 vu0Var = photoViewer.E2;
                                if (vu0Var != null) {
                                    vu0Var.setScaleX(f7);
                                    photoViewer.E2.setScaleY(f7);
                                    photoViewer.E2.setTranslationX(view2.getTranslationX());
                                    photoViewer.E2.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.W = 0.0f;
                                ht0 ht0Var = new ht0(photoViewer, f7, 1);
                                view2.setOutlineProvider(ht0Var);
                                view2.setClipToOutline(true);
                                photoViewer.x3.setOutlineProvider(ht0Var);
                                photoViewer.x3.setClipToOutline(true);
                                vu0 vu0Var2 = photoViewer.E2;
                                if (vu0Var2 != null) {
                                    vu0Var2.setOutlineProvider(ht0Var);
                                    photoViewer.E2.setClipToOutline(true);
                                }
                            } else {
                                gh0.j(true);
                            }
                            try {
                                photoViewer.e = true;
                                photoViewer.f = true;
                                ((WindowManager) photoViewer.y.getSystemService("window")).addView(photoViewer.g0, photoViewer.d0);
                                Activity activity = photoViewer.y;
                                if (activity instanceof LaunchActivity) {
                                    ((LaunchActivity) activity).a1.add(photoViewer.s1);
                                }
                                ev0 ev0Var = photoViewer.d5;
                                if (ev0Var != null && !ev0Var.s) {
                                    ev0Var.a.setVisible(false, false);
                                }
                            } catch (Exception e7) {
                                FileLog.e(e7);
                            }
                            if (photoViewer.D2) {
                                i2.f0 f0Var = photoViewer.F2.d;
                                if (f0Var != null) {
                                    f0Var.x1(null);
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
                        vb0Var.Z(z20);
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
                vg0 vg0Var = (vg0) this.c;
                boolean z21 = this.b;
                wg0 wg0Var = vg0Var.V;
                if (wg0Var.getParentActivity() != null) {
                    boolean z22 = !wg0Var.E;
                    wg0Var.E = z22;
                    ((org.telegram.ui.Cells.a2) view).c(z22, true);
                    if ((z21 && wg0Var.getConnectionsManager().isTestBackend()) != wg0Var.E) {
                        wg0Var.getConnectionsManager().switchBackend(false);
                    }
                    vg0Var.r();
                    break;
                }
                break;
        }
    }
}
