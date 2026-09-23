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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                ftVar.dismiss();
                n2Var.presentFragment(new org.telegram.ui.z6());
                break;
            case 1:
                tv.o((tv) this.b, (z5) this.c);
                break;
            case 2:
                cz czVar = (cz) this.b;
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) this.c;
                lz lzVar = czVar.v;
                tw twVar = lzVar.D0;
                if (twVar.indexOfChild(p8Var) != -1 && (T = twVar.T(p8Var)) != null) {
                    if (T.b() == lzVar.f1) {
                        if (lzVar.h1 != null) {
                            ly lyVar = lzVar.t1;
                            if (lyVar != null) {
                                lyVar.y(lzVar.J1.id);
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
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.show();
                        TextView textView = (TextView) b2Var.d(-1);
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
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.c;
                int indexOf = c20Var.F.indexOf(u0Var.getFilter());
                if (c20Var.I != indexOf) {
                    c20Var.I = indexOf;
                    c20Var.f();
                    break;
                } else if (u0Var.getFilter().h) {
                    if (u0Var.a.f) {
                        gg.q0 filter = u0Var.getFilter();
                        c20Var.g(filter);
                        b20 b20Var = c20Var.H;
                        if (b20Var != null) {
                            ((org.telegram.ui.wx) b20Var).h(filter);
                            break;
                        }
                    } else {
                        u0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 5:
                ((x2) this.c).run(Long.valueOf(((h20) this.b).d));
                break;
            case 6:
                x30 x30Var = (x30) this.b;
                ((org.telegram.ui.bq) this.c).run();
                x30Var.dismiss();
                break;
            case 7:
                o70 o70Var = (o70) this.b;
                a3.h0 h0Var = (a3.h0) this.c;
                o70Var.u();
                h0Var.run();
                break;
            case 8:
                o70 o70Var2 = (o70) this.b;
                ((org.telegram.ui.qv) this.c).run();
                if (o70Var2.J) {
                    o70Var2.u();
                    break;
                }
                break;
            case 9:
                x70.m((x70) this.b, (v70) this.c);
                break;
            case 10:
                pe0.m((pe0) this.b, (org.telegram.ui.ActionBar.d6) this.c);
                break;
            case 11:
                fi0 fi0Var = (fi0) this.b;
                org.telegram.ui.w10 w10Var = (org.telegram.ui.w10) this.c;
                if (fi0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, fi0Var.getValue());
                    org.telegram.ui.dd0 dd0Var = (org.telegram.ui.dd0) w10Var.b;
                    TLRPC.User user = (TLRPC.User) w10Var.c;
                    if (dd0Var.getLocationController().getSharingLocationInfo(dd0Var.e0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dd0Var.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new gg.d2(dd0Var, user, max, 13));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        dd0Var.showDialog(alertDialog$Builder2.a);
                    } else {
                        dd0Var.R.L = true;
                        dd0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        dd0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        dd0Var.getLocationController().setProximityLocation(dd0Var.e0, max, true);
                        z10 = true;
                    }
                    if (z10) {
                        fi0Var.a();
                        break;
                    }
                }
                break;
            case 12:
                ki0 ki0Var = (ki0) this.b;
                Context context = (Context) this.c;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(ki0Var.b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, ki0Var.getTitleView().getText()), 500);
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
                org.telegram.messenger.jk jkVar = (org.telegram.messenger.jk) this.c;
                l5Var.e = !l5Var.e;
                jkVar.run();
                l5Var.i(true);
                break;
            case 15:
                qx0 qx0Var = (qx0) this.b;
                org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) this.c;
                org.telegram.ui.pt.q().v(qx0Var.r.m0);
                org.telegram.ui.pt.q().y(g8Var);
                break;
            case 16:
                CharSequence charSequence = (CharSequence) this.b;
                uh.i iVar = (uh.i) this.c;
                AndroidUtilities.addToClipboard(charSequence);
                iVar.run();
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
                f41 f41Var = (f41) this.b;
                v51 v51Var = (v51) this.c;
                f41Var.k0 = false;
                f41Var.J();
                v51Var.N(true);
                f41Var.s();
                break;
            case 19:
                a41 a41Var = (a41) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = a41Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(rr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.b;
                ((org.telegram.ui.ActionBar.n1) this.c).d(true);
                l41.a(wkVar.getContext(), wkVar.d);
                break;
            case 21:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i15 = UndoView.e0;
                undoView.e(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.n2 n2Var2 = undoView.s;
                tL_payments_getPaymentReceipt.peer = n2Var2.getMessagesController().getInputPeer(message.peer_id);
                n2Var2.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new y1(undoView, 18), 2);
                break;
            case 22:
                j61 j61Var = (j61) this.b;
                File file = (File) this.c;
                if (file == null) {
                    j61Var.getClass();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(j61Var.getContext());
                    if (findActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", findActivity, null, false);
                        j61Var.dismiss();
                        break;
                    }
                }
                break;
            case 23:
                org.telegram.ui.x30 x30Var2 = (org.telegram.ui.x30) this.b;
                org.telegram.ui.f60 f60Var = (org.telegram.ui.f60) this.c;
                if (x30Var2.h()) {
                    if (sf.c.a(f60Var.i0) > 0) {
                        org.telegram.ui.Components.voip.j1.n(f60Var.i0);
                        f60Var.dismiss();
                        break;
                    } else {
                        e5.B(f60Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(f60Var.i0)) {
                    a30.e0 = false;
                    f60Var.dismiss();
                    break;
                } else {
                    e5.A(x30Var2.getContext()).o();
                    break;
                }
            case 24:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.b;
                yi0 yi0Var = (yi0) this.c;
                boolean z12 = x0Var.v;
                x0Var.v = !z12;
                if (z12) {
                    yi0Var.M(69);
                    yi0Var.P(99);
                } else {
                    yi0Var.M(36);
                    yi0Var.P(69);
                }
                yi0Var.start();
                break;
            case 25:
                boolean[] zArr2 = (boolean[]) this.b;
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) this.c;
                boolean z13 = !zArr2[0];
                zArr2[0] = z13;
                z1Var.c(z13, true);
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
                    mi1.w((Activity) context3, m2Var.L);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.ns nsVar = (org.telegram.ui.ns) this.b;
                nsVar.showDialog(e5.m(nsVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.c)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.t3(nsVar, 5), null, false, false, nsVar.r).a);
                break;
            case 28:
                org.telegram.ui.lt ltVar = (org.telegram.ui.lt) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                org.telegram.ui.pt ptVar = ltVar.a;
                if (ptVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        org.telegram.ui.nt ntVar = ptVar.l;
                        TLObject tLObject = ptVar.W;
                        if (tLObject == null) {
                            tLObject = ptVar.Z;
                        }
                        ntVar.t(0, 0, ptVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.nt ntVar2 = ptVar.l;
                        TLObject tLObject2 = ptVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = ptVar.Z;
                        }
                        ntVar2.t(0, 0, ptVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        MediaDataController.getInstance(ptVar.r).removeRecentGif(ptVar.W);
                        ptVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        MediaDataController.getInstance(ptVar.r).addRecentGif(ptVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        MessagesController.getInstance(ptVar.r).saveGif("gif", ptVar.W);
                        ptVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document = ptVar.W;
                        TLRPC.BotInlineResult botInlineResult = ptVar.Z;
                        Object obj = ptVar.b0;
                        org.telegram.ui.nt ntVar3 = ptVar.l;
                        e5.M(ptVar.w, ntVar3.a(), new a1.d(ntVar3, document, botInlineResult, obj, 9), ptVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.nt ntVar4 = ptVar.l;
                        TLObject tLObject3 = ptVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = ptVar.Z;
                        }
                        ntVar4.x(tLObject3, ptVar.b0);
                    }
                    ptVar.p();
                    break;
                }
                break;
            default:
                org.telegram.ui.gv gvVar = (org.telegram.ui.gv) this.b;
                zh.b bVar = (zh.b) this.c;
                org.telegram.ui.fv fvVar = gvVar.X;
                by0[] by0VarArr = gvVar.b0;
                for (by0 by0Var : by0VarArr) {
                    if (by0Var != null) {
                        boolean z15 = by0Var.c;
                    }
                }
                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                int intValue2 = ((Integer) z1Var2.getTag()).intValue();
                by0 by0Var2 = by0VarArr[intValue2];
                boolean z16 = by0Var2.c;
                boolean z17 = !z16;
                if (z16 != z17) {
                    by0Var2.c = z17;
                    by0Var2.d = true;
                }
                z1Var2.c(by0Var2.c, true);
                boolean z18 = by0VarArr[intValue2].c;
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
                    gvVar.e0.c();
                    gvVar.a0.a(fvVar.d(), true);
                    fvVar.c(true);
                    break;
                } else {
                    bVar.n = z18;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                gvVar.e0.c();
                gvVar.a0.a(fvVar.d(), true);
                fvVar.c(true);
        }
    }
}
