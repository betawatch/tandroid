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
import org.telegram.ui.ui1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ct implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ct(int i10, Object obj, Object obj2) {
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
        int i11 = 4;
        ArrayList arrayList = null;
        int i12 = 2;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                dt dtVar = (dt) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                dtVar.dismiss();
                n2Var.presentFragment(new org.telegram.ui.z6());
                break;
            case 1:
                rv.o((rv) this.b, (z5) this.c);
                break;
            case 2:
                bz bzVar = (bz) this.b;
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) this.c;
                kz kzVar = bzVar.v;
                tw twVar = kzVar.D0;
                if (twVar.indexOfChild(o8Var) != -1 && (T = twVar.T(o8Var)) != null) {
                    if (T.b() == kzVar.f1) {
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
                            kzVar.Z(false);
                            bz bzVar2 = kzVar.y0;
                            if (bzVar2 != null) {
                                bzVar2.l();
                                break;
                            }
                        }
                    } else if (bzVar.h.get(T.b()) == kzVar.j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bzVar.c);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new kv(bzVar, i12));
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
                float[] fArr2 = FragmentContextView.M0;
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
                        org.telegram.ui.ij ijVar = new org.telegram.ui.ij(6, 2, fragmentContextView.getContext(), null, z11);
                        fragmentContextView.A0 = ijVar;
                        ijVar.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
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
                        hg.q0 filter = u0Var.getFilter();
                        b20Var.g(filter);
                        a20 a20Var = b20Var.H;
                        if (a20Var != null) {
                            ((org.telegram.ui.zx) a20Var).c(filter);
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
                ((org.telegram.ui.gq) this.c).run();
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
                ((org.telegram.ui.uv) this.c).run();
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
                ei0 ei0Var = (ei0) this.b;
                org.telegram.ui.z10 z10Var = (org.telegram.ui.z10) this.c;
                if (ei0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, ei0Var.getValue());
                    org.telegram.ui.id0 id0Var = (org.telegram.ui.id0) z10Var.b;
                    TLRPC.User user = (TLRPC.User) z10Var.c;
                    if (id0Var.getLocationController().getSharingLocationInfo(id0Var.e0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(id0Var.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new hg.c2(id0Var, user, max, 12));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        id0Var.showDialog(alertDialog$Builder2.a);
                    } else {
                        id0Var.R.L = true;
                        id0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        id0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        id0Var.getLocationController().setProximityLocation(id0Var.e0, max, true);
                        z10 = true;
                    }
                    if (z10) {
                        ei0Var.a();
                        break;
                    }
                }
                break;
            case 12:
                ji0 ji0Var = (ji0) this.b;
                Context context = (Context) this.c;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(ji0Var.b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, ji0Var.getTitleView().getText()), 500);
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
                zh.j5 j5Var = (zh.j5) this.b;
                org.telegram.messenger.kk kkVar = (org.telegram.messenger.kk) this.c;
                j5Var.e = !j5Var.e;
                kkVar.run();
                j5Var.i(true);
                break;
            case 15:
                qx0 qx0Var = (qx0) this.b;
                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) this.c;
                org.telegram.ui.st.q().v(qx0Var.r.m0);
                org.telegram.ui.st.q().y(f8Var);
                break;
            case 16:
                CharSequence charSequence = (CharSequence) this.b;
                zh.q5 q5Var = (zh.q5) this.c;
                AndroidUtilities.addToClipboard(charSequence);
                q5Var.run();
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
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(pr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.zk zkVar = (org.telegram.ui.zk) this.b;
                ((org.telegram.ui.ActionBar.n1) this.c).d(true);
                l41.a(zkVar.getContext(), zkVar.d);
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
                org.telegram.ui.a40 a40Var = (org.telegram.ui.a40) this.b;
                org.telegram.ui.j60 j60Var = (org.telegram.ui.j60) this.c;
                if (a40Var.h()) {
                    if (tf.c.a(j60Var.i0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(j60Var.i0);
                        j60Var.dismiss();
                        break;
                    } else {
                        e5.B(j60Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(j60Var.i0)) {
                    z20.e0 = false;
                    j60Var.dismiss();
                    break;
                } else {
                    e5.A(a40Var.getContext()).o();
                    break;
                }
            case 24:
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.b;
                xi0 xi0Var = (xi0) this.c;
                boolean z12 = v0Var.v;
                v0Var.v = !z12;
                if (z12) {
                    xi0Var.K(69);
                    xi0Var.N(99);
                } else {
                    xi0Var.K(36);
                    xi0Var.N(69);
                }
                xi0Var.start();
                break;
            case 25:
                boolean[] zArr2 = (boolean[]) this.b;
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) this.c;
                boolean z13 = !zArr2[0];
                zArr2[0] = z13;
                z1Var.c(z13, true);
                break;
            case 26:
                org.telegram.ui.Components.voip.k2 k2Var = (org.telegram.ui.Components.voip.k2) this.b;
                Context context3 = (Context) this.c;
                k2Var.getClass();
                boolean z14 = context3 instanceof LaunchActivity;
                if (!z14 || ApplicationLoader.mainInterfacePaused) {
                    if (z14) {
                        Intent intent3 = new Intent(context3, (Class<?>) LaunchActivity.class);
                        intent3.setAction("voip");
                        context3.startActivity(intent3);
                        break;
                    }
                } else {
                    ui1.w((Activity) context3, k2Var.L);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.ss ssVar = (org.telegram.ui.ss) this.b;
                ssVar.showDialog(e5.m(ssVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.c)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.t3(ssVar, i11), null, false, false, ssVar.r).a);
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
                        qtVar.r(0, 0, stVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.qt qtVar2 = stVar.l;
                        TLObject tLObject2 = stVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = stVar.Z;
                        }
                        qtVar2.r(0, 0, stVar.b0, tLObject2, false);
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
                        qtVar4.w(tLObject3, stVar.b0);
                    }
                    stVar.p();
                    break;
                }
                break;
            default:
                org.telegram.ui.kv kvVar = (org.telegram.ui.kv) this.b;
                ai.c cVar = (ai.c) this.c;
                org.telegram.ui.jv jvVar = kvVar.X;
                by0[] by0VarArr = kvVar.b0;
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
                ArrayList arrayList3 = cVar.d;
                HashSet hashSet = cVar.j;
                if (intValue2 == 0) {
                    cVar.m = z18;
                } else if (intValue2 != 1) {
                    if (intValue2 == 2) {
                        arrayList = cVar.e;
                        cVar.o = z18;
                    } else if (intValue2 == 3) {
                        arrayList = cVar.f;
                        cVar.p = z18;
                    } else if (intValue2 == 4) {
                        arrayList = cVar.g;
                        cVar.q = z18;
                    } else if (intValue2 == 7) {
                        arrayList = cVar.h;
                    }
                    if (arrayList != null) {
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            if (((ai.b) arrayList.get(i17)).d == intValue2) {
                                if (z18) {
                                    if (!hashSet.contains(arrayList.get(i17))) {
                                        hashSet.add((ai.b) arrayList.get(i17));
                                        cVar.g((ai.b) arrayList.get(i17), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i17))) {
                                    hashSet.remove(arrayList.get(i17));
                                    cVar.g((ai.b) arrayList.get(i17), false);
                                }
                            }
                        }
                    }
                    kvVar.e0.c();
                    kvVar.a0.a(jvVar.d(), true);
                    jvVar.c(true);
                    break;
                } else {
                    cVar.n = z18;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                kvVar.e0.c();
                kvVar.a0.a(jvVar.d(), true);
                jvVar.c(true);
        }
    }
}
