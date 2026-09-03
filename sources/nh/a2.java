package nh;

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
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.id;
import org.telegram.ui.Components.jh;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hu0;
import org.telegram.ui.mq0;
import org.telegram.ui.og0;
import org.telegram.ui.pb0;
import org.telegram.ui.pb1;
import org.telegram.ui.pg0;
import org.telegram.ui.qq0;
import org.telegram.ui.qu0;
import org.telegram.ui.rq0;
import org.telegram.ui.ts0;
import org.telegram.ui.ut0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a2(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cf cfVar;
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.c;
                boolean z4 = this.b;
                MessagesController.getInstance(d4Var.z2).setStoryQuality(!z4);
                new qc(d4Var.Z0, d4Var.y0).M(LocaleController.getString(!z4 ? R.string.StoryQualityIncreasedTitle : R.string.StoryQualityDecreasedTitle), LocaleController.getString(!z4 ? R.string.StoryQualityIncreasedMessage : R.string.StoryQualityDecreasedMessage), R.raw.chats_infotip).j();
                w3 w3Var = d4Var.q1;
                if (w3Var != null) {
                    w3Var.a();
                    break;
                }
                break;
            case 1:
                w3 w3Var2 = (w3) this.c;
                boolean z10 = this.b;
                e1 e1Var = e1.T;
                if (e1Var != null) {
                    boolean z11 = !z10;
                    if (e1Var.n && e1Var.r != z11) {
                        e1Var.r = z11;
                        NativeInstance nativeInstance = e1Var.B;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z11);
                        }
                    }
                }
                w3 w3Var3 = w3Var2.l.q1;
                if (w3Var3 != null) {
                    w3Var3.a();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.c;
                boolean z12 = this.b;
                org.telegram.ui.ActionBar.p1 p1Var = w0Var.d;
                if (p1Var != null && p1Var.isShowing() && z12) {
                    if (!w0Var.Q) {
                        w0Var.Q = true;
                        w0Var.d.d(w0Var.O);
                    }
                }
                org.telegram.ui.ActionBar.z zVar = w0Var.c;
                if (zVar != null) {
                    zVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    org.telegram.ui.ActionBar.s0 s0Var = w0Var.M;
                    if (s0Var != null) {
                        s0Var.m(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 3:
                pb1 pb1Var = (pb1) this.c;
                boolean z13 = this.b;
                for (int i10 = 0; i10 < 2; i10++) {
                    org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) pb1Var.b)[i10];
                    x0Var.a.a(x0Var == view, true);
                }
                SharedConfig.setUseThreeLinesLayout(z13);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                boolean z14 = this.b;
                id idVar = chatActivityEnterView.B4;
                chatActivityEnterView.J0 = System.currentTimeMillis();
                boolean S0 = chatActivityEnterView.S0();
                if (!z14 && (cfVar = chatActivityEnterView.I0) != null) {
                    cfVar.h(!S0);
                    chatActivityEnterView.I0 = null;
                    break;
                } else {
                    chatActivityEnterView.A4 = !S0;
                    AndroidUtilities.cancelRunOnUIThread(idVar);
                    AndroidUtilities.runOnUIThread(idVar, 500L);
                    break;
                }
            case 5:
                li liVar = (li) this.c;
                boolean z15 = this.b;
                org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
                if (liVar.N0 != 0) {
                    liVar.W1.z0();
                    liVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    rq0 rq0Var = new rq0(hashMap, arrayList, 0, true, (zn) p2Var);
                    jh jhVar = new jh(liVar, hashMap, arrayList);
                    mq0 mq0Var = rq0Var.a;
                    mq0Var.p0 = jhVar;
                    mq0 mq0Var2 = rq0Var.b;
                    mq0Var2.p0 = jhVar;
                    mq0Var.q0 = new qq0(rq0Var, 0);
                    mq0Var2.q0 = new qq0(rq0Var, 1);
                    int i11 = liVar.P1;
                    boolean z16 = liVar.Q1;
                    mq0Var.f0(i11, z16);
                    rq0Var.b.f0(i11, z16);
                    if (z15) {
                        p2Var.showAsSheet(rq0Var);
                    } else {
                        p2Var.presentFragment(rq0Var);
                    }
                    liVar.dismiss();
                    break;
                }
            case 6:
                mg0 mg0Var = (mg0) this.c;
                boolean z17 = this.b;
                mg0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z18 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z17 && (!z18 || !LaunchActivity.B1)) {
                    LaunchActivity.C1 = new gu(0, view);
                    Context context = ApplicationLoader.applicationContext;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(TLObject.FLAG_28);
                    context.startActivity(intent);
                    break;
                } else {
                    ou ouVar = mg0Var.R;
                    if (ouVar != null) {
                        ouVar.H();
                        break;
                    } else {
                        PhotoViewer photoViewer = mg0Var.S;
                        if (photoViewer != null && photoViewer.G3) {
                            if (PhotoViewer.W8 != null) {
                                PhotoViewer.W8.G0(false, true);
                            }
                            ut0 ut0Var = photoViewer.c0;
                            if (ut0Var != null && ut0Var.f != null) {
                                if (ApplicationLoader.mainInterfacePaused) {
                                    try {
                                        ut0Var.getContext().startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th2) {
                                        FileLog.e(th2);
                                    }
                                }
                                ut0Var.h.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) ut0Var.f.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(ut0Var.f);
                                }
                                ut0Var.addView(ut0Var.f, 0, k7.b6.e(-1, -1, 51));
                                mg0.j(false);
                            }
                            PhotoViewer.W8 = PhotoViewer.X8;
                            PhotoViewer.X8 = null;
                            if (photoViewer.c0 == null) {
                                photoViewer.I3 = true;
                                Bitmap bitmap = photoViewer.z3;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    photoViewer.z3 = null;
                                }
                                photoViewer.C3 = true;
                            }
                            photoViewer.G3 = false;
                            View view2 = photoViewer.A2 ? photoViewer.z2 : photoViewer.y2;
                            if (photoViewer.c0 == null && view2 != null) {
                                AndroidUtilities.removeFromParent(view2);
                                view2.setVisibility(4);
                                photoViewer.v2.addView(view2);
                            }
                            if (ApplicationLoader.mainInterfacePaused) {
                                try {
                                    photoViewer.y.startService(new Intent(ApplicationLoader.applicationContext, (Class<?>) BringAppForegroundService.class));
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                }
                            }
                            if (photoViewer.c0 != null) {
                                photoViewer.j6 = 0.0f;
                            } else if (view2 != null) {
                                photoViewer.y3 = true;
                                rk0 o10 = mg0.o(photoViewer.v2.getAspectRatio(), false);
                                float f10 = o10.c / photoViewer.u3.getLayoutParams().width;
                                photoViewer.u3.setScaleX(f10);
                                photoViewer.u3.setScaleY(f10);
                                photoViewer.u3.setTranslationX(o10.a);
                                photoViewer.u3.setTranslationY(o10.b);
                                view2.setScaleX(f10);
                                view2.setScaleY(f10);
                                view2.setTranslationX(o10.a - photoViewer.v2.getX());
                                view2.setTranslationY(o10.b - photoViewer.v2.getY());
                                hu0 hu0Var = photoViewer.B2;
                                if (hu0Var != null) {
                                    hu0Var.setScaleX(f10);
                                    photoViewer.B2.setScaleY(f10);
                                    photoViewer.B2.setTranslationX(view2.getTranslationX());
                                    photoViewer.B2.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.T = 0.0f;
                                ts0 ts0Var = new ts0(photoViewer, f10, 1);
                                view2.setOutlineProvider(ts0Var);
                                view2.setClipToOutline(true);
                                photoViewer.u3.setOutlineProvider(ts0Var);
                                photoViewer.u3.setClipToOutline(true);
                                hu0 hu0Var2 = photoViewer.B2;
                                if (hu0Var2 != null) {
                                    hu0Var2.setOutlineProvider(ts0Var);
                                    photoViewer.B2.setClipToOutline(true);
                                }
                            } else {
                                mg0.j(true);
                            }
                            try {
                                photoViewer.e = true;
                                photoViewer.f = true;
                                ((WindowManager) photoViewer.y.getSystemService("window")).addView(photoViewer.d0, photoViewer.a0);
                                Activity activity = photoViewer.y;
                                if (activity instanceof LaunchActivity) {
                                    ((LaunchActivity) activity).X0.add(photoViewer.p1);
                                }
                                qu0 qu0Var = photoViewer.a5;
                                if (qu0Var != null && !qu0Var.s) {
                                    qu0Var.a.setVisible(false, false);
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            if (photoViewer.A2) {
                                j3.f0 f0Var = photoViewer.C2.d;
                                if (f0Var != null) {
                                    f0Var.c0(null);
                                }
                                photoViewer.C2.U(photoViewer.z2);
                                photoViewer.z2.setVisibility(4);
                                photoViewer.D3 = 2;
                                photoViewer.C3 = false;
                                photoViewer.b0.invalidate();
                                photoViewer.s3 = 4;
                                break;
                            } else {
                                photoViewer.s3 = 4;
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                pb0 pb0Var = (pb0) this.c;
                if (!this.b) {
                    org.telegram.ui.Cells.r8 r8Var = pb0Var.n;
                    if (r8Var == null || !r8Var.e.h) {
                        org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                        boolean z19 = r8Var2.e.h;
                        r8Var2.setChecked(!z19);
                        pb0Var.Z(z19);
                        org.telegram.ui.Cells.r8 r8Var3 = pb0Var.n;
                        if (r8Var3 != null) {
                            if (r8Var2.e.h) {
                                r8Var3.setChecked(false);
                                pb0Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                pb0Var.r.setVisibility(8);
                                break;
                            } else if (pb0Var.e == null) {
                                r8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i12 = -pb0Var.K;
                        pb0Var.K = i12;
                        AndroidUtilities.shakeViewSpring(r8Var, i12);
                        break;
                    }
                }
                break;
            default:
                og0 og0Var = (og0) this.c;
                boolean z20 = this.b;
                pg0 pg0Var = og0Var.S;
                if (pg0Var.getParentActivity() != null) {
                    boolean z21 = !pg0Var.B;
                    pg0Var.B = z21;
                    ((org.telegram.ui.Cells.y1) view).c(z21, true);
                    if ((z20 && pg0Var.getConnectionsManager().isTestBackend()) != pg0Var.B) {
                        pg0Var.getConnectionsManager().switchBackend(false);
                    }
                    og0Var.s();
                    break;
                }
                break;
        }
    }
}
