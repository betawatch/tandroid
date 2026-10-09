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
import org.telegram.ui.wi1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ut implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ut(int i10, Object obj, Object obj2) {
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
        s4.d1 T;
        int i10 = -1;
        int i11 = 2;
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                vt vtVar = (vt) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                vtVar.dismiss();
                n2Var.presentFragment(new org.telegram.ui.y6());
                break;
            case 1:
                iw.q((iw) this.b, (b6) this.c);
                break;
            case 2:
                qz qzVar = (qz) this.b;
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) this.c;
                a00 a00Var = qzVar.v;
                ix ixVar = a00Var.D0;
                if (ixVar.indexOfChild(o8Var) != -1 && (T = ixVar.T(o8Var)) != null) {
                    if (T.b() == a00Var.f1) {
                        if (a00Var.h1 != null) {
                            az azVar = a00Var.t1;
                            if (azVar != null) {
                                azVar.y(a00Var.J1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(a00Var.c1).edit();
                            String str = "group_hide_stickers_" + a00Var.J1.id;
                            TLRPC.StickerSet stickerSet = a00Var.J1.stickerset;
                            edit.putLong(str, stickerSet != null ? stickerSet.id : 0L).apply();
                            a00Var.X(false);
                            qz qzVar2 = a00Var.y0;
                            if (qzVar2 != null) {
                                qzVar2.l();
                                break;
                            }
                        }
                    } else if (qzVar.h.get(T.b()) == a00Var.j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qzVar.c);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new bw(qzVar, i11));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.show();
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                            break;
                        }
                    }
                }
                break;
            case 3:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = (float[]) this.c;
                float[] fArr2 = FragmentContextView.Q0;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.W);
                int i12 = 0;
                while (true) {
                    if (i12 < 3) {
                        if (playbackSpeed - 0.1f <= fArr[i12]) {
                            i10 = i12;
                        } else {
                            i12++;
                        }
                    }
                }
                int i13 = i10 + 1;
                float f7 = fArr[i13 < 3 ? i13 : 0];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.W, f7);
                fragmentContextView.l(playbackSpeed, f7, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (fragmentContextView.B0 == null && currentTimeMillis - fragmentContextView.D0 > 300) {
                    a50 a50Var = a50.v;
                    if (a50Var.c()) {
                        a50Var.b();
                        if (fragmentContextView.h != null && fragmentContextView.C0 != null) {
                            k20 k20Var = new k20(fragmentContextView, fragmentContextView.getContext());
                            fragmentContextView.B0 = k20Var;
                            k20Var.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
                            fragmentContextView.B0.setText(LocaleController.getString(R.string.SpeedHint));
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                            marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                            fragmentContextView.C0.addView(fragmentContextView.B0, marginLayoutParams);
                            fragmentContextView.B0.f(fragmentContextView.G, true);
                        }
                    }
                }
                fragmentContextView.D0 = currentTimeMillis;
                break;
            case 4:
                s20 s20Var = (s20) this.b;
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.c;
                int indexOf = s20Var.F.indexOf(u0Var.getFilter());
                if (s20Var.I != indexOf) {
                    s20Var.I = indexOf;
                    s20Var.f();
                    break;
                } else if (u0Var.getFilter().h) {
                    if (u0Var.a.f) {
                        gg.p0 filter = u0Var.getFilter();
                        s20Var.g(filter);
                        r20 r20Var = s20Var.H;
                        if (r20Var != null) {
                            ((org.telegram.ui.yx) r20Var).d(filter);
                            break;
                        }
                    } else {
                        u0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 5:
                ((a3) this.c).run(Long.valueOf(((x20) this.b).d));
                break;
            case 6:
                n40 n40Var = (n40) this.b;
                ((org.telegram.ui.dq) this.c).run();
                n40Var.dismiss();
                break;
            case 7:
                p80 p80Var = (p80) this.b;
                a3.h0 h0Var = (a3.h0) this.c;
                p80Var.u();
                h0Var.run();
                break;
            case 8:
                p80 p80Var2 = (p80) this.b;
                ((org.telegram.ui.sv) this.c).run();
                if (p80Var2.J) {
                    p80Var2.u();
                    break;
                }
                break;
            case 9:
                y80.o((y80) this.b, (w80) this.c);
                break;
            case 10:
                qf0.o((qf0) this.b, (org.telegram.ui.ActionBar.e6) this.c);
                break;
            case 11:
                jj0 jj0Var = (jj0) this.b;
                org.telegram.ui.rw rwVar = (org.telegram.ui.rw) this.c;
                if (jj0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, jj0Var.getValue());
                    org.telegram.ui.hd0 hd0Var = (org.telegram.ui.hd0) rwVar.b;
                    TLRPC.User user = (TLRPC.User) rwVar.c;
                    if (hd0Var.getLocationController().getSharingLocationInfo(hd0Var.e0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(hd0Var.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new gg.c2(hd0Var, user, max, 13));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        hd0Var.showDialog(alertDialog$Builder2.a);
                    } else {
                        hd0Var.R.L = true;
                        hd0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        hd0Var.l0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        hd0Var.getLocationController().setProximityLocation(hd0Var.e0, max, true);
                        r9 = 1;
                    }
                    if (r9 != 0) {
                        jj0Var.a();
                        break;
                    }
                }
                break;
            case 12:
                oj0 oj0Var = (oj0) this.b;
                Context context = (Context) this.c;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(oj0Var.b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, oj0Var.getTitleView().getText()), 500);
                        break;
                    } catch (ActivityNotFoundException e7) {
                        e7.printStackTrace();
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
                yh.e5 e5Var = (yh.e5) this.b;
                org.telegram.messenger.zj zjVar = (org.telegram.messenger.zj) this.c;
                e5Var.e = !e5Var.e;
                zjVar.run();
                e5Var.i(true);
                break;
            case 15:
                ty0 ty0Var = (ty0) this.b;
                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) this.c;
                org.telegram.ui.rt.q().v(ty0Var.r.m0);
                org.telegram.ui.rt.q().y(f8Var);
                break;
            case 16:
                CharSequence charSequence = (CharSequence) this.b;
                Runnable runnable = (Runnable) this.c;
                AndroidUtilities.addToClipboard(charSequence);
                runnable.run();
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
                m51 m51Var = (m51) this.b;
                c71 c71Var = (c71) this.c;
                m51Var.k0 = false;
                m51Var.K();
                c71Var.N(true);
                m51Var.u();
                break;
            case 19:
                h51 h51Var = (h51) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = h51Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(hs.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.al alVar = (org.telegram.ui.al) this.b;
                ((org.telegram.ui.ActionBar.n1) this.c).d(true);
                s51.a(alVar.getContext(), alVar.d);
                break;
            case 21:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i14 = UndoView.e0;
                undoView.e(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.n2 n2Var2 = undoView.s;
                tL_payments_getPaymentReceipt.peer = n2Var2.getMessagesController().getInputPeer(message.peer_id);
                n2Var2.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new y1(undoView, 18), 2);
                break;
            case 22:
                p71 p71Var = (p71) this.b;
                File file = (File) this.c;
                if (file == null) {
                    p71Var.getClass();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(p71Var.getContext());
                    if (findActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", findActivity, null, false);
                        p71Var.dismiss();
                        break;
                    }
                }
                break;
            case 23:
                org.telegram.ui.y30 y30Var = (org.telegram.ui.y30) this.b;
                org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) this.c;
                if (y30Var.h()) {
                    if (tf.c.a(g60Var.i0) > 0) {
                        org.telegram.ui.Components.voip.j1.n(g60Var.i0);
                        g60Var.dismiss();
                        break;
                    } else {
                        g5.A(g60Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(g60Var.i0)) {
                    q30.e0 = false;
                    g60Var.dismiss();
                    break;
                } else {
                    g5.z(y30Var.getContext()).o();
                    break;
                }
            case 24:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.b;
                ck0 ck0Var = (ck0) this.c;
                boolean z10 = x0Var.v;
                x0Var.v = !z10;
                if (z10) {
                    ck0Var.M(69);
                    ck0Var.P(99);
                } else {
                    ck0Var.M(36);
                    ck0Var.P(69);
                }
                ck0Var.start();
                break;
            case 25:
                boolean[] zArr2 = (boolean[]) this.b;
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.c;
                boolean z11 = !zArr2[0];
                zArr2[0] = z11;
                a2Var.c(z11, true);
                break;
            case 26:
                org.telegram.ui.Components.voip.m2 m2Var = (org.telegram.ui.Components.voip.m2) this.b;
                Context context3 = (Context) this.c;
                m2Var.getClass();
                boolean z12 = context3 instanceof LaunchActivity;
                if (!z12 || ApplicationLoader.mainInterfacePaused) {
                    if (z12) {
                        Intent intent3 = new Intent(context3, (Class<?>) LaunchActivity.class);
                        intent3.setAction("voip");
                        context3.startActivity(intent3);
                        break;
                    }
                } else {
                    wi1.v((Activity) context3, m2Var.M);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.qs qsVar = (org.telegram.ui.qs) this.b;
                qsVar.showDialog(g5.l(qsVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.c)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.t3(qsVar, 5), null, false, false, qsVar.r).a);
                break;
            case 28:
                org.telegram.ui.nt ntVar = (org.telegram.ui.nt) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                org.telegram.ui.rt rtVar = ntVar.a;
                if (rtVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        org.telegram.ui.pt ptVar = rtVar.l;
                        TLObject tLObject = rtVar.W;
                        if (tLObject == null) {
                            tLObject = rtVar.Z;
                        }
                        ptVar.t(0, 0, rtVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.pt ptVar2 = rtVar.l;
                        TLObject tLObject2 = rtVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = rtVar.Z;
                        }
                        ptVar2.t(0, 0, rtVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        MediaDataController.getInstance(rtVar.r).removeRecentGif(rtVar.W);
                        rtVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        MediaDataController.getInstance(rtVar.r).addRecentGif(rtVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        MessagesController.getInstance(rtVar.r).saveGif("gif", rtVar.W);
                        rtVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document = rtVar.W;
                        TLRPC.BotInlineResult botInlineResult = rtVar.Z;
                        Object obj = rtVar.b0;
                        org.telegram.ui.pt ptVar3 = rtVar.l;
                        g5.L(rtVar.w, ptVar3.a(), new a1.d(ptVar3, document, botInlineResult, obj, 9), rtVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.pt ptVar4 = rtVar.l;
                        TLObject tLObject3 = rtVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = rtVar.Z;
                        }
                        ptVar4.x(tLObject3, rtVar.b0);
                    }
                    rtVar.p();
                    break;
                }
                break;
            default:
                org.telegram.ui.iv ivVar = (org.telegram.ui.iv) this.b;
                zh.b bVar = (zh.b) this.c;
                org.telegram.ui.hv hvVar = ivVar.X;
                dz0[] dz0VarArr = ivVar.b0;
                for (dz0 dz0Var : dz0VarArr) {
                    if (dz0Var != null) {
                        boolean z13 = dz0Var.c;
                    }
                }
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) view;
                int intValue2 = ((Integer) a2Var2.getTag()).intValue();
                dz0 dz0Var2 = dz0VarArr[intValue2];
                boolean z14 = dz0Var2.c;
                boolean z15 = !z14;
                if (z14 != z15) {
                    dz0Var2.c = z15;
                    dz0Var2.d = true;
                }
                a2Var2.c(dz0Var2.c, true);
                boolean z16 = dz0VarArr[intValue2].c;
                ArrayList arrayList3 = bVar.d;
                HashSet hashSet = bVar.j;
                if (intValue2 == 0) {
                    bVar.m = z16;
                } else if (intValue2 != 1) {
                    if (intValue2 == 2) {
                        arrayList = bVar.e;
                        bVar.o = z16;
                    } else if (intValue2 == 3) {
                        arrayList = bVar.f;
                        bVar.p = z16;
                    } else if (intValue2 == 4) {
                        arrayList = bVar.g;
                        bVar.q = z16;
                    } else if (intValue2 == 7) {
                        arrayList = bVar.h;
                    }
                    if (arrayList != null) {
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            if (((zh.a) arrayList.get(i15)).d == intValue2) {
                                if (z16) {
                                    if (!hashSet.contains(arrayList.get(i15))) {
                                        hashSet.add((zh.a) arrayList.get(i15));
                                        bVar.g((zh.a) arrayList.get(i15), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i15))) {
                                    hashSet.remove(arrayList.get(i15));
                                    bVar.g((zh.a) arrayList.get(i15), false);
                                }
                            }
                        }
                    }
                    ivVar.e0.c();
                    ivVar.a0.a(hvVar.d(), true);
                    hvVar.c(true);
                    break;
                } else {
                    bVar.n = z16;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                ivVar.e0.c();
                ivVar.a0.a(hvVar.d(), true);
                hvVar.c(true);
        }
    }
}
