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
import org.telegram.ui.dj1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class rt implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rt(int i10, Object obj, Object obj2) {
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
        s4.b1 T;
        int i10 = -1;
        int i11 = 2;
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                st stVar = (st) this.b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.c;
                stVar.dismiss();
                m2Var.presentFragment(new org.telegram.ui.d7());
                break;
            case 1:
                ew.q((ew) this.b, (b6) this.c);
                break;
            case 2:
                mz mzVar = (mz) this.b;
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) this.c;
                wz wzVar = mzVar.v;
                ex exVar = wzVar.D0;
                if (exVar.indexOfChild(o8Var) != -1 && (T = exVar.T(o8Var)) != null) {
                    if (T.b() == wzVar.f1) {
                        if (wzVar.h1 != null) {
                            wy wyVar = wzVar.t1;
                            if (wyVar != null) {
                                wyVar.y(wzVar.J1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(wzVar.c1).edit();
                            String str = "group_hide_stickers_" + wzVar.J1.id;
                            TLRPC.StickerSet stickerSet = wzVar.J1.stickerset;
                            edit.putLong(str, stickerSet != null ? stickerSet.id : 0L).apply();
                            wzVar.X(false);
                            mz mzVar2 = wzVar.y0;
                            if (mzVar2 != null) {
                                mzVar2.l();
                                break;
                            }
                        }
                    } else if (mzVar.h.get(T.b()) == wzVar.j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mzVar.c);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new xv(mzVar, i11));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                        a2Var.show();
                        TextView textView = (TextView) a2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
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
                    w40 w40Var = w40.v;
                    if (w40Var.c()) {
                        w40Var.b();
                        if (fragmentContextView.h != null && fragmentContextView.C0 != null) {
                            g20 g20Var = new g20(fragmentContextView, fragmentContextView.getContext());
                            fragmentContextView.B0 = g20Var;
                            g20Var.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
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
                o20 o20Var = (o20) this.b;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.c;
                int indexOf = o20Var.F.indexOf(t0Var.getFilter());
                if (o20Var.I != indexOf) {
                    o20Var.I = indexOf;
                    o20Var.f();
                    break;
                } else if (t0Var.getFilter().h) {
                    if (t0Var.a.f) {
                        hg.p0 filter = t0Var.getFilter();
                        o20Var.g(filter);
                        n20 n20Var = o20Var.H;
                        if (n20Var != null) {
                            ((org.telegram.ui.ey) n20Var).c(filter);
                            break;
                        }
                    } else {
                        t0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 5:
                ((a3) this.c).run(Long.valueOf(((t20) this.b).d));
                break;
            case 6:
                j40 j40Var = (j40) this.b;
                ((org.telegram.ui.jq) this.c).run();
                j40Var.dismiss();
                break;
            case 7:
                m80 m80Var = (m80) this.b;
                a3.i0 i0Var = (a3.i0) this.c;
                m80Var.u();
                i0Var.run();
                break;
            case 8:
                m80 m80Var2 = (m80) this.b;
                ((org.telegram.ui.yv) this.c).run();
                if (m80Var2.J) {
                    m80Var2.u();
                    break;
                }
                break;
            case 9:
                w80.n((w80) this.b, (u80) this.c);
                break;
            case 10:
                of0.n((of0) this.b, (org.telegram.ui.ActionBar.c6) this.c);
                break;
            case 11:
                fj0 fj0Var = (fj0) this.b;
                org.telegram.ui.gw gwVar = (org.telegram.ui.gw) this.c;
                if (fj0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, fj0Var.getValue());
                    org.telegram.ui.nd0 nd0Var = (org.telegram.ui.nd0) gwVar.b;
                    TLRPC.User user = (TLRPC.User) gwVar.c;
                    if (nd0Var.getLocationController().getSharingLocationInfo(nd0Var.e0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(nd0Var.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new hg.b2(nd0Var, user, max, 13));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        nd0Var.showDialog(alertDialog$Builder2.a);
                    } else {
                        nd0Var.R.L = true;
                        nd0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        nd0Var.l0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        nd0Var.getLocationController().setProximityLocation(nd0Var.e0, max, true);
                        r9 = 1;
                    }
                    if (r9 != 0) {
                        fj0Var.a();
                        break;
                    }
                }
                break;
            case 12:
                kj0 kj0Var = (kj0) this.b;
                Context context = (Context) this.c;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(kj0Var.b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, kj0Var.getTitleView().getText()), 500);
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
                zh.f5 f5Var = (zh.f5) this.b;
                org.telegram.messenger.ck ckVar = (org.telegram.messenger.ck) this.c;
                f5Var.e = !f5Var.e;
                ckVar.run();
                f5Var.i(true);
                break;
            case 15:
                py0 py0Var = (py0) this.b;
                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) this.c;
                org.telegram.ui.xt.q().v(py0Var.r.m0);
                org.telegram.ui.xt.q().y(f8Var);
                break;
            case 16:
                CharSequence charSequence = (CharSequence) this.b;
                Runnable runnable = (Runnable) this.c;
                AndroidUtilities.addToClipboard(charSequence);
                runnable.run();
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
                i51 i51Var = (i51) this.b;
                z61 z61Var = (z61) this.c;
                i51Var.k0 = false;
                i51Var.K();
                z61Var.N(true);
                i51Var.u();
                break;
            case 19:
                d51 d51Var = (d51) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = d51Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(es.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.el elVar = (org.telegram.ui.el) this.b;
                ((org.telegram.ui.ActionBar.m1) this.c).d(true);
                o51.a(elVar.getContext(), elVar.d);
                break;
            case 21:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i14 = UndoView.e0;
                undoView.e(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.m2 m2Var2 = undoView.s;
                tL_payments_getPaymentReceipt.peer = m2Var2.getMessagesController().getInputPeer(message.peer_id);
                m2Var2.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new y1(undoView, 18), 2);
                break;
            case 22:
                m71 m71Var = (m71) this.b;
                File file = (File) this.c;
                if (file == null) {
                    m71Var.getClass();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(m71Var.getContext());
                    if (findActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", findActivity, null, false);
                        m71Var.dismiss();
                        break;
                    }
                }
                break;
            case 23:
                org.telegram.ui.e40 e40Var = (org.telegram.ui.e40) this.b;
                org.telegram.ui.n60 n60Var = (org.telegram.ui.n60) this.c;
                if (e40Var.h()) {
                    if (uf.b.a(n60Var.i0) > 0) {
                        org.telegram.ui.Components.voip.h1.n(n60Var.i0);
                        n60Var.dismiss();
                        break;
                    } else {
                        g5.A(n60Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(n60Var.i0)) {
                    m30.e0 = false;
                    n60Var.dismiss();
                    break;
                } else {
                    g5.z(e40Var.getContext()).o();
                    break;
                }
            case 24:
                org.telegram.ui.Components.voip.v0 v0Var = (org.telegram.ui.Components.voip.v0) this.b;
                yj0 yj0Var = (yj0) this.c;
                boolean z10 = v0Var.v;
                v0Var.v = !z10;
                if (z10) {
                    yj0Var.M(69);
                    yj0Var.P(99);
                } else {
                    yj0Var.M(36);
                    yj0Var.P(69);
                }
                yj0Var.start();
                break;
            case 25:
                boolean[] zArr2 = (boolean[]) this.b;
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) this.c;
                boolean z11 = !zArr2[0];
                zArr2[0] = z11;
                a2Var2.c(z11, true);
                break;
            case 26:
                org.telegram.ui.Components.voip.k2 k2Var = (org.telegram.ui.Components.voip.k2) this.b;
                Context context3 = (Context) this.c;
                k2Var.getClass();
                boolean z12 = context3 instanceof LaunchActivity;
                if (!z12 || ApplicationLoader.mainInterfacePaused) {
                    if (z12) {
                        Intent intent3 = new Intent(context3, (Class<?>) LaunchActivity.class);
                        intent3.setAction("voip");
                        context3.startActivity(intent3);
                        break;
                    }
                } else {
                    dj1.v((Activity) context3, k2Var.M);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.ws wsVar = (org.telegram.ui.ws) this.b;
                wsVar.showDialog(g5.l(wsVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.c)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.v3(wsVar, 5), null, false, false, wsVar.r).a);
                break;
            case 28:
                org.telegram.ui.tt ttVar = (org.telegram.ui.tt) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                org.telegram.ui.xt xtVar = ttVar.a;
                if (xtVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        org.telegram.ui.vt vtVar = xtVar.l;
                        TLObject tLObject = xtVar.W;
                        if (tLObject == null) {
                            tLObject = xtVar.Z;
                        }
                        vtVar.s(0, 0, xtVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.vt vtVar2 = xtVar.l;
                        TLObject tLObject2 = xtVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = xtVar.Z;
                        }
                        vtVar2.s(0, 0, xtVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        MediaDataController.getInstance(xtVar.r).removeRecentGif(xtVar.W);
                        xtVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        MediaDataController.getInstance(xtVar.r).addRecentGif(xtVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        MessagesController.getInstance(xtVar.r).saveGif("gif", xtVar.W);
                        xtVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document = xtVar.W;
                        TLRPC.BotInlineResult botInlineResult = xtVar.Z;
                        Object obj = xtVar.b0;
                        org.telegram.ui.vt vtVar3 = xtVar.l;
                        g5.L(xtVar.w, vtVar3.a(), new a1.d(vtVar3, document, botInlineResult, obj, 9), xtVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.vt vtVar4 = xtVar.l;
                        TLObject tLObject3 = xtVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = xtVar.Z;
                        }
                        vtVar4.x(tLObject3, xtVar.b0);
                    }
                    xtVar.p();
                    break;
                }
                break;
            default:
                org.telegram.ui.ov ovVar = (org.telegram.ui.ov) this.b;
                ai.c cVar = (ai.c) this.c;
                org.telegram.ui.nv nvVar = ovVar.X;
                zy0[] zy0VarArr = ovVar.b0;
                for (zy0 zy0Var : zy0VarArr) {
                    if (zy0Var != null) {
                        boolean z13 = zy0Var.c;
                    }
                }
                org.telegram.ui.Cells.a2 a2Var3 = (org.telegram.ui.Cells.a2) view;
                int intValue2 = ((Integer) a2Var3.getTag()).intValue();
                zy0 zy0Var2 = zy0VarArr[intValue2];
                boolean z14 = zy0Var2.c;
                boolean z15 = !z14;
                if (z14 != z15) {
                    zy0Var2.c = z15;
                    zy0Var2.d = true;
                }
                a2Var3.c(zy0Var2.c, true);
                boolean z16 = zy0VarArr[intValue2].c;
                ArrayList arrayList3 = cVar.d;
                HashSet hashSet = cVar.j;
                if (intValue2 == 0) {
                    cVar.m = z16;
                } else if (intValue2 != 1) {
                    if (intValue2 == 2) {
                        arrayList = cVar.e;
                        cVar.o = z16;
                    } else if (intValue2 == 3) {
                        arrayList = cVar.f;
                        cVar.p = z16;
                    } else if (intValue2 == 4) {
                        arrayList = cVar.g;
                        cVar.q = z16;
                    } else if (intValue2 == 7) {
                        arrayList = cVar.h;
                    }
                    if (arrayList != null) {
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            if (((ai.b) arrayList.get(i15)).d == intValue2) {
                                if (z16) {
                                    if (!hashSet.contains(arrayList.get(i15))) {
                                        hashSet.add((ai.b) arrayList.get(i15));
                                        cVar.g((ai.b) arrayList.get(i15), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i15))) {
                                    hashSet.remove(arrayList.get(i15));
                                    cVar.g((ai.b) arrayList.get(i15), false);
                                }
                            }
                        }
                    }
                    ovVar.e0.c();
                    ovVar.a0.a(nvVar.d(), true);
                    nvVar.c(true);
                    break;
                } else {
                    cVar.n = z16;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                ovVar.e0.c();
                ovVar.a0.a(nvVar.d(), true);
                nvVar.c(true);
        }
    }
}
