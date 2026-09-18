package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.si1;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dt(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        s4.c1 U;
        int i10 = -1;
        int i11 = 4;
        ArrayList arrayList = null;
        int i12 = 2;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                et etVar = (et) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                etVar.dismiss();
                n2Var.presentFragment(new org.telegram.ui.z6());
                break;
            case 1:
                sv.o((sv) this.b, (z5) this.c);
                break;
            case 2:
                bz bzVar = (bz) this.b;
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) this.c;
                kz kzVar = bzVar.v;
                sw swVar = kzVar.D0;
                if (swVar.indexOfChild(o8Var) != -1 && (U = swVar.U(o8Var)) != null) {
                    if (U.b() == kzVar.f1) {
                        if (kzVar.h1 != null) {
                            ly lyVar = kzVar.t1;
                            if (lyVar != null) {
                                lyVar.y(kzVar.J1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(kzVar.c1).edit();
                            String str = "group_hide_stickers_" + kzVar.J1.id;
                            TLRPC.StickerSet stickerSet = kzVar.J1.stickerset;
                            edit.putLong(str, stickerSet != null ? stickerSet.id : 0L).apply();
                            kzVar.X(false);
                            bz bzVar2 = kzVar.y0;
                            if (bzVar2 != null) {
                                bzVar2.l();
                                break;
                            }
                        }
                    } else if (bzVar.h.get(U.b()) == kzVar.j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bzVar.c);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new lv(bzVar, i12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.show();
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                            break;
                        }
                    }
                }
                break;
            case 3:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = (float[]) this.c;
                float[] fArr2 = FragmentContextView.O0;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.V);
                int i13 = 0;
                while (true) {
                    if (i13 < 3) {
                        if (playbackSpeed - 0.1f <= fArr[i13]) {
                            i10 = i13;
                        } else {
                            i13++;
                        }
                    }
                }
                boolean z11 = true;
                int i14 = i10 + 1;
                if (i14 >= 3) {
                    i14 = 0;
                }
                float f7 = fArr[i14];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.V, f7);
                fragmentContextView.l(playbackSpeed, f7, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - fragmentContextView.B0 > 300) {
                    int i15 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
                    if (i15 > 2) {
                        i15 = -10;
                    }
                    MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i15).apply();
                    if (i15 >= 0 && fragmentContextView.h != null && (fragmentContextView.getParent() instanceof ViewGroup)) {
                        org.telegram.ui.hj hjVar = new org.telegram.ui.hj(6, 2, fragmentContextView.getContext(), null, z11);
                        fragmentContextView.A0 = hjVar;
                        hjVar.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
                        fragmentContextView.A0.setText(LocaleController.getString(R.string.SpeedHint));
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                        ((ViewGroup) fragmentContextView.getParent()).addView(fragmentContextView.A0, marginLayoutParams);
                        fragmentContextView.A0.f(fragmentContextView.F, true);
                    }
                }
                fragmentContextView.B0 = currentTimeMillis;
                break;
            case 4:
                b20 b20Var = (b20) this.b;
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.c;
                int indexOf = b20Var.F.indexOf(u0Var.getFilter());
                if (b20Var.I != indexOf) {
                    b20Var.I = indexOf;
                    b20Var.f();
                    break;
                } else if (u0Var.getFilter().h) {
                    if (u0Var.a.f) {
                        gg.q0 filter = u0Var.getFilter();
                        b20Var.g(filter);
                        a20 a20Var = b20Var.H;
                        if (a20Var != null) {
                            ((org.telegram.ui.zx) a20Var).h(filter);
                            break;
                        }
                    } else {
                        u0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 5:
                ((y2) this.c).run(Long.valueOf(((g20) this.b).d));
                break;
            case 6:
                w30 w30Var = (w30) this.b;
                ((org.telegram.ui.dq) this.c).run();
                w30Var.dismiss();
                break;
            case 7:
                w70 w70Var = (w70) this.b;
                a3.h0 h0Var = (a3.h0) this.c;
                w70Var.u();
                h0Var.run();
                break;
            case 8:
                w70 w70Var2 = (w70) this.b;
                ((org.telegram.ui.uv) this.c).run();
                if (w70Var2.J) {
                    w70Var2.u();
                    break;
                }
                break;
            case 9:
                f80.m((f80) this.b, (d80) this.c);
                break;
            case 10:
                ye0.m((ye0) this.b, (org.telegram.ui.ActionBar.e6) this.c);
                break;
            case 11:
                pi0 pi0Var = (pi0) this.b;
                org.telegram.ui.z10 z10Var = (org.telegram.ui.z10) this.c;
                if (pi0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, pi0Var.getValue());
                    org.telegram.ui.jd0 jd0Var = (org.telegram.ui.jd0) z10Var.b;
                    TLRPC.User user = (TLRPC.User) z10Var.c;
                    if (jd0Var.getLocationController().getSharingLocationInfo(jd0Var.e0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(jd0Var.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new gg.d2(jd0Var, user, max, 12));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        jd0Var.showDialog(alertDialog$Builder2.a);
                    } else {
                        jd0Var.R.L = true;
                        jd0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        jd0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        jd0Var.getLocationController().setProximityLocation(jd0Var.e0, max, true);
                        z10 = true;
                    }
                    if (z10) {
                        pi0Var.a();
                        break;
                    }
                }
                break;
            case 12:
                ui0 ui0Var = (ui0) this.b;
                Context context = (Context) this.c;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(ui0Var.b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, ui0Var.getTitleView().getText()), 500);
                        break;
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                break;
            case 13:
                String str2 = (String) this.b;
                Context context2 = (Context) this.c;
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", str2);
                Intent createChooser = Intent.createChooser(intent2, LocaleController.getString(R.string.ShareLink));
                createChooser.setFlags(TLObject.FLAG_28);
                context2.startActivity(createChooser);
                break;
            case 14:
                yh.l5 l5Var = (yh.l5) this.b;
                org.telegram.messenger.kk kkVar = (org.telegram.messenger.kk) this.c;
                l5Var.e = !l5Var.e;
                kkVar.run();
                l5Var.i(true);
                break;
            case 15:
                dy0 dy0Var = (dy0) this.b;
                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) this.c;
                org.telegram.ui.st.q().v(dy0Var.r.m0);
                org.telegram.ui.st.q().y(f8Var);
                break;
            case 16:
                CharSequence charSequence = (CharSequence) this.b;
                uf.b bVar = (uf.b) this.c;
                AndroidUtilities.addToClipboard(charSequence);
                bVar.run();
                break;
            case 17:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                boolean[] zArr = (boolean[]) this.c;
                f3Var.dismiss();
                if (!zArr[0]) {
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 18:
                v41 v41Var = (v41) this.b;
                l61 l61Var = (l61) this.c;
                v41Var.k0 = false;
                v41Var.J();
                l61Var.N(true);
                v41Var.s();
                break;
            case 19:
                q41 q41Var = (q41) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = q41Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(qr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.yk ykVar = (org.telegram.ui.yk) this.b;
                ((org.telegram.ui.ActionBar.n1) this.c).d(true);
                b51.a(ykVar.getContext(), ykVar.d);
                break;
            case 21:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i16 = UndoView.e0;
                undoView.e(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.n2 n2Var2 = undoView.s;
                tL_payments_getPaymentReceipt.peer = n2Var2.getMessagesController().getInputPeer(message.peer_id);
                n2Var2.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new x1(undoView, 18), 2);
                break;
            case 22:
                z61 z61Var = (z61) this.b;
                File file = (File) this.c;
                if (file == null) {
                    z61Var.getClass();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(z61Var.getContext());
                    if (findActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", findActivity, null, false);
                        z61Var.dismiss();
                        break;
                    }
                }
                break;
            case 23:
                org.telegram.ui.a40 a40Var = (org.telegram.ui.a40) this.b;
                org.telegram.ui.i60 i60Var = (org.telegram.ui.i60) this.c;
                if (a40Var.h()) {
                    if (sf.c.a(i60Var.i0) > 0) {
                        org.telegram.ui.Components.voip.j1.n(i60Var.i0);
                        i60Var.dismiss();
                        break;
                    } else {
                        e5.B(i60Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(i60Var.i0)) {
                    z20.e0 = false;
                    i60Var.dismiss();
                    break;
                } else {
                    e5.A(a40Var.getContext()).o();
                    break;
                }
            case 24:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.b;
                ij0 ij0Var = (ij0) this.c;
                boolean z12 = x0Var.v;
                x0Var.v = !z12;
                if (z12) {
                    ij0Var.M(69);
                    ij0Var.P(99);
                } else {
                    ij0Var.M(36);
                    ij0Var.P(69);
                }
                ij0Var.start();
                break;
            case 25:
                boolean[] zArr2 = (boolean[]) this.b;
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.c;
                boolean z13 = !zArr2[0];
                zArr2[0] = z13;
                a2Var.c(z13, true);
                break;
            case 26:
                org.telegram.ui.Components.voip.m2 m2Var = (org.telegram.ui.Components.voip.m2) this.b;
                Context context3 = (Context) this.c;
                m2Var.getClass();
                boolean z14 = context3 instanceof LaunchActivity;
                if (!z14 || ApplicationLoader.mainInterfacePaused) {
                    if (z14) {
                        Intent intent3 = new Intent(context3, (Class<?>) LaunchActivity.class);
                        intent3.setAction("voip");
                        context3.startActivity(intent3);
                        break;
                    }
                } else {
                    si1.w((Activity) context3, m2Var.L);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) this.b;
                ssVar.showDialog(e5.m(ssVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.c)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.s3(ssVar, i11), null, false, false, ssVar.r).a);
                break;
            case 28:
                org.telegram.ui.ot otVar = (org.telegram.ui.ot) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                org.telegram.ui.st stVar = otVar.a;
                if (stVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        org.telegram.ui.qt qtVar = stVar.l;
                        TLObject tLObject = stVar.W;
                        if (tLObject == null) {
                            tLObject = stVar.Z;
                        }
                        qtVar.s(0, 0, stVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.qt qtVar2 = stVar.l;
                        TLObject tLObject2 = stVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = stVar.Z;
                        }
                        qtVar2.s(0, 0, stVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        MediaDataController.getInstance(stVar.r).removeRecentGif(stVar.W);
                        stVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        MediaDataController.getInstance(stVar.r).addRecentGif(stVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        MessagesController.getInstance(stVar.r).saveGif("gif", stVar.W);
                        stVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document = stVar.W;
                        TLRPC.BotInlineResult botInlineResult = stVar.Z;
                        Object obj = stVar.b0;
                        org.telegram.ui.qt qtVar3 = stVar.l;
                        e5.M(stVar.w, qtVar3.a(), new a1.d(qtVar3, document, botInlineResult, obj, 9), stVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.qt qtVar4 = stVar.l;
                        TLObject tLObject3 = stVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = stVar.Z;
                        }
                        qtVar4.x(tLObject3, stVar.b0);
                    }
                    stVar.p();
                    break;
                }
                break;
            default:
                org.telegram.ui.kv kvVar = (org.telegram.ui.kv) this.b;
                zh.b bVar2 = (zh.b) this.c;
                org.telegram.ui.jv jvVar = kvVar.X;
                oy0[] oy0VarArr = kvVar.b0;
                for (oy0 oy0Var : oy0VarArr) {
                    if (oy0Var != null) {
                        boolean z15 = oy0Var.c;
                    }
                }
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) view;
                int intValue2 = ((Integer) a2Var2.getTag()).intValue();
                oy0 oy0Var2 = oy0VarArr[intValue2];
                boolean z16 = oy0Var2.c;
                boolean z17 = !z16;
                if (z16 != z17) {
                    oy0Var2.c = z17;
                    oy0Var2.d = true;
                }
                a2Var2.c(oy0Var2.c, true);
                boolean z18 = oy0VarArr[intValue2].c;
                ArrayList arrayList3 = bVar2.d;
                HashSet hashSet = bVar2.j;
                if (intValue2 == 0) {
                    bVar2.m = z18;
                } else if (intValue2 != 1) {
                    if (intValue2 == 2) {
                        arrayList = bVar2.e;
                        bVar2.o = z18;
                    } else if (intValue2 == 3) {
                        arrayList = bVar2.f;
                        bVar2.p = z18;
                    } else if (intValue2 == 4) {
                        arrayList = bVar2.g;
                        bVar2.q = z18;
                    } else if (intValue2 == 7) {
                        arrayList = bVar2.h;
                    }
                    if (arrayList != null) {
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            if (((zh.a) arrayList.get(i17)).d == intValue2) {
                                if (z18) {
                                    if (!hashSet.contains(arrayList.get(i17))) {
                                        hashSet.add((zh.a) arrayList.get(i17));
                                        bVar2.g((zh.a) arrayList.get(i17), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i17))) {
                                    hashSet.remove(arrayList.get(i17));
                                    bVar2.g((zh.a) arrayList.get(i17), false);
                                }
                            }
                        }
                    }
                    kvVar.e0.d();
                    kvVar.a0.a(jvVar.d(), true);
                    jvVar.c(true);
                    break;
                } else {
                    bVar2.n = z18;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                kvVar.e0.d();
                kvVar.a0.a(jvVar.d(), true);
                jvVar.c(true);
        }
    }
}
