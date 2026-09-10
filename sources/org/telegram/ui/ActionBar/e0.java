package org.telegram.ui.ActionBar;

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
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xh;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.zu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.br0;
import org.telegram.ui.eo;
import org.telegram.ui.ev0;
import org.telegram.ui.fr0;
import org.telegram.ui.gc1;
import org.telegram.ui.gr0;
import org.telegram.ui.gt0;
import org.telegram.ui.hu0;
import org.telegram.ui.vu0;
import org.telegram.ui.wg0;
import org.telegram.ui.xb0;
import org.telegram.ui.xg0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        of ofVar;
        switch (this.a) {
            case 0:
                w0 w0Var = (w0) this.c;
                boolean z10 = this.b;
                p1 p1Var = w0Var.d;
                if (p1Var != null && p1Var.isShowing() && z10) {
                    if (!w0Var.T) {
                        w0Var.T = true;
                        w0Var.d.d(w0Var.R);
                    }
                }
                z zVar = w0Var.c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    s0 s0Var = w0Var.P;
                    if (s0Var != null) {
                        s0Var.m(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 1:
                gc1 gc1Var = (gc1) this.c;
                boolean z11 = this.b;
                for (int i10 = 0; i10 < 2; i10++) {
                    org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) gc1Var.b)[i10];
                    y0Var.a.a(y0Var == view, true);
                }
                SharedConfig.setUseThreeLinesLayout(z11);
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                boolean z12 = this.b;
                qd qdVar = chatActivityEnterView.E4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z12 && (ofVar = chatActivityEnterView.L0) != null) {
                    ofVar.h(!S0);
                    chatActivityEnterView.L0 = null;
                    break;
                } else {
                    chatActivityEnterView.D4 = !S0;
                    AndroidUtilities.cancelRunOnUIThread(qdVar);
                    AndroidUtilities.runOnUIThread(qdVar, 500L);
                    break;
                }
                break;
            case 3:
                yi yiVar = (yi) this.c;
                boolean z13 = this.b;
                p2 p2Var = yiVar.f0;
                if (yiVar.Q0 != 0) {
                    yiVar.Z1.v0();
                    yiVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    gr0 gr0Var = new gr0(hashMap, arrayList, 0, true, (eo) p2Var);
                    xh xhVar = new xh(yiVar, hashMap, arrayList);
                    br0 br0Var = gr0Var.a;
                    br0Var.s0 = xhVar;
                    br0 br0Var2 = gr0Var.b;
                    br0Var2.s0 = xhVar;
                    br0Var.t0 = new fr0(gr0Var, 0);
                    br0Var2.t0 = new fr0(gr0Var, 1);
                    int i11 = yiVar.S1;
                    boolean z14 = yiVar.T1;
                    br0Var.f0(i11, z14);
                    gr0Var.b.f0(i11, z14);
                    if (z13) {
                        p2Var.showAsSheet(gr0Var);
                    } else {
                        p2Var.presentFragment(gr0Var);
                    }
                    yiVar.dismiss();
                    break;
                }
            case 4:
                og0 og0Var = (og0) this.c;
                boolean z15 = this.b;
                og0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z16 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z15 && (!z16 || !LaunchActivity.E1)) {
                    LaunchActivity.F1 = new ru(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(TLObject.FLAG_28);
                    context.startActivity(intent);
                    break;
                } else {
                    zu zuVar = og0Var.U;
                    if (zuVar != null) {
                        zuVar.I();
                        break;
                    } else {
                        PhotoViewer photoViewer = og0Var.V;
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
                                hu0Var.addView(hu0Var.f, 0, w7.a6.e(-1, -1, 51));
                                og0.j(false);
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
                                rk0 o9 = og0.o(photoViewer.y2.getAspectRatio(), false);
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
                                gt0 gt0Var = new gt0(photoViewer, f7, 1);
                                view2.setOutlineProvider(gt0Var);
                                view2.setClipToOutline(true);
                                photoViewer.x3.setOutlineProvider(gt0Var);
                                photoViewer.x3.setClipToOutline(true);
                                vu0 vu0Var2 = photoViewer.E2;
                                if (vu0Var2 != null) {
                                    vu0Var2.setOutlineProvider(gt0Var);
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
                                ev0 ev0Var = photoViewer.d5;
                                if (ev0Var != null && !ev0Var.s) {
                                    ev0Var.a.setVisible(false, false);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            if (photoViewer.D2) {
                                i2.e0 e0Var = photoViewer.F2.d;
                                if (e0Var != null) {
                                    e0Var.v1(null);
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
            case 5:
                xb0 xb0Var = (xb0) this.c;
                if (!this.b) {
                    x8 x8Var = xb0Var.n;
                    if (x8Var == null || !x8Var.e.h) {
                        x8 x8Var2 = (x8) view;
                        boolean z17 = x8Var2.e.h;
                        x8Var2.setChecked(!z17);
                        xb0Var.Z(z17);
                        x8 x8Var3 = xb0Var.n;
                        if (x8Var3 != null) {
                            if (x8Var2.e.h) {
                                x8Var3.setChecked(false);
                                xb0Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                xb0Var.r.setVisibility(8);
                                break;
                            } else if (xb0Var.e == null) {
                                x8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i12 = -xb0Var.N;
                        xb0Var.N = i12;
                        AndroidUtilities.shakeViewSpring(x8Var, i12);
                        break;
                    }
                }
                break;
            case 6:
                wg0 wg0Var = (wg0) this.c;
                boolean z18 = this.b;
                xg0 xg0Var = wg0Var.V;
                if (xg0Var.getParentActivity() != null) {
                    boolean z19 = !xg0Var.E;
                    xg0Var.E = z19;
                    ((org.telegram.ui.Cells.z1) view).c(z19, true);
                    if ((z18 && xg0Var.getConnectionsManager().isTestBackend()) != xg0Var.E) {
                        xg0Var.getConnectionsManager().switchBackend(false);
                    }
                    wg0Var.s();
                    break;
                }
                break;
            case 7:
                zh.a3 a3Var = (zh.a3) this.c;
                boolean z20 = this.b;
                MessagesController.getInstance(a3Var.C2).setStoryQuality(!z20);
                new wc(a3Var.c1, a3Var.B0).M(LocaleController.getString(!z20 ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z20 ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage), R.raw.chats_infotip).j();
                zh.v2 v2Var = a3Var.t1;
                if (v2Var != null) {
                    v2Var.a();
                    break;
                }
                break;
            default:
                zh.v2 v2Var2 = (zh.v2) this.c;
                boolean z21 = this.b;
                zh.t0 t0Var = zh.t0.W;
                if (t0Var != null) {
                    boolean z22 = !z21;
                    if (t0Var.n && t0Var.r != z22) {
                        t0Var.r = z22;
                        NativeInstance nativeInstance = t0Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z22);
                        }
                    }
                }
                zh.v2 v2Var3 = v2Var2.l.t1;
                if (v2Var3 != null) {
                    v2Var3.a();
                    break;
                }
                break;
        }
    }
}
