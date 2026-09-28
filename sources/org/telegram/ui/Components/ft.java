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

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ft implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ft(int i10, Object obj, Object obj2) {
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
                gt gtVar = (gt) this.b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.c;
                gtVar.dismiss();
                m2Var.presentFragment(new org.telegram.ui.z6());
                break;
            case 1:
                uv.o((uv) this.b, (z5) this.c);
                break;
            case 2:
                dz dzVar = (dz) this.b;
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) this.c;
                mz mzVar = dzVar.v;
                uw uwVar = mzVar.D0;
                if (uwVar.indexOfChild(o8Var) != -1 && (T = uwVar.T(o8Var)) != null) {
                    if (T.b() == mzVar.f1) {
                        if (mzVar.h1 != null) {
                            ny nyVar = mzVar.t1;
                            if (nyVar != null) {
                                nyVar.y(mzVar.J1.id);
                                break;
                            }
                        } else {
                            SharedPreferences.Editor edit = MessagesController.getEmojiSettings(mzVar.c1).edit();
                            String str = "group_hide_stickers_" + mzVar.J1.id;
                            TLRPC.StickerSet stickerSet = mzVar.J1.stickerset;
                            edit.putLong(str, stickerSet != null ? stickerSet.id : 0L).apply();
                            mzVar.X(false);
                            dz dzVar2 = mzVar.y0;
                            if (dzVar2 != null) {
                                dzVar2.l();
                                break;
                            }
                        }
                    } else if (dzVar.h.get(T.b()) == mzVar.j1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dzVar.c);
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.ClearRecentStickersAlertTitle);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.ClearRecentStickersAlertMessage);
                        alertDialog$Builder.k(LocaleController.getString(R.string.ClearButton), new nv(dzVar, i11));
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
                    m40 m40Var = m40.v;
                    if (m40Var.c()) {
                        m40Var.b();
                        if (fragmentContextView.h != null && fragmentContextView.B0 != null) {
                            w10 w10Var = new w10(fragmentContextView, fragmentContextView.getContext());
                            fragmentContextView.A0 = w10Var;
                            w10Var.setExtraTranslationY(AndroidUtilities.dp(-12.0f));
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
                e20 e20Var = (e20) this.b;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.c;
                int indexOf = e20Var.F.indexOf(t0Var.getFilter());
                if (e20Var.I != indexOf) {
                    e20Var.I = indexOf;
                    e20Var.f();
                    break;
                } else if (t0Var.getFilter().h) {
                    if (t0Var.a.f) {
                        gg.q0 filter = t0Var.getFilter();
                        e20Var.g(filter);
                        d20 d20Var = e20Var.H;
                        if (d20Var != null) {
                            ((org.telegram.ui.vx) d20Var).h(filter);
                            break;
                        }
                    } else {
                        t0Var.setSelectedForDelete(true);
                        break;
                    }
                }
                break;
            case 5:
                ((y2) this.c).run(Long.valueOf(((j20) this.b).d));
                break;
            case 6:
                z30 z30Var = (z30) this.b;
                ((org.telegram.ui.aq) this.c).run();
                z30Var.dismiss();
                break;
            case 7:
                a80 a80Var = (a80) this.b;
                a3.h0 h0Var = (a3.h0) this.c;
                a80Var.u();
                h0Var.run();
                break;
            case 8:
                a80 a80Var2 = (a80) this.b;
                ((org.telegram.ui.pv) this.c).run();
                if (a80Var2.J) {
                    a80Var2.u();
                    break;
                }
                break;
            case 9:
                j80.m((j80) this.b, (h80) this.c);
                break;
            case 10:
                bf0.m((bf0) this.b, (org.telegram.ui.ActionBar.d6) this.c);
                break;
            case 11:
                ri0 ri0Var = (ri0) this.b;
                org.telegram.ui.ow owVar = (org.telegram.ui.ow) this.c;
                if (ri0Var.J.getTag() == null) {
                    int max = (int) Math.max(1.0f, ri0Var.getValue());
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
                dy0 dy0Var = (dy0) this.b;
                org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) this.c;
                org.telegram.ui.nt.q().v(dy0Var.r.m0);
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
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(sr.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.b;
                ((org.telegram.ui.ActionBar.m1) this.c).d(true);
                b51.a(wkVar.getContext(), wkVar.d);
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
                    c30.e0 = false;
                    d60Var.dismiss();
                    break;
                } else {
                    e5.A(v30Var.getContext()).o();
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
                org.telegram.ui.Cells.a2 a2Var2 = (org.telegram.ui.Cells.a2) this.c;
                boolean z11 = !zArr2[0];
                zArr2[0] = z11;
                a2Var2.c(z11, true);
                break;
            case 26:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) this.b;
                Context context3 = (Context) this.c;
                n2Var.getClass();
                boolean z12 = context3 instanceof LaunchActivity;
                if (!z12 || ApplicationLoader.mainInterfacePaused) {
                    if (z12) {
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
                oy0[] oy0VarArr = fvVar.b0;
                for (oy0 oy0Var : oy0VarArr) {
                    if (oy0Var != null) {
                        boolean z13 = oy0Var.c;
                    }
                }
                org.telegram.ui.Cells.a2 a2Var3 = (org.telegram.ui.Cells.a2) view;
                int intValue2 = ((Integer) a2Var3.getTag()).intValue();
                oy0 oy0Var2 = oy0VarArr[intValue2];
                boolean z14 = oy0Var2.c;
                boolean z15 = !z14;
                if (z14 != z15) {
                    oy0Var2.c = z15;
                    oy0Var2.d = true;
                }
                a2Var3.c(oy0Var2.c, true);
                boolean z16 = oy0VarArr[intValue2].c;
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
                    fvVar.e0.c();
                    fvVar.a0.a(evVar.d(), true);
                    evVar.c(true);
                    break;
                } else {
                    bVar.n = z16;
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
