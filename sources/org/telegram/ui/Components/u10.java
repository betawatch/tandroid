package org.telegram.ui.Components;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.zi1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class u10 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u10(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i10 = 4;
        ArrayList arrayList = null;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = (float[]) this.c;
                float[] fArr2 = FragmentContextView.M0;
                float playbackSpeed = MediaController.getInstance().getPlaybackSpeed(fragmentContextView.V);
                int i11 = 0;
                while (true) {
                    if (i11 >= 3) {
                        i11 = -1;
                    } else if (playbackSpeed - 0.1f > fArr[i11]) {
                        i11++;
                    }
                }
                boolean z11 = true;
                int i12 = i11 + 1;
                if (i12 >= 3) {
                    i12 = 0;
                }
                float f7 = fArr[i12];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.V, f7);
                fragmentContextView.l(playbackSpeed, f7, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - fragmentContextView.B0 > 300) {
                    int i13 = MessagesController.getGlobalNotificationsSettings().getInt("speedhint", 0) + 1;
                    if (i13 > 2) {
                        i13 = -10;
                    }
                    MessagesController.getGlobalNotificationsSettings().edit().putInt("speedhint", i13).apply();
                    if (i13 >= 0 && fragmentContextView.h != null && (fragmentContextView.getParent() instanceof ViewGroup)) {
                        org.telegram.ui.kj kjVar = new org.telegram.ui.kj(6, 2, fragmentContextView.getContext(), null, z11);
                        fragmentContextView.A0 = kjVar;
                        kjVar.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
                        fragmentContextView.A0.setText(LocaleController.getString(R.string.SpeedHint));
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                        ((ViewGroup) fragmentContextView.getParent()).addView(fragmentContextView.A0, marginLayoutParams);
                        fragmentContextView.A0.f(fragmentContextView.F, true);
                    }
                }
                fragmentContextView.B0 = currentTimeMillis;
                break;
            case 1:
                k20 k20Var = (k20) this.b;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.c;
                int indexOf = k20Var.F.indexOf(v0Var.getFilter());
                if (k20Var.I != indexOf) {
                    k20Var.I = indexOf;
                    k20Var.f();
                    break;
                } else if (v0Var.getFilter().h) {
                    if (v0Var.a.f) {
                        fg.q0 filter = v0Var.getFilter();
                        k20Var.g(filter);
                        j20 j20Var = k20Var.H;
                        if (j20Var != null) {
                            ((org.telegram.ui.cy) j20Var).g(filter);
                            break;
                        }
                    } else {
                        v0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 2:
                ((y2) this.c).run(Long.valueOf(((p20) this.b).d));
                break;
            case 3:
                g40 g40Var = (g40) this.b;
                ((org.telegram.ui.hq) this.c).run();
                g40Var.dismiss();
                break;
            case 4:
                w70 w70Var = (w70) this.b;
                a3.h0 h0Var = (a3.h0) this.c;
                w70Var.u();
                h0Var.run();
                break;
            case 5:
                w70 w70Var2 = (w70) this.b;
                ((org.telegram.ui.vv) this.c).run();
                if (w70Var2.J) {
                    w70Var2.u();
                    break;
                }
                break;
            case 6:
                f80.m((f80) this.b, (d80) this.c);
                break;
            case 7:
                ye0.m((ye0) this.b, (org.telegram.ui.ActionBar.f6) this.c);
                break;
            case 8:
                oi0 oi0Var = (oi0) this.b;
                org.telegram.ui.l80 l80Var = (org.telegram.ui.l80) this.c;
                if (oi0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, oi0Var.getValue());
                    org.telegram.ui.id0 id0Var = (org.telegram.ui.id0) l80Var.b;
                    TLRPC.User user = (TLRPC.User) l80Var.c;
                    if (id0Var.getLocationController().getSharingLocationInfo(id0Var.e0) == null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(id0Var.getParentActivity());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ShareLocationAlertButton), new fg.e2(id0Var, user, max, 12));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        id0Var.showDialog(alertDialog$Builder.a);
                    } else {
                        id0Var.R.L = true;
                        id0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        id0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        id0Var.getLocationController().setProximityLocation(id0Var.e0, max, true);
                        z10 = true;
                    }
                    if (z10) {
                        oi0Var.a();
                        break;
                    }
                }
                break;
            case 9:
                ti0 ti0Var = (ti0) this.b;
                Context context = (Context) this.c;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(ti0Var.b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, ti0Var.getTitleView().getText()), 500);
                        break;
                    } catch (ActivityNotFoundException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                break;
            case 10:
                String str = (String) this.b;
                Context context2 = (Context) this.c;
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", str);
                Intent createChooser = Intent.createChooser(intent2, LocaleController.getString(R.string.ShareLink));
                createChooser.setFlags(TLObject.FLAG_28);
                context2.startActivity(createChooser);
                break;
            case 11:
                xh.n5 n5Var = (xh.n5) this.b;
                org.telegram.messenger.sk skVar = (org.telegram.messenger.sk) this.c;
                n5Var.e = !n5Var.e;
                skVar.run();
                n5Var.i(true);
                break;
            case 12:
                dy0 dy0Var = (dy0) this.b;
                org.telegram.ui.Cells.g8 g8Var = (org.telegram.ui.Cells.g8) this.c;
                org.telegram.ui.tt.q().v(dy0Var.r.m0);
                org.telegram.ui.tt.q().y(g8Var);
                break;
            case 13:
                CharSequence charSequence = (CharSequence) this.b;
                u2.k0 k0Var = (u2.k0) this.c;
                AndroidUtilities.addToClipboard(charSequence);
                k0Var.run();
                break;
            case 14:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.b;
                boolean[] zArr = (boolean[]) this.c;
                h3Var.dismiss();
                if (!zArr[0]) {
                    MessagesController.getGlobalMainSettings().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 15:
                t41 t41Var = (t41) this.b;
                j61 j61Var = (j61) this.c;
                t41Var.k0 = false;
                t41Var.J();
                j61Var.N(true);
                t41Var.s();
                break;
            case 16:
                o41 o41Var = (o41) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = o41Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(wr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.bl blVar = (org.telegram.ui.bl) this.b;
                ((org.telegram.ui.ActionBar.p1) this.c).d(true);
                z41.a(blVar.getContext(), blVar.d);
                break;
            case 18:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i14 = UndoView.e0;
                undoView.e(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                org.telegram.ui.ActionBar.p2 p2Var = undoView.s;
                tL_payments_getPaymentReceipt.peer = p2Var.getMessagesController().getInputPeer(message.peer_id);
                p2Var.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new z1(undoView, 18), 2);
                break;
            case 19:
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
            case 20:
                org.telegram.ui.b40 b40Var = (org.telegram.ui.b40) this.b;
                org.telegram.ui.j60 j60Var = (org.telegram.ui.j60) this.c;
                if (b40Var.h()) {
                    if (sf.c.a(j60Var.i0) > 0) {
                        org.telegram.ui.Components.voip.i1.n(j60Var.i0);
                        j60Var.dismiss();
                        break;
                    } else {
                        d5.B(j60Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(j60Var.i0)) {
                    j30.e0 = false;
                    j60Var.dismiss();
                    break;
                } else {
                    d5.A(b40Var.getContext()).o();
                    break;
                }
            case 21:
                org.telegram.ui.Components.voip.w0 w0Var = (org.telegram.ui.Components.voip.w0) this.b;
                hj0 hj0Var = (hj0) this.c;
                boolean z12 = w0Var.v;
                w0Var.v = !z12;
                if (z12) {
                    hj0Var.M(69);
                    hj0Var.P(99);
                } else {
                    hj0Var.M(36);
                    hj0Var.P(69);
                }
                hj0Var.start();
                break;
            case 22:
                boolean[] zArr2 = (boolean[]) this.b;
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) this.c;
                boolean z13 = !zArr2[0];
                zArr2[0] = z13;
                z1Var.c(z13, true);
                break;
            case 23:
                org.telegram.ui.Components.voip.l2 l2Var = (org.telegram.ui.Components.voip.l2) this.b;
                Context context3 = (Context) this.c;
                l2Var.getClass();
                boolean z14 = context3 instanceof LaunchActivity;
                if (!z14 || ApplicationLoader.mainInterfacePaused) {
                    if (z14) {
                        Intent intent3 = new Intent(context3, (Class<?>) LaunchActivity.class);
                        intent3.setAction("voip");
                        context3.startActivity(intent3);
                        break;
                    }
                } else {
                    zi1.w((Activity) context3, l2Var.L);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.ts tsVar = (org.telegram.ui.ts) this.b;
                tsVar.showDialog(d5.m(tsVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.c)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.u3(tsVar, i10), null, false, false, tsVar.r).a);
                break;
            case 25:
                org.telegram.ui.pt ptVar = (org.telegram.ui.pt) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                org.telegram.ui.tt ttVar = ptVar.a;
                if (ttVar.w != null) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    if (((Integer) arrayList2.get(intValue)).intValue() == 0) {
                        org.telegram.ui.rt rtVar = ttVar.l;
                        TLObject tLObject = ttVar.W;
                        if (tLObject == null) {
                            tLObject = ttVar.Z;
                        }
                        rtVar.r(0, 0, ttVar.b0, tLObject, true);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 4) {
                        org.telegram.ui.rt rtVar2 = ttVar.l;
                        TLObject tLObject2 = ttVar.W;
                        if (tLObject2 == null) {
                            tLObject2 = ttVar.Z;
                        }
                        rtVar2.r(0, 0, ttVar.b0, tLObject2, false);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 1) {
                        MediaDataController.getInstance(ttVar.r).removeRecentGif(ttVar.W);
                        ttVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 2) {
                        MediaDataController.getInstance(ttVar.r).addRecentGif(ttVar.W, (int) (System.currentTimeMillis() / 1000), true);
                        MessagesController.getInstance(ttVar.r).saveGif("gif", ttVar.W);
                        ttVar.l.L();
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 3) {
                        TLRPC.Document document = ttVar.W;
                        TLRPC.BotInlineResult botInlineResult = ttVar.Z;
                        Object obj = ttVar.b0;
                        org.telegram.ui.rt rtVar3 = ttVar.l;
                        d5.M(ttVar.w, rtVar3.a(), new a1.d(rtVar3, document, botInlineResult, obj, 9), ttVar.c0);
                    } else if (((Integer) arrayList2.get(intValue)).intValue() == 11) {
                        org.telegram.ui.rt rtVar4 = ttVar.l;
                        TLObject tLObject3 = ttVar.W;
                        if (tLObject3 == null) {
                            tLObject3 = ttVar.Z;
                        }
                        rtVar4.v(tLObject3, ttVar.b0);
                    }
                    ttVar.p();
                    break;
                }
                break;
            case 26:
                org.telegram.ui.lv lvVar = (org.telegram.ui.lv) this.b;
                yh.b bVar = (yh.b) this.c;
                org.telegram.ui.kv kvVar = lvVar.X;
                oy0[] oy0VarArr = lvVar.b0;
                for (oy0 oy0Var : oy0VarArr) {
                    if (oy0Var != null) {
                        boolean z15 = oy0Var.c;
                    }
                }
                org.telegram.ui.Cells.z1 z1Var2 = (org.telegram.ui.Cells.z1) view;
                int intValue2 = ((Integer) z1Var2.getTag()).intValue();
                oy0 oy0Var2 = oy0VarArr[intValue2];
                boolean z16 = oy0Var2.c;
                boolean z17 = !z16;
                if (z16 != z17) {
                    oy0Var2.c = z17;
                    oy0Var2.d = true;
                }
                z1Var2.c(oy0Var2.c, true);
                boolean z18 = oy0VarArr[intValue2].c;
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
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            if (((yh.a) arrayList.get(i15)).d == intValue2) {
                                if (z18) {
                                    if (!hashSet.contains(arrayList.get(i15))) {
                                        hashSet.add((yh.a) arrayList.get(i15));
                                        bVar.g((yh.a) arrayList.get(i15), true);
                                    }
                                } else if (hashSet.contains(arrayList.get(i15))) {
                                    hashSet.remove(arrayList.get(i15));
                                    bVar.g((yh.a) arrayList.get(i15), false);
                                }
                            }
                        }
                    }
                    lvVar.e0.c();
                    lvVar.a0.a(kvVar.d(), true);
                    kvVar.c(true);
                    break;
                } else {
                    bVar.n = z18;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                lvVar.e0.c();
                lvVar.a0.a(kvVar.d(), true);
                kvVar.c(true);
            case 27:
                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) this.b;
                w70 w70Var3 = (w70) this.c;
                wyVar.getClass();
                w70Var3.u();
                wyVar.presentFragment(new ProxyListActivity());
                break;
            case 28:
                ei.u0.e((org.telegram.ui.ActionBar.d2[]) this.c, r0, r0.currentAccount, ((org.telegram.ui.wy) this.b).Y2);
                break;
            default:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.b)[0].getSwipeBack().e(((int[]) this.c)[0]);
                break;
        }
    }
}
