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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gt(int i10, Object obj, Object obj2) {
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
        int i11 = 2;
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                ht htVar = (ht) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                htVar.dismiss();
                n2Var.presentFragment(new org.telegram.ui.a7());
                break;
            case 1:
                wv.o((wv) this.b, (z5) this.c);
                break;
            case 2:
                ez ezVar = (ez) this.b;
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) this.c;
                nz nzVar = ezVar.v;
                vw vwVar = nzVar.D0;
                if (vwVar.indexOfChild(o8Var) != -1 && (T = vwVar.T(o8Var)) != null) {
                    if (T.b() == nzVar.f1) {
                        if (nzVar.h1 != null) {
                            oy oyVar = nzVar.t1;
                            if (oyVar != null) {
                                oyVar.y(nzVar.J1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(nzVar.c1).edit();
                            String str = "group_hide_stickers_" + nzVar.J1.id;
                            TLRPC.StickerSet stickerSet = nzVar.J1.stickerset;
                            edit.putLong(str, stickerSet != null ? stickerSet.id : 0L).apply();
                            nzVar.W(false);
                            ez ezVar2 = nzVar.y0;
                            if (ezVar2 != null) {
                                ezVar2.l();
                                break;
                            }
                        }
                    } else if (ezVar.h.get(T.b()) == nzVar.j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ezVar.c);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new pv(ezVar, i11));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.show();
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
                            break;
                        }
                    }
                }
                break;
            case 3:
                FragmentContextView fragmentContextView = (FragmentContextView) this.b;
                float[] fArr = (float[]) this.c;
                float[] fArr2 = FragmentContextView.P0;
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
                int i13 = i10 + 1;
                float f7 = fArr[i13 < 3 ? i13 : 0];
                MediaController.getInstance().setPlaybackSpeed(fragmentContextView.V, f7);
                fragmentContextView.l(playbackSpeed, f7, true);
                long currentTimeMillis = System.currentTimeMillis();
                if (fragmentContextView.A0 == null && currentTimeMillis - fragmentContextView.C0 > 300) {
                    n40 n40Var = n40.v;
                    if (n40Var.c()) {
                        n40Var.b();
                        if (fragmentContextView.h != null && fragmentContextView.B0 != null) {
                            x10 x10Var = new x10(fragmentContextView, fragmentContextView.getContext());
                            fragmentContextView.A0 = x10Var;
                            x10Var.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
                            fragmentContextView.A0.setText(LocaleController.getString(R.string.SpeedHint));
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                            marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                            fragmentContextView.B0.addView(fragmentContextView.A0, marginLayoutParams);
                            fragmentContextView.A0.f(fragmentContextView.F, true);
                        }
                    }
                }
                fragmentContextView.C0 = currentTimeMillis;
                break;
            case 4:
                f20 f20Var = (f20) this.b;
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.c;
                int indexOf = f20Var.F.indexOf(u0Var.getFilter());
                if (f20Var.I != indexOf) {
                    f20Var.I = indexOf;
                    f20Var.f();
                    break;
                } else if (u0Var.getFilter().h) {
                    if (u0Var.a.f) {
                        gg.q0 filter = u0Var.getFilter();
                        f20Var.g(filter);
                        e20 e20Var = f20Var.H;
                        if (e20Var != null) {
                            ((org.telegram.ui.cy) e20Var).d(filter);
                            break;
                        }
                    } else {
                        u0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 5:
                ((y2) this.c).run(Long.valueOf(((k20) this.b).d));
                break;
            case 6:
                a40 a40Var = (a40) this.b;
                ((org.telegram.ui.cq) this.c).run();
                a40Var.dismiss();
                break;
            case 7:
                b80 b80Var = (b80) this.b;
                a3.h0 h0Var = (a3.h0) this.c;
                b80Var.u();
                h0Var.run();
                break;
            case 8:
                b80 b80Var2 = (b80) this.b;
                ((org.telegram.ui.uv) this.c).run();
                if (b80Var2.J) {
                    b80Var2.u();
                    break;
                }
                break;
            case 9:
                k80.m((k80) this.b, (i80) this.c);
                break;
            case 10:
                bf0.m((bf0) this.b, (org.telegram.ui.ActionBar.d6) this.c);
                break;
            case 11:
                ri0 ri0Var = (ri0) this.b;
                org.telegram.ui.pw pwVar = (org.telegram.ui.pw) this.c;
                if (ri0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, ri0Var.getValue());
                    org.telegram.ui.gd0 gd0Var = (org.telegram.ui.gd0) pwVar.b;
                    TLRPC.User user = (TLRPC.User) pwVar.c;
                    if (gd0Var.getLocationController().getSharingLocationInfo(gd0Var.e0) == null) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(gd0Var.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.ShareLocationAlertTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.ShareLocationAlertText);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.ShareLocationAlertButton), new gg.d2(gd0Var, user, max, 13));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        gd0Var.showDialog(alertDialog$Builder2.a);
                    } else {
                        gd0Var.R.L = true;
                        gd0Var.c.setImageResource(R.drawable.msg_location_alert2);
                        gd0Var.m0().k(0L, 24, Integer.valueOf(max), user, null, null);
                        gd0Var.getLocationController().setProximityLocation(gd0Var.e0, max, true);
                        r9 = 1;
                    }
                    if (r9 != 0) {
                        ri0Var.a();
                        break;
                    }
                }
                break;
            case 12:
                wi0 wi0Var = (wi0) this.b;
                Context context = (Context) this.c;
                Uri bitmapShareUri = AndroidUtilities.getBitmapShareUri(wi0Var.b, "qr_tmp.png", Bitmap.CompressFormat.PNG);
                if (bitmapShareUri != null) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("image/*");
                    intent.putExtra("android.intent.extra.STREAM", bitmapShareUri);
                    try {
                        AndroidUtilities.findActivity(context).startActivityForResult(Intent.createChooser(intent, wi0Var.getTitleView().getText()), 500);
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
                yh.k5 k5Var = (yh.k5) this.b;
                org.telegram.messenger.ik ikVar = (org.telegram.messenger.ik) this.c;
                k5Var.e = !k5Var.e;
                ikVar.run();
                k5Var.i(true);
                break;
            case 15:
                my0 my0Var = (my0) this.b;
                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) this.c;
                org.telegram.ui.rt.q().v(my0Var.r.m0);
                org.telegram.ui.rt.q().y(f8Var);
                break;
            case 16:
                CharSequence charSequence = (CharSequence) this.b;
                yh.r5 r5Var = (yh.r5) this.c;
                AndroidUtilities.addToClipboard(charSequence);
                r5Var.run();
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
                e51 e51Var = (e51) this.b;
                u61 u61Var = (u61) this.c;
                e51Var.k0 = false;
                e51Var.H();
                u61Var.N(true);
                e51Var.s();
                break;
            case 19:
                z41 z41Var = (z41) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = z41Var.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(tr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.b;
                ((org.telegram.ui.ActionBar.n1) this.c).d(true);
                k51.a(wkVar.getContext(), wkVar.d);
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
                j71 j71Var = (j71) this.b;
                File file = (File) this.c;
                if (file == null) {
                    j71Var.getClass();
                    break;
                } else {
                    Activity findActivity = AndroidUtilities.findActivity(j71Var.getContext());
                    if (findActivity != null) {
                        AndroidUtilities.openForView(file, "Telegram.apk", "application/vnd.android.package-archive", findActivity, null, false);
                        j71Var.dismiss();
                        break;
                    }
                }
                break;
            case 23:
                org.telegram.ui.a40 a40Var2 = (org.telegram.ui.a40) this.b;
                org.telegram.ui.h60 h60Var = (org.telegram.ui.h60) this.c;
                if (a40Var2.h()) {
                    if (sf.c.a(h60Var.i0) > 0) {
                        org.telegram.ui.Components.voip.k1.n(h60Var.i0);
                        h60Var.dismiss();
                        break;
                    } else {
                        e5.B(h60Var.i0, null, true).o();
                        break;
                    }
                } else if (AndroidUtilities.checkInlinePermissions(h60Var.i0)) {
                    d30.e0 = false;
                    h60Var.dismiss();
                    break;
                } else {
                    e5.A(a40Var2.getContext()).o();
                    break;
                }
            case 24:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.b;
                kj0 kj0Var = (kj0) this.c;
                boolean z10 = x0Var.v;
                x0Var.v = !z10;
                if (z10) {
                    kj0Var.M(69);
                    kj0Var.P(99);
                } else {
                    kj0Var.M(36);
                    kj0Var.P(69);
                }
                kj0Var.start();
                break;
            case 25:
                boolean[] zArr2 = (boolean[]) this.b;
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.c;
                boolean z11 = !zArr2[0];
                zArr2[0] = z11;
                a2Var.c(z11, true);
                break;
            case 26:
                org.telegram.ui.Components.voip.n2 n2Var3 = (org.telegram.ui.Components.voip.n2) this.b;
                Context context3 = (Context) this.c;
                n2Var3.getClass();
                boolean z12 = context3 instanceof LaunchActivity;
                if (!z12 || ApplicationLoader.mainInterfacePaused) {
                    if (z12) {
                        Intent intent3 = new Intent(context3, (Class<?>) LaunchActivity.class);
                        intent3.setAction("voip");
                        context3.startActivity(intent3);
                        break;
                    }
                } else {
                    mi1.w((Activity) context3, n2Var3.L);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.qs qsVar = (org.telegram.ui.qs) this.b;
                qsVar.showDialog(e5.m(qsVar.getParentActivity(), LocaleController.formatString(R.string.UserSuggestBirthdayTitle, UserObject.getForcedFirstName((TLRPC.User) this.c)), LocaleController.getString(R.string.UserSuggestBirthdayButton), null, new org.telegram.ui.t3(qsVar, 5), null, false, false, qsVar.r).a);
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
                        e5.M(rtVar.w, ptVar3.a(), new a1.d(ptVar3, document, botInlineResult, obj, 9), rtVar.c0);
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
                org.telegram.ui.jv jvVar = (org.telegram.ui.jv) this.b;
                zh.b bVar = (zh.b) this.c;
                org.telegram.ui.iv ivVar = jvVar.X;
                xy0[] xy0VarArr = jvVar.b0;
                for (xy0 xy0Var : xy0VarArr) {
                    if (xy0Var != null) {
                        boolean z13 = xy0Var.c;
                    }
                }
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) view;
                int intValue2 = ((Integer) a2Var2.getTag()).intValue();
                xy0 xy0Var2 = xy0VarArr[intValue2];
                boolean z14 = xy0Var2.c;
                boolean z15 = !z14;
                if (z14 != z15) {
                    xy0Var2.c = z15;
                    xy0Var2.d = true;
                }
                a2Var2.c(xy0Var2.c, true);
                boolean z16 = xy0VarArr[intValue2].c;
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
                    jvVar.e0.d();
                    jvVar.a0.a(ivVar.d(), true);
                    ivVar.c(true);
                    break;
                } else {
                    bVar.n = z16;
                }
                arrayList = arrayList3;
                if (arrayList != null) {
                }
                jvVar.e0.d();
                jvVar.a0.a(ivVar.d(), true);
                ivVar.c(true);
        }
    }
}
