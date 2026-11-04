package org.telegram.ui;

import android.animation.ValueAnimator;
import android.appwidget.AppWidgetManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ChatsWidgetProvider;
import org.telegram.messenger.ContactsWidgetProvider;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o9 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o9(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        int i10;
        int i11;
        Runnable runnable;
        org.telegram.ui.ActionBar.y4 y4Var;
        cw cwVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i12;
        int i13 = this.a;
        final int i14 = 0;
        final int i15 = 1;
        Object obj = this.b;
        switch (i13) {
            case 0:
                if (i3 == -1) {
                    ((s9) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                x9 x9Var = (x9) obj;
                if (i3 == -1) {
                    x9Var.finishFragment();
                    break;
                } else if (i3 == 1 && x9Var.a.getText().length() != 0) {
                    x9.Z(x9Var);
                    x9Var.finishFragment();
                    break;
                }
                break;
            case 2:
                ka kaVar = (ka) obj;
                if (i3 == -1) {
                    kaVar.finishFragment();
                    break;
                } else if (i3 == 1) {
                    ka.d0(kaVar);
                    ka.e0(kaVar);
                    break;
                }
                break;
            case 3:
                if (i3 == -1) {
                    ((kb) obj).finishFragment();
                    break;
                }
                break;
            case 4:
                pc pcVar = (pc) obj;
                if (i3 == -1) {
                    if (pcVar.b < pcVar.Z0() || !pcVar.X0()) {
                        pcVar.finishFragment();
                        break;
                    } else {
                        pcVar.c1();
                        break;
                    }
                } else if (i3 == 1) {
                    FrameLayout frameLayout = (FrameLayout) pcVar.getParentActivity().getWindow().getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    pcVar.M.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    pcVar.M.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr = new int[2];
                    pcVar.M.getLocationInWindow(iArr);
                    float f10 = iArr[0];
                    float f11 = iArr[1];
                    float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.g0.n;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    ac acVar = new ac(pcVar, pcVar.getParentActivity(), canvas, (pcVar.M.getMeasuredWidth() / 2.0f) + f10, (pcVar.M.getMeasuredHeight() / 2.0f) + f11, max, paint, createBitmap, paint2, f10, f11, 0);
                    pcVar.n0 = acVar;
                    acVar.setOnTouchListener(new fi.a(2));
                    pcVar.o0 = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    pcVar.p0 = ofFloat;
                    ofFloat.addUpdateListener(new gi.ea(pcVar, i15));
                    pcVar.p0.addListener(new org.telegram.ui.Cells.w9(pcVar, 4));
                    pcVar.p0.setDuration(400L);
                    pcVar.p0.setInterpolator(org.telegram.ui.Components.ks.e);
                    pcVar.p0.start();
                    frameLayout.addView(pcVar.n0, new ViewGroup.LayoutParams(-1, -1));
                    org.telegram.messenger.g0.h3(new vb(pcVar, 0));
                    break;
                }
                break;
            case 5:
                ad adVar = (ad) obj;
                long j10 = adVar.k0;
                qc qcVar = adVar.x0;
                if (i3 == -1) {
                    if (adVar.t0) {
                        ad.d0(adVar);
                        break;
                    } else {
                        adVar.finishFragment();
                        break;
                    }
                } else if (i3 == 1) {
                    int i16 = adVar.j0;
                    if (i16 != 0) {
                        if (i16 == 1) {
                            if (adVar.c0) {
                                org.telegram.messenger.n10 n10Var = adVar.v0;
                                if (n10Var != null) {
                                    n10Var.a(adVar, Long.valueOf(j10));
                                }
                            } else if (adVar.y.length() == 0) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(adVar.getParentActivity());
                                String M0 = org.telegram.messenger.bd.M0(2131752316, null);
                                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                                s1Var.S = M0;
                                s1Var.U = org.telegram.messenger.bd.M0(2131752317, null);
                                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752041, null), null);
                                adVar.showDialog(s1Var);
                                break;
                            } else if (!adVar.b0) {
                                Vibrator vibrator = (Vibrator) adVar.getParentActivity().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(200L);
                                }
                                org.telegram.messenger.g0.F3(adVar.W);
                                break;
                            } else {
                                org.telegram.messenger.g0.i3(qcVar, 200L);
                                i10 = ((org.telegram.ui.ActionBar.d2) adVar).currentAccount;
                                org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i10);
                                long j11 = adVar.k0;
                                String str = adVar.Z;
                                Runnable runnable2 = new Runnable(this) { // from class: org.telegram.ui.vc
                                    public final /* synthetic */ o9 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                ad adVar2 = (ad) this.b.b;
                                                adVar2.m0(false);
                                                org.telegram.messenger.n10 n10Var2 = adVar2.v0;
                                                if (n10Var2 != null) {
                                                    n10Var2.a(adVar2, Long.valueOf(adVar2.k0));
                                                    break;
                                                }
                                                break;
                                            default:
                                                ad adVar3 = (ad) this.b.b;
                                                adVar3.m0(false);
                                                org.telegram.messenger.n10 n10Var3 = adVar3.v0;
                                                if (n10Var3 != null) {
                                                    n10Var3.a(adVar3, Long.valueOf(adVar3.k0));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                Runnable runnable3 = new Runnable(this) { // from class: org.telegram.ui.vc
                                    public final /* synthetic */ o9 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                ad adVar2 = (ad) this.b.b;
                                                adVar2.m0(false);
                                                org.telegram.messenger.n10 n10Var2 = adVar2.v0;
                                                if (n10Var2 != null) {
                                                    n10Var2.a(adVar2, Long.valueOf(adVar2.k0));
                                                    break;
                                                }
                                                break;
                                            default:
                                                ad adVar3 = (ad) this.b.b;
                                                adVar3.m0(false);
                                                org.telegram.messenger.n10 n10Var3 = adVar3.v0;
                                                if (n10Var3 != null) {
                                                    n10Var3.a(adVar3, Long.valueOf(adVar3.k0));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                                tL_channels_updateUsername.channel = s12.h1(j11);
                                tL_channels_updateUsername.username = str;
                                s12.getConnectionsManager().sendRequest(tL_channels_updateUsername, new org.telegram.messenger.cm(s12, j11, str, runnable2, adVar, tL_channels_updateUsername, runnable3), 64);
                            }
                            if (adVar.v0 == null) {
                                Bundle bundle = new Bundle();
                                bundle.putInt("step", 2);
                                bundle.putLong("chatId", j10);
                                bundle.putInt("chatType", 2);
                                adVar.presentFragment(new r40(bundle), true);
                                break;
                            }
                        }
                    } else if (adVar.getParentActivity() != null) {
                        if (adVar.t0) {
                            ad.d0(adVar);
                            break;
                        } else if (adVar.d.a.length() == 0) {
                            Vibrator vibrator2 = (Vibrator) adVar.getParentActivity().getSystemService("vibrator");
                            if (vibrator2 != null) {
                                vibrator2.vibrate(200L);
                            }
                            org.telegram.messenger.g0.F3(adVar.d);
                            break;
                        } else {
                            adVar.t0 = true;
                            org.telegram.messenger.g0.i3(qcVar, 200L);
                            if (adVar.x.g()) {
                                adVar.s0 = true;
                                break;
                            } else {
                                i11 = ((org.telegram.ui.ActionBar.d2) adVar).currentAccount;
                                adVar.u0 = Integer.valueOf(org.telegram.messenger.hp.s1(i11).U(adVar.d.getText().toString(), new ArrayList(), adVar.y.getText().toString(), 2, false, null, null, -1, adVar));
                                break;
                            }
                        }
                    }
                }
                break;
            case 6:
                ln lnVar = (ln) obj;
                if (i3 == -1) {
                    if (lnVar.j0(true)) {
                        lnVar.finishFragment();
                        break;
                    }
                } else if (i3 == 1) {
                    lnVar.o0();
                    break;
                }
                break;
            case 7:
                if (i3 == -1) {
                    ((qo) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i3 == -1) {
                    ((xo) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                ip ipVar = (ip) obj;
                if (i3 == -1) {
                    if (ipVar.r0(true)) {
                        ipVar.finishFragment();
                        break;
                    }
                } else if (i3 == 1) {
                    ipVar.w0(true);
                    break;
                }
                break;
            case 10:
                nq nqVar = (nq) obj;
                if (i3 == -1) {
                    if (nqVar.l0(true)) {
                        nqVar.finishFragment();
                        break;
                    }
                } else if (i3 == 1) {
                    nqVar.z0();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.z7 z7Var = (org.telegram.ui.Components.z7) obj;
                if (i3 == -1) {
                    z7Var.dismiss();
                    break;
                } else {
                    z7Var.P0(i3);
                    break;
                }
            case 12:
                if (i3 == -1) {
                    ((org.telegram.ui.Components.ma) obj).dismiss();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.bi biVar = (org.telegram.ui.Components.bi) obj;
                if (i3 != -1) {
                    biVar.t2.w(i3);
                    break;
                } else if (!biVar.t2.k()) {
                    biVar.dismiss();
                    break;
                }
                break;
            case 14:
                if (i3 == -1) {
                    ((org.telegram.ui.Components.n20) obj).finishFragment();
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.r80 r80Var = (org.telegram.ui.Components.r80) obj;
                if (i3 != -1) {
                    if (i3 == 10) {
                        org.telegram.ui.Components.q80 q80Var = r80Var.S;
                        q80Var.p1(q80Var.getClosestTab(), false);
                        break;
                    }
                } else if (!r80Var.S.V(true)) {
                    r80Var.finishFragment();
                    break;
                }
                break;
            case 16:
                if (i3 == -1 && (runnable = ((org.telegram.ui.Components.od0) obj).r) != null) {
                    org.telegram.messenger.g0.h3(runnable);
                    break;
                }
                break;
            case 17:
                if (i3 == -1) {
                    ((org.telegram.ui.Components.se0) obj).dismiss();
                    break;
                }
                break;
            case 18:
                ((org.telegram.ui.Components.oo0) obj).onBackPressed();
                break;
            case 19:
                if (i3 == -1) {
                    ((org.telegram.ui.Components.h41) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                if (i3 == -1) {
                    ((org.telegram.ui.Components.voip.f0) obj).b(false, false);
                    break;
                }
                break;
            case 21:
                if (i3 == -1) {
                    ((sb1) obj).a(false, false);
                    break;
                }
                break;
            case 22:
                ContactsActivity contactsActivity = (ContactsActivity) obj;
                if (i3 == -1) {
                    y4Var = ((org.telegram.ui.ActionBar.d2) contactsActivity).simpleActionBar;
                    if (y4Var.s()) {
                        contactsActivity.m0();
                        break;
                    } else {
                        contactsActivity.finishFragment();
                        break;
                    }
                } else if (i3 == 100) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, contactsActivity.getParentActivity(), contactsActivity.getResourceProvider());
                    a0.h hVar = contactsActivity.a0;
                    int m10 = hVar.m();
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                    if (m10 == 1) {
                        s1Var2.S = org.telegram.messenger.bd.M0(2131751551, null);
                        s1Var2.U = org.telegram.messenger.bd.M0(2131751552, null);
                    } else {
                        s1Var2.S = org.telegram.messenger.bd.G(hVar.m(), "DeleteContactsTitle", new Object[0]);
                        s1Var2.U = org.telegram.messenger.bd.M0(2131751550, null);
                    }
                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131751599, null), new or(contactsActivity));
                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), new org.telegram.ui.Components.lf0(20));
                    s1Var2.show();
                    s1Var2.i();
                    break;
                } else if (i3 == 1) {
                    org.telegram.messenger.az.L0 = !org.telegram.messenger.az.L0;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                    edit.putBoolean("sortContactsByName", org.telegram.messenger.az.L0);
                    edit.apply();
                    contactsActivity.r = org.telegram.messenger.az.L0;
                    org.telegram.ui.ActionBar.f5 f5Var = contactsActivity.n;
                    if (f5Var != null) {
                        org.telegram.messenger.g0.R3(f5Var.getIconView(), contactsActivity.r ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
                    }
                    ViewPropertyAnimator viewPropertyAnimator = contactsActivity.f0;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    contactsActivity.a.b();
                    ViewPropertyAnimator withEndAction = contactsActivity.d.animate().alpha(0.0f).setDuration(120L).setInterpolator(org.telegram.ui.Components.xq.g).withEndAction(new nr(contactsActivity, i14));
                    contactsActivity.f0 = withEndAction;
                    withEndAction.start();
                    break;
                }
                break;
            case 23:
                if (i3 == -1) {
                    ((os) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i3 == -1) {
                    ((DataAutoDownloadActivity) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i3 == -1) {
                    ((DataSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                if (i3 == -1) {
                    ((ht) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                if (i3 == -1) {
                    ((yt) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                uw uwVar = (uw) obj;
                ArrayList arrayList = uwVar.J2;
                if ((i3 == 201 || i3 == 200 || i3 == 202 || i3 == 203) && (cwVar = uwVar.D0) != null) {
                    HashMap hashMap = cwVar.C0;
                    uw uwVar2 = cwVar.M0;
                    if (i3 != 202) {
                        if (i3 != 203) {
                            if (i3 != 200) {
                                if (i3 == 201) {
                                    uw uwVar3 = new uw(org.telegram.ui.Cells.f1.l(3, "onlySelect", "dialogsType", true));
                                    uwVar3.D2 = new org.telegram.ui.Components.zw(cwVar, 18);
                                    uwVar2.presentFragment(uwVar3);
                                    break;
                                }
                            } else if (hashMap.size() == 1) {
                                cwVar.o((org.telegram.messenger.zi) hashMap.values().iterator().next());
                                break;
                            }
                        } else if (cwVar.O()) {
                            uwVar2.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) uwVar2, 2, true));
                            break;
                        }
                    } else if (uwVar2 != null && uwVar2.getParentActivity() != null) {
                        ArrayList arrayList2 = new ArrayList(hashMap.values());
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(uwVar2.getParentActivity());
                        String G = org.telegram.messenger.bd.G(hashMap.size(), "RemoveDocumentsTitle", new Object[0]);
                        org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.a;
                        s1Var3.S = G;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(hashMap.size(), "RemoveDocumentsMessage", new Object[0]))).append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.bd.M0(2131746327, null));
                        s1Var3.U = spannableStringBuilder;
                        alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, null), new org.telegram.ui.Components.lf0(2));
                        alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131751599, null), new jo(26, cwVar, arrayList2));
                        TextView textView = (TextView) alertDialog$Builder3.p().d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                            break;
                        }
                    }
                } else if (i3 == -1) {
                    pv pvVar = uwVar.G3;
                    if (pvVar == null || !pvVar.c()) {
                        jw jwVar = uwVar.A0;
                        if (jwVar == null || !jwVar.n) {
                            kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                            if (kVar.v()) {
                                cw cwVar2 = uwVar.D0;
                                if (cwVar2 != null && cwVar2.getVisibility() == 0) {
                                    cw cwVar3 = uwVar.D0;
                                    if (cwVar3.B0) {
                                        cwVar3.R(false);
                                        break;
                                    }
                                }
                                uwVar.n4(true);
                                break;
                            } else if (uwVar.m2 || uwVar.X2 != 0 || uwVar.Z2 != 0) {
                                uwVar.finishFragment();
                                break;
                            }
                        } else {
                            jwVar.setIsEditing(false);
                            uwVar.U4(false);
                            break;
                        }
                    } else {
                        kVar2 = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
                        if (kVar2.v()) {
                            cw cwVar4 = uwVar.D0;
                            if (cwVar4 != null && cwVar4.getVisibility() == 0) {
                                cw cwVar5 = uwVar.D0;
                                if (cwVar5.B0) {
                                    cwVar5.R(false);
                                    break;
                                }
                            }
                            uwVar.n4(true);
                            break;
                        } else {
                            uwVar.G3.a();
                            cw cwVar6 = uwVar.D0;
                            if (cwVar6 != null) {
                                cwVar6.S();
                                break;
                            }
                        }
                    }
                } else if (i3 != 1) {
                    if (i3 == 3) {
                        uwVar.a5(true, true, true, false);
                        uwVar.Z.b(true);
                        break;
                    } else if (i3 == 11) {
                        uwVar.B4(uwVar.E1);
                        break;
                    } else if (i3 == 109) {
                        org.telegram.ui.Components.cz czVar = new org.telegram.ui.Components.cz(uwVar, arrayList);
                        czVar.r1 = new ur(this, 7);
                        uwVar.showDialog(czVar);
                        break;
                    } else if (i3 == 110) {
                        org.telegram.messenger.mo moVar = (org.telegram.messenger.mo) uwVar.getMessagesController().T0().get(uwVar.f0[0].h);
                        ArrayList J0 = org.telegram.ui.Components.cz.J0(uwVar, moVar, arrayList, false, false);
                        if (J0.size() + (moVar != null ? moVar.i.size() : 0) > 100) {
                            uwVar.showDialog(org.telegram.ui.Components.t4.M(uwVar.getParentActivity(), org.telegram.messenger.bd.M0(2131750811, null), org.telegram.messenger.bd.M0(2131750812, null)).a);
                            break;
                        } else {
                            if (!J0.isEmpty()) {
                                moVar.i.addAll(J0);
                                for (int i17 = 0; i17 < J0.size(); i17++) {
                                    Long l10 = (Long) J0.get(i17);
                                    moVar.h.remove(l10);
                                    moVar.j.delete(l10.longValue());
                                }
                                if (moVar.d()) {
                                    moVar.i.clear();
                                }
                                ez.z0(moVar, moVar.g, moVar.b, moVar.c, moVar.n, moVar.m, moVar.h, moVar.i, moVar.j, false, false, true, false, false, uwVar, null);
                            }
                            long longValue = J0.size() == 1 ? ((Long) J0.get(0)).longValue() : 0L;
                            UndoView k42 = uwVar.k4();
                            if (k42 != null) {
                                k42.k(longValue, 21, Integer.valueOf(J0.size()), moVar, null, null);
                            }
                            uwVar.n4(false);
                            break;
                        }
                    } else if (i3 == 100 || i3 == 101 || i3 == 102 || i3 == 103 || i3 == 104 || i3 == 105 || i3 == 106 || i3 == 107 || i3 == 108) {
                        uwVar.D4(uwVar.J2, i3, true, false, null);
                        break;
                    }
                } else if (uwVar.getParentActivity() != null) {
                    org.telegram.messenger.az.x = true;
                    org.telegram.messenger.az.y();
                    int[] iArr2 = new int[2];
                    uwVar.g0.getLocationInWindow(iArr2);
                    ((LaunchActivity) uwVar.getParentActivity()).K0(false, true, (uwVar.g0.getMeasuredWidth() / 2) + iArr2[0], (uwVar.g0.getMeasuredHeight() / 2) + iArr2[1], new xg(this, 22));
                    uwVar.getNotificationsController().Y();
                    uwVar.K3();
                    break;
                }
                break;
            default:
                cx cxVar = (cx) obj;
                int i18 = cxVar.x;
                ArrayList arrayList3 = cxVar.e;
                int i19 = cxVar.y;
                if (i3 == -1) {
                    if (cxVar.E == null) {
                        cxVar.d0();
                        break;
                    } else {
                        cxVar.finishFragment();
                        break;
                    }
                } else if (i3 == 1 && cxVar.getParentActivity() != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                        arrayList4.add(org.telegram.messenger.pr.a(((Long) arrayList3.get(i20)).longValue(), 0L));
                    }
                    org.telegram.messenger.qr messagesStorage = cxVar.getMessagesStorage();
                    messagesStorage.a.c(new org.telegram.messenger.lp(messagesStorage, i19, arrayList4, i15));
                    SharedPreferences.Editor edit2 = cxVar.getParentActivity().getSharedPreferences("shortcut_widget", 0).edit();
                    i12 = ((org.telegram.ui.ActionBar.d2) cxVar).currentAccount;
                    edit2.putInt("account" + i19, i12);
                    edit2.putInt(TeXSymbolParser.TYPE_ATTR + i19, i18);
                    edit2.commit();
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(cxVar.getParentActivity());
                    if (i18 == 0) {
                        ChatsWidgetProvider.a(cxVar.getParentActivity(), appWidgetManager, i19);
                    } else {
                        ContactsWidgetProvider.a(cxVar.getParentActivity(), appWidgetManager, i19);
                    }
                    yw ywVar = cxVar.E;
                    if (ywVar != null) {
                        ywVar.n();
                        break;
                    } else {
                        cxVar.d0();
                        break;
                    }
                }
                break;
        }
    }
}
