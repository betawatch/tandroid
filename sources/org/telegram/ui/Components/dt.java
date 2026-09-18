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
import org.telegram.ui.ti1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
                etVar.dismiss();
                o2Var.presentFragment(new org.telegram.ui.a7());
                break;
            case 1:
                sv.o((sv) this.b, (x5) this.c);
                break;
            case 2:
                bz bzVar = (bz) this.b;
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) this.c;
                kz kzVar = bzVar.v;
                sw swVar = kzVar.D0;
                if (swVar.indexOfChild(o8Var) != -1 && (U = swVar.U(o8Var)) != null) {
                    if (U.b() == kzVar.f1) {
                        if (kzVar.h1 != null) {
                            ky kyVar = kzVar.t1;
                            if (kyVar != null) {
                                kyVar.y(kzVar.J1.id);
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
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.show();
                        TextView textView = (TextView) c2Var.d(-1);
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
                        org.telegram.ui.jj jjVar = new org.telegram.ui.jj(6, 2, fragmentContextView.getContext(), null, z11);
                        fragmentContextView.A0 = jjVar;
                        jjVar.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
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
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.c;
                int indexOf = b20Var.F.indexOf(v0Var.getFilter());
                if (b20Var.I != indexOf) {
                    b20Var.I = indexOf;
                    b20Var.f();
                    break;
                } else if (v0Var.getFilter().h) {
                    if (v0Var.a.f) {
                        gg.q0 filter = v0Var.getFilter();
                        b20Var.g(filter);
                        a20 a20Var = b20Var.H;
                        if (a20Var != null) {
                            ((org.telegram.ui.cy) a20Var).h(filter);
                            break;
                        }
                    } else {
                        v0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 5:
                ((x2) this.c).run(Long.valueOf(((g20) this.b).d));
                break;
            case 6:
                w30 w30Var = (w30) this.b;
                ((org.telegram.ui.fq) this.c).run();
                w30Var.dismiss();
                break;
            case 7:
                n70 n70Var = (n70) this.b;
                a3.h0 h0Var = (a3.h0) this.c;
                n70Var.u();
                h0Var.run();
                break;
            case 8:
                n70 n70Var2 = (n70) this.b;
                ((org.telegram.ui.vv) this.c).run();
                if (n70Var2.J) {
                    n70Var2.u();
                    break;
                }
                break;
            case 9:
                w70.m((w70) this.b, (u70) this.c);
                break;
            case 10:
                pe0.m((pe0) this.b, (org.telegram.ui.ActionBar.f6) this.c);
                break;
            case 11:
                fi0 fi0Var = (fi0) this.b;
                org.telegram.ui.f20 f20Var = (org.telegram.ui.f20) this.c;
                if (fi0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, fi0Var.getValue());
                    org.telegram.ui.kd0 kd0Var = (org.telegram.ui.kd0) f20Var.b;
                    TLRPC.User user = (TLRPC.User) f20Var.c;
                    if (kd0Var.getLocationController().getSharingLocationInfo(kd0Var.e0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kd0Var.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new gg.d2(kd0Var, user, max, 12));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        kd0Var.showDialog(alertDialog$Builder2.a);
                    } else {
                        kd0Var.R.L = true;
                        kd0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        kd0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        kd0Var.getLocationController().setProximityLocation(kd0Var.e0, max, true);
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
                yh.n5 n5Var = (yh.n5) this.b;
                org.telegram.messenger.kk kkVar = (org.telegram.messenger.kk) this.c;
                n5Var.e = !n5Var.e;
                kkVar.run();
                n5Var.i(true);
                break;
            case 15:
                sx0 sx0Var = (sx0) this.b;
                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) this.c;
                org.telegram.ui.ut.q().v(sx0Var.r.m0);
                org.telegram.ui.ut.q().y(f8Var);
                break;
            case 16:
                CharSequence charSequence = (CharSequence) this.b;
                uh.i iVar = (uh.i) this.c;
                AndroidUtilities.addToClipboard(charSequence);
                iVar.run();
                break;
            case 17:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.b;
                boolean[] zArr = (boolean[]) this.c;
                g3Var.dismiss();
                if (!zArr[0]) {
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 18:
                h41 h41Var = (h41) this.b;
                x51 x51Var = (x51) this.c;
                h41Var.k0 = false;
                h41Var.J();
                x51Var.N(true);
                h41Var.s();
                break;
            case 19:
                c41 c41Var = (c41) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = c41Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(qr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.al alVar = (org.telegram.ui.al) this.b;
                ((org.telegram.ui.ActionBar.o1) this.c).d(true);
                n41.a(alVar.getContext(), alVar.d);
                break;
            case 21:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i16 = UndoView.e0;
                undoView.e(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.o2 o2Var2 = undoView.s;
                tL_payments_getPaymentReceipt.peer = o2Var2.getMessagesController().getInputPeer(message.peer_id);
                o2Var2.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new x1(undoView, 18), 2);
                break;
            case 22:
                l61 l61Var = (l61) this.b;
                File file = (File) this.c;
                if (file == null) {
                    l61Var.getClass();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(l61Var.getContext());
                    if (findActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", findActivity, null, false);
                        l61Var.dismiss();
                        break;
                    }
                }
                break;
            case 23:
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) this.b;
                org.telegram.ui.k60 k60Var = (org.telegram.ui.k60) this.c;
                if (c40Var.h()) {
                    if (sf.c.a(k60Var.i0) > 0) {
                        org.telegram.ui.Components.voip.j1.n(k60Var.i0);
                        k60Var.dismiss();
                        break;
                    } else {
                        c5.B(k60Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(k60Var.i0)) {
                    z20.e0 = false;
                    k60Var.dismiss();
                    break;
                } else {
                    c5.A(c40Var.getContext()).o();
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
                    ti1.w((Activity) context3, m2Var.L);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.us usVar = (org.telegram.ui.us) this.b;
                usVar.showDialog(c5.m(usVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.c)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.s3(usVar, i11), null, false, false, usVar.r).a);
                break;
            case 28:
                org.telegram.ui.qt qtVar = (org.telegram.ui.qt) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                org.telegram.ui.ut utVar = qtVar.a;
                if (utVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        org.telegram.ui.st stVar = utVar.l;
                        TLObject tLObject = utVar.W;
                        if (tLObject == null) {
                            tLObject = utVar.Z;
                        }
                        stVar.s(0, 0, utVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.st stVar2 = utVar.l;
                        TLObject tLObject2 = utVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = utVar.Z;
                        }
                        stVar2.s(0, 0, utVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        MediaDataController.getInstance(utVar.r).removeRecentGif(utVar.W);
                        utVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        MediaDataController.getInstance(utVar.r).addRecentGif(utVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        MessagesController.getInstance(utVar.r).saveGif("gif", utVar.W);
                        utVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document = utVar.W;
                        TLRPC.BotInlineResult botInlineResult = utVar.Z;
                        Object obj = utVar.b0;
                        org.telegram.ui.st stVar3 = utVar.l;
                        c5.M(utVar.w, stVar3.a(), new a1.d(stVar3, document, botInlineResult, obj, 9), utVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.st stVar4 = utVar.l;
                        TLObject tLObject3 = utVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = utVar.Z;
                        }
                        stVar4.w(tLObject3, utVar.b0);
                    }
                    utVar.p();
                    break;
                }
                break;
            default:
                org.telegram.ui.lv lvVar = (org.telegram.ui.lv) this.b;
                zh.b bVar = (zh.b) this.c;
                org.telegram.ui.kv kvVar = lvVar.X;
                dy0[] dy0VarArr = lvVar.b0;
                for (dy0 dy0Var : dy0VarArr) {
                    if (dy0Var != null) {
                        boolean z15 = dy0Var.c;
                    }
                }
                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                int intValue2 = ((Integer) z1Var2.getTag()).intValue();
                dy0 dy0Var2 = dy0VarArr[intValue2];
                boolean z16 = dy0Var2.c;
                boolean z17 = !z16;
                if (z16 != z17) {
                    dy0Var2.c = z17;
                    dy0Var2.d = true;
                }
                z1Var2.c(dy0Var2.c, true);
                boolean z18 = dy0VarArr[intValue2].c;
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
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            if (((zh.a) arrayList.get(i17)).d == intValue2) {
                                if (z18) {
                                    if (!hashSet.contains(arrayList.get(i17))) {
                                        hashSet.add((zh.a) arrayList.get(i17));
                                        bVar.g((zh.a) arrayList.get(i17), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i17))) {
                                    hashSet.remove(arrayList.get(i17));
                                    bVar.g((zh.a) arrayList.get(i17), false);
                                }
                            }
                        }
                    }
                    lvVar.e0.d();
                    lvVar.a0.a(kvVar.d(), true);
                    kvVar.c(true);
                    break;
                } else {
                    bVar.n = z18;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                lvVar.e0.d();
                lvVar.a0.a(kvVar.d(), true);
                kvVar.c(true);
        }
    }
}
