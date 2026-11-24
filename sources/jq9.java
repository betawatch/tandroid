// default package

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.d0;
import org.telegram.ui.e0;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jq9 implements kq9, c5c, ee, hk3, jab, ln5, pkc, ue7, e11, OnSuccessListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jq9(nha nhaVar, t3b t3bVar, ArrayList arrayList) {
        this.a = (byte) 4;
        this.b = nhaVar;
        this.d = t3bVar;
        this.c = arrayList;
    }

    @Override // hk3
    public final boolean E() {
        return false;
    }

    @Override // pkc
    public final void a(qkc qkcVar) {
        iic iicVar = (iic) this.b;
        VoIPService voIPService = (VoIPService) this.c;
        rkc rkcVar = (rkc) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            gm.r(iicVar.S0);
            iicVar.R0 = false;
            if (iicVar.w0.isTouchExplorationEnabled()) {
                qkcVar.announceForAccessibility(voIPService.isFrontFaceCamera() ? jb6.M0(2131754730, null) : jb6.M0(2131754729, null));
            }
            rkcVar.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // kq9
    public final Object apply(Object obj) {
        mq9 mq9Var;
        byte b = this.a;
        int i = 6;
        int i2 = 5;
        int i3 = 4;
        int i4 = 3;
        int i5 = 1;
        int i6 = 2;
        Object obj2 = this.d;
        Object obj3 = this.c;
        mq9 mq9Var2 = (mq9) this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                rb0 rb0Var = (rb0) obj2;
                Cursor cursor = (Cursor) obj;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    int i7 = cursor.getInt(7) != 0 ? i5 : 0;
                    oa0 oa0Var = new oa0();
                    oa0Var.h = new HashMap();
                    String string = cursor.getString(i5);
                    if (string == null) {
                        gxc.d("Null transportName");
                        return null;
                    }
                    oa0Var.a = string;
                    oa0Var.f = Long.valueOf(cursor.getLong(i6));
                    oa0Var.g = Long.valueOf(cursor.getLong(i4));
                    if (i7 != 0) {
                        String string2 = cursor.getString(4);
                        oa0Var.e = new z34(string2 == null ? mq9.f : new d44(string2), cursor.getBlob(5));
                        mq9Var = mq9Var2;
                    } else {
                        String string3 = cursor.getString(4);
                        d44 d44Var = string3 == null ? mq9.f : new d44(string3);
                        Cursor query = mq9Var2.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i8 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i8 += blob.length;
                            }
                            byte[] bArr = new byte[i8];
                            int i9 = 0;
                            int i10 = 0;
                            while (i9 < arrayList2.size()) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i9);
                                mq9 mq9Var3 = mq9Var2;
                                System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                                i10 += bArr2.length;
                                i9++;
                                mq9Var2 = mq9Var3;
                            }
                            mq9Var = mq9Var2;
                            query.close();
                            oa0Var.e = new z34(d44Var, bArr);
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        oa0Var.c = Integer.valueOf(cursor.getInt(6));
                    }
                    if (!cursor.isNull(8)) {
                        oa0Var.d = Integer.valueOf(cursor.getInt(8));
                    }
                    if (!cursor.isNull(9)) {
                        oa0Var.b = cursor.getString(9);
                    }
                    if (!cursor.isNull(10)) {
                        oa0Var.i = cursor.getBlob(10);
                    }
                    if (!cursor.isNull(11)) {
                        oa0Var.j = cursor.getBlob(11);
                    }
                    arrayList.add(new eb0(j, rb0Var, oa0Var.b()));
                    i4 = 3;
                    i5 = 1;
                    i6 = 2;
                    mq9Var2 = mq9Var;
                }
                return null;
            default:
                HashMap hashMap = (HashMap) obj3;
                xvc xvcVar = (xvc) obj2;
                ArrayList arrayList3 = (ArrayList) xvcVar.c;
                Cursor cursor2 = (Cursor) obj;
                mq9Var2.getClass();
                while (cursor2.moveToNext()) {
                    String string4 = cursor2.getString(0);
                    int i11 = cursor2.getInt(1);
                    wd6 wd6Var = wd6.b;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            wd6Var = wd6.c;
                        } else if (i11 == 2) {
                            wd6Var = wd6.d;
                        } else if (i11 == 3) {
                            wd6Var = wd6.e;
                        } else if (i11 == i3) {
                            wd6Var = wd6.f;
                        } else if (i11 == i2) {
                            wd6Var = wd6.h;
                        } else if (i11 == i) {
                            wd6Var = wd6.n;
                        } else {
                            aqe.a(Integer.valueOf(i11), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    long j2 = cursor2.getLong(2);
                    if (!hashMap.containsKey(string4)) {
                        hashMap.put(string4, new ArrayList());
                    }
                    ((List) hashMap.get(string4)).add(new xd6(j2, wd6Var));
                    i = 6;
                    i2 = 5;
                    i3 = 4;
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    int i12 = zd6.c;
                    arrayList3.add(new zd6((String) entry.getKey(), DesugarCollections.unmodifiableList((List) entry.getValue())));
                }
                long a = mq9Var2.b.a();
                SQLiteDatabase a2 = mq9Var2.a();
                a2.beginTransaction();
                try {
                    Cursor rawQuery = a2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        wpb wpbVar = new wpb(rawQuery.getLong(0), a);
                        rawQuery.close();
                        a2.setTransactionSuccessful();
                        a2.endTransaction();
                        xvcVar.b = wpbVar;
                        xvcVar.d = new xz4(new h3b(mq9Var2.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * mq9Var2.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), qa0.f.a));
                        xvcVar.e = (String) mq9Var2.e.get();
                        return new ak2((wpb) xvcVar.b, DesugarCollections.unmodifiableList(arrayList3), (xz4) xvcVar.d, (String) xvcVar.e);
                    } catch (Throwable th2) {
                        rawQuery.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    a2.endTransaction();
                    throw th3;
                }
        }
    }

    @Override // ln5
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Bitmap bitmap;
        bpb bpbVar = (bpb) this.b;
        hf2 hf2Var = (hf2) this.c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        jn5 p = imageReceiver.p();
        if (!z || p == null || (bitmap = p.c) == null) {
            return;
        }
        Drawable drawable = hf2Var.b;
        if (drawable instanceof ah7) {
            ah7 ah7Var = (ah7) drawable;
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            ah7Var.r((wallPaperSettings == null || wallPaperSettings.intensity >= 0) ? 100 : -100, bpb.e(bitmap));
            ah7Var.s(bpbVar.M);
            bpbVar.invalidate();
        }
    }

    @Override // c5c
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((k0a) this.b).Y0((TLRPC.User) this.c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override // jab
    public final void l(Canvas canvas, RectF rectF, float f) {
        sha shaVar = (sha) this.b;
        y49 y49Var = (y49) this.c;
        int[] iArr = (int[]) this.d;
        shaVar.c(canvas, rectF, f);
        shaVar.f(canvas, rectF, f);
        if (shaVar.h) {
            shaVar.b(canvas, rectF, f);
        } else {
            shaVar.e(canvas, rectF, f);
        }
        if (y49Var != null && y49Var.b0 && y49Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            y49Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // e11
    public final void onRejoinRequested() {
        ((VoIPService) this.b).lambda$onBroadcastStateChanged$18((qd2) this.c, (NativeInstance) this.d);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        sm2 sm2Var = (sm2) this.b;
        b61 b61Var = (b61) this.c;
        int[] iArr = (int[]) this.d;
        fc4.b("wear-auth: /answer delivered to " + ((String) sm2Var.e));
        int i = 0;
        b61Var.setLoading(false);
        int i2 = iArr[0];
        ArrayList arrayList = (ArrayList) sm2Var.d;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = a.b;
        }
        if (context != null) {
            d S = LaunchActivity.S();
            ylb resourceProvider = S != null ? S.getResourceProvider() : null;
            my0 my0Var = auc.c;
            if (my0Var != null) {
                my0Var.dismiss();
                auc.c = null;
            }
            my0 h = hg9.h(1, resourceProvider, context, false);
            ztc ztcVar = new ztc(context);
            h.O = ztcVar;
            LinearLayout i3 = hg9.i(context, 1);
            ztcVar.addView(i3, qoe.e(-1, -1, nm7.D1));
            TextView b = jxe.b(context, 20.0f, cmb.i5, true, resourceProvider);
            hg9.p(b, 17, null, 2131742610);
            i3.addView(b, qoe.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            while (i < arrayList.size()) {
                cw3 f = gw3.f((String) arrayList.get(i));
                ImageView imageView = new ImageView(context);
                imageView.setImageDrawable(f);
                nm7.i(imageView);
                int L = gm.L(80.0f);
                int i4 = cmb.Ei;
                ShapeDrawable K = cmb.K(L, cmb.p1(0.15f, cmb.v0(i4, resourceProvider)));
                wmb K2 = anb.K(0.15f, i4);
                imageView.setBackground(K);
                anb.j(imageView, K, K2, null, resourceProvider);
                linearLayout.addView(imageView, qoe.k(i == 0 ? 0.0f : 5.0f, 0.0f, 0.0f, 0.0f, 80, 80));
                i++;
            }
            i3.addView(linearLayout, qoe.t(-2, -2, 49, 32, 12, 32, 12));
            b61 i5 = mlb.i(24, resourceProvider, context, true);
            i5.setText(jb6.M0(2131742609, null));
            i3.addView(i5, qoe.t(-1, 48, 7, 12, 12, 12, 8));
            int i6 = cmb.Z6;
            h.t0(i6);
            h.L(i6);
            auc.c = h;
            h.show();
            i5.setOnClickListener(new wh((Object) i5, i2, (Object) h, (byte) 22));
        }
    }

    @Override // hk3
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        wsa wsaVar = (wsa) this.b;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
        nk3 nk3Var2 = (nk3) this.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        long j = ((bf7) arrayList.get(0)).a;
        Long l = (Long) uf2.e(wsaVar.a).r.get(tL_starGiftUnique.slug);
        long longValue = l != null ? l.longValue() : 0L;
        if (longValue != 0 && longValue != j) {
            ik.k0(wsaVar.getContext(), wsaVar.J0, wsaVar.a, tL_starGiftUnique, longValue, new nz8((Object) wsaVar, j, (TLObject) tL_starGiftUnique, (Object) nk3Var2, (byte) 4));
            return true;
        }
        uf2.e(wsaVar.a).q(j, new fnb(null, tL_starGiftUnique.slug), null, true);
        nk3Var2.presentFragment(yv1.ga(j), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ee
    public final void r(he heVar, int i) {
        int i2;
        byte b = this.a;
        Object[] objArr = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 3:
                e9a e9aVar = (e9a) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i2 = ((d) e9aVar.a).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(resetauthorization, new jl7(e9aVar, tL_authorization, (byte) 22));
                ((o7a) obj3).d.dismiss();
                break;
            case 4:
                nha nhaVar = (nha) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ((t3b) obj).F(arrayList);
                c41.b0(nhaVar.y1).Q(R.raw.ic_delete, 36, jb6.G(arrayList.size(), "BotPreviewsDeleted", new Object[0])).j();
                nhaVar.E(false);
                break;
            case 7:
                ((a8b) obj3).G0((y7b) obj2, (Runnable) obj, true);
                break;
            case 8:
                d0 d0Var = (d0) obj3;
                if (cmb.j0(((e0) obj2).d, (amb) obj, true)) {
                    cmb.r1(false, false);
                    cmb.I1(cmb.I, d0Var.e.f == 1, -1, null);
                    break;
                }
                break;
            case 13:
                vqc vqcVar = (vqc) obj3;
                c cVar = (c) obj;
                if (!((Boolean) obj2).booleanValue()) {
                    cVar.c.C();
                }
                e08.a(cVar.a, new pb((byte) 7), null, null, null, new qp0(cVar, new ts9(vqcVar, (vqcVar.getParentLayout() == null || vqcVar.getParentLayout().getFragmentStack().size() <= 1) ? null : (d) vqcVar.getParentLayout().getFragmentStack().get(vqcVar.getParentLayout().getFragmentStack().size() - 2), (byte) 23), (byte) 4), false, true, new s34((qn4) null, (c25) null));
                break;
            case 14:
                c cVar2 = (c) obj2;
                k11 g = heVar.g(i, true, true);
                g.d();
                sqc sqcVar = new sqc((vqc) obj3, g, objArr == true ? 1 : 0);
                c.O("disable backup: getting phrase...");
                cVar2.E(false, true, false, new p((Object) cVar2, (Object) sqcVar, obj, (byte) 18));
                break;
            default:
                rrc rrcVar = (rrc) obj3;
                a52 a52Var = (a52) obj2;
                oh2 oh2Var = (oh2) obj;
                rrcVar.getClass();
                if (a52Var.getText().toString().getBytes(StandardCharsets.UTF_8).length <= 960) {
                    String trim = a52Var.getText().toString().trim();
                    rrcVar.h0 = TextUtils.isEmpty(trim) ? null : trim;
                    rrcVar.i0 = !oh2Var.b();
                    boolean isEmpty = TextUtils.isEmpty(rrcVar.h0);
                    TextView textView = rrcVar.Q;
                    if (isEmpty) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(rrcVar.h0);
                        rrcVar.Q.setVisibility(0);
                    }
                    rrcVar.E0();
                    heVar.dismiss();
                    rrcVar.s0();
                    break;
                } else {
                    int i3 = -rrcVar.p0;
                    rrcVar.p0 = i3;
                    gm.A3(i3, a52Var, null);
                    break;
                }
        }
    }

    @Override // hk3
    public final boolean s(nk3 nk3Var) {
        return false;
    }

    @Override // ue7
    public final void z(boolean z) {
        TLRPC.Chat chat = (TLRPC.Chat) this.b;
        d dVar = (d) this.c;
        sic.l(chat, null, true, null, dVar.getParentActivity(), dVar, (j5) this.d);
    }

    public /* synthetic */ jq9(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // ln5
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override // ln5
    public final void B0(int i, Drawable drawable) {
    }
}
