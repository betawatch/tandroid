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
import org.telegram.ui.mi1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class et implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ et(int i10, Object obj, Object obj2) {
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
        s4.c1 T;
        int i10 = -1;
        ArrayList arrayList = null;
        int i11 = 2;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                ft ftVar = (ft) this.b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.c;
                ftVar.dismiss();
                m2Var.presentFragment(new org.telegram.ui.z6());
                break;
            case 1:
                tv.o((tv) this.b, (z5) this.c);
                break;
            case 2:
                cz czVar = (cz) this.b;
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) this.c;
                lz lzVar = czVar.v;
                tw twVar = lzVar.D0;
                if (twVar.indexOfChild(o8Var) != -1 && (T = twVar.T(o8Var)) != null) {
                    if (T.b() == lzVar.f1) {
                        if (lzVar.h1 != null) {
                            my myVar = lzVar.t1;
                            if (myVar != null) {
                                myVar.y(lzVar.J1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(lzVar.c1).edit();
                            String str = "group_hide_stickers_" + lzVar.J1.id;
                            TLRPC.StickerSet stickerSet = lzVar.J1.stickerset;
                            edit.putLong(str, stickerSet != null ? stickerSet.id : 0L).apply();
                            lzVar.X(false);
                            cz czVar2 = lzVar.y0;
                            if (czVar2 != null) {
                                czVar2.l();
                                break;
                            }
                        }
                    } else if (czVar.h.get(T.b()) == lzVar.j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(czVar.c);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new mv(czVar, i11));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                        a2Var.show();
                        TextView textView = (TextView) a2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
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
                boolean z11 = true;
                int i13 = i10 + 1;
                if (i13 >= 3) {
                    i13 = 0;
                }
                float f7 = fArr[i13];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.V, f7);
                fragmentContextView.l(playbackSpeed, f7, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - fragmentContextView.B0 > 300) {
                    int i14 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
                    if (i14 > 2) {
                        i14 = -10;
                    }
                    MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i14).apply();
                    if (i14 >= 0 && fragmentContextView.h != null && (fragmentContextView.getParent() instanceof ViewGroup)) {
                        org.telegram.ui.fj fjVar = new org.telegram.ui.fj(6, 2, fragmentContextView.getContext(), null, z11);
                        fragmentContextView.A0 = fjVar;
                        fjVar.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
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
                c20 c20Var = (c20) this.b;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.c;
                int indexOf = c20Var.F.indexOf(t0Var.getFilter());
                if (c20Var.I != indexOf) {
                    c20Var.I = indexOf;
                    c20Var.f();
                    break;
                } else if (t0Var.getFilter().h) {
                    if (t0Var.a.f) {
                        gg.q0 filter = t0Var.getFilter();
                        c20Var.g(filter);
                        b20 b20Var = c20Var.H;
                        if (b20Var != null) {
                            ((org.telegram.ui.vx) b20Var).h(filter);
                            break;
                        }
                    } else {
                        t0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 5:
                ((y2) this.c).run(Long.valueOf(((h20) this.b).d));
                break;
            case 6:
                x30 x30Var = (x30) this.b;
                ((org.telegram.ui.aq) this.c).run();
                x30Var.dismiss();
                break;
            case 7:
                y70 y70Var = (y70) this.b;
                a3.h0 h0Var = (a3.h0) this.c;
                y70Var.u();
                h0Var.run();
                break;
            case 8:
                y70 y70Var2 = (y70) this.b;
                ((org.telegram.ui.pv) this.c).run();
                if (y70Var2.J) {
                    y70Var2.u();
                    break;
                }
                break;
            case 9:
                h80.m((h80) this.b, (f80) this.c);
                break;
            case 10:
                ze0.m((ze0) this.b, (org.telegram.ui.ActionBar.d6) this.c);
                break;
            case 11:
                pi0 pi0Var = (pi0) this.b;
                org.telegram.ui.ow owVar = (org.telegram.ui.ow) this.c;
                if (pi0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, pi0Var.getValue());
                    org.telegram.ui.cd0 cd0Var = (org.telegram.ui.cd0) owVar.b;
                    TLRPC.User user = (TLRPC.User) owVar.c;
                    if (cd0Var.getLocationController().getSharingLocationInfo(cd0Var.e0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(cd0Var.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new gg.d2(cd0Var, user, max, 13));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        cd0Var.showDialog(alertDialog$Builder2.a);
                    } else {
                        cd0Var.R.L = true;
                        cd0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        cd0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        cd0Var.getLocationController().setProximityLocation(cd0Var.e0, max, true);
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
                yh.k5 k5Var = (yh.k5) this.b;
                org.telegram.messenger.ik ikVar = (org.telegram.messenger.ik) this.c;
                k5Var.e = !k5Var.e;
                ikVar.run();
                k5Var.i(true);
                break;
            case 15:
                by0 by0Var = (by0) this.b;
                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) this.c;
                org.telegram.ui.nt.q().v(by0Var.r.m0);
                org.telegram.ui.nt.q().y(f8Var);
                break;
            case 16:
                CharSequence charSequence = (CharSequence) this.b;
                yh.z5 z5Var = (yh.z5) this.c;
                AndroidUtilities.addToClipboard(charSequence);
                z5Var.run();
                break;
            case 17:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.b;
                boolean[] zArr = (boolean[]) this.c;
                e3Var.dismiss();
                if (!zArr[0]) {
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 18:
                t41 t41Var = (t41) this.b;
                j61 j61Var = (j61) this.c;
                t41Var.k0 = false;
                t41Var.J();
                j61Var.N(true);
                t41Var.s();
                break;
            case 19:
                o41 o41Var = (o41) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = o41Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(rr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.b;
                ((org.telegram.ui.ActionBar.m1) this.c).d(true);
                z41.a(wkVar.getContext(), wkVar.d);
                break;
            case 21:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i15 = UndoView.e0;
                undoView.e(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.m2 m2Var2 = undoView.s;
                tL_payments_getPaymentReceipt.peer = m2Var2.getMessagesController().getInputPeer(message.peer_id);
                m2Var2.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new y1(undoView, 18), 2);
                break;
            case 22:
                x61 x61Var = (x61) this.b;
                File file = (File) this.c;
                if (file == null) {
                    x61Var.getClass();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(x61Var.getContext());
                    if (findActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", findActivity, null, false);
                        x61Var.dismiss();
                        break;
                    }
                }
                break;
            case 23:
                org.telegram.ui.v30 v30Var = (org.telegram.ui.v30) this.b;
                org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) this.c;
                if (v30Var.h()) {
                    if (sf.c.a(d60Var.i0) > 0) {
                        org.telegram.ui.Components.voip.k1.n(d60Var.i0);
                        d60Var.dismiss();
                        break;
                    } else {
                        e5.B(d60Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(d60Var.i0)) {
                    a30.e0 = false;
                    d60Var.dismiss();
                    break;
                } else {
                    e5.A(v30Var.getContext()).o();
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
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) this.c;
                boolean z13 = !zArr2[0];
                zArr2[0] = z13;
                a2Var2.c(z13, true);
                break;
            case 26:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) this.b;
                Context context3 = (Context) this.c;
                n2Var.getClass();
                boolean z14 = context3 instanceof LaunchActivity;
                if (!z14 || ApplicationLoader.mainInterfacePaused) {
                    if (z14) {
                        Intent intent3 = new Intent(context3, (Class<?>) LaunchActivity.class);
                        intent3.setAction("voip");
                        context3.startActivity(intent3);
                        break;
                    }
                } else {
                    mi1.w((Activity) context3, n2Var.L);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.ms msVar = (org.telegram.ui.ms) this.b;
                msVar.showDialog(e5.m(msVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.c)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.t3(msVar, 5), null, false, false, msVar.r).a);
                break;
            case 28:
                org.telegram.ui.jt jtVar = (org.telegram.ui.jt) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                org.telegram.ui.nt ntVar = jtVar.a;
                if (ntVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        org.telegram.ui.lt ltVar = ntVar.l;
                        TLObject tLObject = ntVar.W;
                        if (tLObject == null) {
                            tLObject = ntVar.Z;
                        }
                        ltVar.t(0, 0, ntVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.lt ltVar2 = ntVar.l;
                        TLObject tLObject2 = ntVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = ntVar.Z;
                        }
                        ltVar2.t(0, 0, ntVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        MediaDataController.getInstance(ntVar.r).removeRecentGif(ntVar.W);
                        ntVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        MediaDataController.getInstance(ntVar.r).addRecentGif(ntVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        MessagesController.getInstance(ntVar.r).saveGif("gif", ntVar.W);
                        ntVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document = ntVar.W;
                        TLRPC.BotInlineResult botInlineResult = ntVar.Z;
                        Object obj = ntVar.b0;
                        org.telegram.ui.lt ltVar3 = ntVar.l;
                        e5.M(ntVar.w, ltVar3.a(), new a1.d(ltVar3, document, botInlineResult, obj, 9), ntVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.lt ltVar4 = ntVar.l;
                        TLObject tLObject3 = ntVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = ntVar.Z;
                        }
                        ltVar4.x(tLObject3, ntVar.b0);
                    }
                    ntVar.p();
                    break;
                }
                break;
            default:
                org.telegram.ui.fv fvVar = (org.telegram.ui.fv) this.b;
                zh.b bVar = (zh.b) this.c;
                org.telegram.ui.ev evVar = fvVar.X;
                my0[] my0VarArr = fvVar.b0;
                for (my0 my0Var : my0VarArr) {
                    if (my0Var != null) {
                        boolean z15 = my0Var.c;
                    }
                }
                org.telegram.ui.Cells.a2 a2Var3 = (org.telegram.ui.Cells.a2) view;
                int intValue2 = ((Integer) a2Var3.getTag()).intValue();
                my0 my0Var2 = my0VarArr[intValue2];
                boolean z16 = my0Var2.c;
                boolean z17 = !z16;
                if (z16 != z17) {
                    my0Var2.c = z17;
                    my0Var2.d = true;
                }
                a2Var3.c(my0Var2.c, true);
                boolean z18 = my0VarArr[intValue2].c;
                ArrayList arrayList3 = bVar.d;
                HashSet hashSet = bVar.j;
                if (intValue2 == 0) {
                    bVar.m = z18;
                } else if (intValue2 != 1) {
                    if (intValue2 == 2) {
                        arrayList = bVar.e;
                        bVar.o = z18;
                    } else if (intValue2 == 3) {
                        arrayList = bVar.f;
                        bVar.p = z18;
                    } else if (intValue2 == 4) {
                        arrayList = bVar.g;
                        bVar.q = z18;
                    } else if (intValue2 == 7) {
                        arrayList = bVar.h;
                    }
                    if (arrayList != null) {
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            if (((zh.a) arrayList.get(i16)).d == intValue2) {
                                if (z18) {
                                    if (!hashSet.contains(arrayList.get(i16))) {
                                        hashSet.add((zh.a) arrayList.get(i16));
                                        bVar.g((zh.a) arrayList.get(i16), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i16))) {
                                    hashSet.remove(arrayList.get(i16));
                                    bVar.g((zh.a) arrayList.get(i16), false);
                                }
                            }
                        }
                    }
                    fvVar.e0.c();
                    fvVar.a0.a(evVar.d(), true);
                    evVar.c(true);
                    break;
                } else {
                    bVar.n = z18;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                fvVar.e0.c();
                fvVar.a0.a(evVar.d(), true);
                evVar.c(true);
        }
    }
}
