package org.telegram.ui.ActionBar;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.BringAppForegroundService;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.tz;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pe;
import org.telegram.ui.Components.rh;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.zt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.gs0;
import org.telegram.ui.lo0;
import org.telegram.ui.ma0;
import org.telegram.ui.mo0;
import org.telegram.ui.mr0;
import org.telegram.ui.oo0;
import org.telegram.ui.pq0;
import org.telegram.ui.u71;
import org.telegram.ui.un;
import org.telegram.ui.zr0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        pe peVar;
        int i10 = 2;
        int i11 = 1;
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.c;
                boolean z10 = this.b;
                if (t0Var.x() && z10) {
                    if (!t0Var.T) {
                        t0Var.T = true;
                        t0Var.q();
                    }
                }
                y yVar = t0Var.c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    break;
                } else {
                    o0 o0Var = t0Var.P;
                    if (o0Var != null) {
                        o0Var.k(((Integer) view.getTag()).intValue());
                        break;
                    }
                }
                break;
            case 1:
                u71 u71Var = (u71) this.c;
                boolean z11 = this.b;
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.Cells.u0 u0Var = ((org.telegram.ui.Cells.u0[]) u71Var.b)[i12];
                    ((org.telegram.ui.Cells.t0) u0Var.d).a(u0Var == view, true);
                }
                tz.p1 = z11;
                SharedPreferences.Editor edit = vp.d1().edit();
                edit.putBoolean("useThreeLinesLayout", tz.p1);
                edit.apply();
                zs.e().k(3, Boolean.TRUE);
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                boolean z12 = this.b;
                tc tcVar = chatActivityEnterView.F4;
                chatActivityEnterView.M0 = System.currentTimeMillis();
                boolean Q0 = chatActivityEnterView.Q0();
                if (!z12 && (peVar = chatActivityEnterView.L0) != null) {
                    peVar.g(!Q0);
                    chatActivityEnterView.L0 = null;
                    break;
                } else {
                    chatActivityEnterView.E4 = !Q0;
                    org.telegram.messenger.i0.r(tcVar);
                    org.telegram.messenger.i0.h3(tcVar, 500L);
                    break;
                }
            case 3:
                bi biVar = (bi) this.c;
                boolean z13 = this.b;
                k2 k2Var = biVar.W1;
                if (biVar.K2 != 0) {
                    biVar.T3.N();
                    biVar.dismiss();
                    break;
                } else {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    oo0 oo0Var = new oo0(hashMap, arrayList, 0, true, (un) k2Var);
                    rh rhVar = new rh(biVar, hashMap, arrayList);
                    lo0 lo0Var = oo0Var.a;
                    lo0Var.s0 = rhVar;
                    lo0 lo0Var2 = oo0Var.b;
                    lo0Var2.s0 = rhVar;
                    lo0Var.t0 = new mo0(oo0Var, i11);
                    lo0Var2.t0 = new mo0(oo0Var, i10);
                    int i13 = biVar.M3;
                    boolean z14 = biVar.N3;
                    lo0Var.j0(i13, z14);
                    oo0Var.b.j0(i13, z14);
                    if (z13) {
                        k2Var.showAsSheet(oo0Var);
                    } else {
                        k2Var.presentFragment(oo0Var);
                    }
                    biVar.dismiss();
                    break;
                }
            case 4:
                jf0 jf0Var = (jf0) this.c;
                boolean z15 = this.b;
                jf0Var.getClass();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) view.getContext().getSystemService("activity")).getRunningAppProcesses();
                boolean z16 = runningAppProcesses == null || runningAppProcesses.isEmpty() || runningAppProcesses.get(0).importance == 100;
                if (!z15 && (!z16 || !LaunchActivity.G1)) {
                    LaunchActivity.H1 = new zt(0, view);
                    Context context = org.telegram.messenger.w0.b;
                    Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                    intent.addFlags(TLObject.FLAG_28);
                    context.startActivity(intent);
                    break;
                } else {
                    hu huVar = jf0Var.U;
                    if (huVar != null) {
                        huVar.J0();
                        break;
                    } else {
                        PhotoViewer photoViewer = jf0Var.V;
                        if (photoViewer != null && photoViewer.J3) {
                            if (PhotoViewer.a9 != null) {
                                PhotoViewer.a9.H0(false, true);
                            }
                            mr0 mr0Var = photoViewer.f0;
                            if (mr0Var != null && mr0Var.f != null) {
                                if (org.telegram.messenger.w0.x) {
                                    try {
                                        mr0Var.getContext().startService(new Intent(org.telegram.messenger.w0.b, (Class<?>) BringAppForegroundService.class));
                                    } catch (Throwable th2) {
                                        f8.g(th2, true);
                                    }
                                }
                                mr0Var.h.setVisibility(0);
                                ViewGroup viewGroup = (ViewGroup) mr0Var.f.getParent();
                                if (viewGroup != null) {
                                    viewGroup.removeView(mr0Var.f);
                                }
                                mr0Var.addView(mr0Var.f, 0, w7.b6.e(-1, -1, 51));
                                jf0.b(false);
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
                                org.telegram.messenger.i0.E2(view2);
                                view2.setVisibility(4);
                                photoViewer.y2.addView(view2);
                            }
                            if (org.telegram.messenger.w0.x) {
                                try {
                                    photoViewer.D.startService(new Intent(org.telegram.messenger.w0.b, (Class<?>) BringAppForegroundService.class));
                                } catch (Throwable th3) {
                                    f8.g(th3, true);
                                }
                            }
                            if (photoViewer.f0 != null) {
                                photoViewer.m6 = 0.0f;
                            } else if (view2 != null) {
                                photoViewer.B3 = true;
                                oj0 j10 = jf0.j(false, photoViewer.y2.getAspectRatio());
                                float f7 = j10.c / photoViewer.x3.getLayoutParams().width;
                                photoViewer.x3.setScaleX(f7);
                                photoViewer.x3.setScaleY(f7);
                                photoViewer.x3.setTranslationX(j10.a);
                                photoViewer.x3.setTranslationY(j10.b);
                                view2.setScaleX(f7);
                                view2.setScaleY(f7);
                                view2.setTranslationX(j10.a - photoViewer.y2.getX());
                                view2.setTranslationY(j10.b - photoViewer.y2.getY());
                                zr0 zr0Var = photoViewer.E2;
                                if (zr0Var != null) {
                                    zr0Var.setScaleX(f7);
                                    photoViewer.E2.setScaleY(f7);
                                    photoViewer.E2.setTranslationX(view2.getTranslationX());
                                    photoViewer.E2.setTranslationY(view2.getTranslationY());
                                }
                                photoViewer.W = 0.0f;
                                pq0 pq0Var = new pq0(photoViewer, f7, 1);
                                view2.setOutlineProvider(pq0Var);
                                view2.setClipToOutline(true);
                                photoViewer.x3.setOutlineProvider(pq0Var);
                                photoViewer.x3.setClipToOutline(true);
                                zr0 zr0Var2 = photoViewer.E2;
                                if (zr0Var2 != null) {
                                    zr0Var2.setOutlineProvider(pq0Var);
                                    photoViewer.E2.setClipToOutline(true);
                                }
                            } else {
                                jf0.b(true);
                            }
                            try {
                                photoViewer.e = true;
                                photoViewer.f = true;
                                ((WindowManager) photoViewer.D.getSystemService("window")).addView(photoViewer.g0, photoViewer.d0);
                                Activity activity = photoViewer.D;
                                if (activity instanceof LaunchActivity) {
                                    ((LaunchActivity) activity).b1.add(photoViewer.s1);
                                }
                                gs0 gs0Var = photoViewer.d5;
                                if (gs0Var != null && !gs0Var.s) {
                                    gs0Var.a.O0(false, false);
                                }
                            } catch (Exception e) {
                                f8.g(e, true);
                            }
                            if (photoViewer.D2) {
                                i2.i0 i0Var = photoViewer.F2.d;
                                if (i0Var != null) {
                                    i0Var.z1(null);
                                }
                                photoViewer.F2.z0(photoViewer.C2);
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
                ma0 ma0Var = (ma0) this.c;
                if (!this.b) {
                    t8 t8Var = ma0Var.n;
                    if (t8Var == null || !t8Var.e.h) {
                        t8 t8Var2 = (t8) view;
                        boolean z17 = t8Var2.e.h;
                        t8Var2.setChecked(!z17);
                        ma0Var.d0(z17);
                        t8 t8Var3 = ma0Var.n;
                        if (t8Var3 != null) {
                            if (t8Var2.e.h) {
                                t8Var3.setChecked(false);
                                ma0Var.n.setCheckBoxIcon(R.drawable.permission_locked);
                                ma0Var.r.setVisibility(8);
                                break;
                            } else if (ma0Var.e == null) {
                                t8Var3.setCheckBoxIcon(0);
                                break;
                            }
                        }
                    } else {
                        int i14 = -ma0Var.M;
                        ma0Var.M = i14;
                        org.telegram.messenger.i0.F3(i14, t8Var, null);
                        break;
                    }
                }
                break;
            case 6:
                th.z2 z2Var = (th.z2) this.c;
                boolean z18 = this.b;
                boolean z19 = !z18;
                vp r12 = vp.r1(z2Var.l2);
                if (r12.q6 != z19) {
                    SharedPreferences.Editor edit2 = r12.f7.edit();
                    r12.q6 = z19;
                    edit2.putBoolean("storyQualityFull", z19).apply();
                    r12.getNotificationCenter().k(zs.m3, new Object[0]);
                }
                new cc(z2Var.L0, z2Var.k0).I(R.raw.chats_infotip, cd.L0(!z18 ? 2131744533 : 2131744536, null), cd.L0(!z18 ? 2131744534 : 2131744537, null)).j();
                th.u2 u2Var = z2Var.c1;
                if (u2Var != null) {
                    u2Var.a();
                    break;
                }
                break;
            default:
                th.u2 u2Var2 = (th.u2) this.c;
                boolean z20 = this.b;
                th.s0 s0Var = th.s0.W;
                if (s0Var != null) {
                    boolean z21 = !z20;
                    if (s0Var.n && s0Var.r != z21) {
                        s0Var.r = z21;
                        NativeInstance nativeInstance = s0Var.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z21);
                        }
                    }
                }
                th.u2 u2Var3 = u2Var2.x.c1;
                if (u2Var3 != null) {
                    u2Var3.a();
                    break;
                }
                break;
        }
    }
}
