package org.telegram.messenger;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class i5 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList a;
    public Context b;
    public int c;
    public c d;
    public Paint e;
    public RectF f;
    public a0.h g;
    public boolean h;

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        if (this.h) {
            return 1;
        }
        return ((int) Math.ceil(this.a.size() / 2.0f)) + 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i7) {
        return i7;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0284  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r0v41, types: [org.telegram.ui.Components.w8] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [org.telegram.tgnet.TLObject] */
    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RemoteViews getViewAt(int i7) {
        String str;
        String str2;
        ?? r12;
        ?? r02;
        TLRPC.FileLocation fileLocation;
        ?? r14;
        String str3;
        int i10;
        TLRPC.Dialog dialog;
        int i11;
        int i12;
        int i13;
        String format;
        ?? r13;
        Canvas canvas;
        org.telegram.ui.Components.w8 w8Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.FileLocation fileLocation2;
        ArrayList arrayList = this.a;
        Context context = this.b;
        c cVar = this.d;
        String str4 = null;
        if (this.h) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_deleted);
            remoteViews.setTextViewText(R.id.widget_deleted_text, hd.M0(2131742875, null));
            return remoteViews;
        }
        if (i7 >= getCount() - 1) {
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.widget_edititem);
            remoteViews2.setTextViewText(R.id.widget_edititem_text, hd.M0(2131744257, null));
            Bundle bundle = new Bundle();
            bundle.putInt("appWidgetId", this.c);
            bundle.putInt("appWidgetType", 1);
            bundle.putInt("currentAccount", cVar.a);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            remoteViews2.setOnClickFillInIntent(R.id.widget_edititem, intent);
            return remoteViews2;
        }
        RemoteViews remoteViews3 = new RemoteViews(context.getPackageName(), R.layout.contacts_widget_item);
        int i14 = 0;
        int i15 = 0;
        while (i15 < 2) {
            int i16 = (2 * i7) + i15;
            if (i16 >= arrayList.size()) {
                remoteViews3.setViewVisibility(i15 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, 4);
                str3 = str4;
                i12 = i14;
            } else {
                remoteViews3.setViewVisibility(i15 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, i14);
                Long l10 = (Long) arrayList.get(i16);
                if (m5.E(l10.longValue())) {
                    TLRPC.User a22 = qp.s1(cVar.a).a2(l10);
                    String M0 = t10.B(a22) ? hd.M0(2131745902, str4) : t10.z(a22) ? hd.M0(2131746265, str4) : t10.x(a22) ? hd.M0(2131749327, str4) : t10.j(a22, true);
                    if (t10.z(a22) || t10.B(a22) || a22 == null || (userProfilePhoto = a22.photo) == null || (fileLocation2 = userProfilePhoto.photo_small) == null || fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                        String str5 = str4;
                        str2 = M0;
                        r12 = str5;
                        r02 = a22;
                        r14 = str5;
                    } else {
                        r14 = fileLocation2;
                        str2 = M0;
                        r12 = str4;
                        r02 = a22;
                    }
                } else {
                    TLRPC.Chat M02 = qp.s1(cVar.a).M0(Long.valueOf(-l10.longValue()));
                    if (M02 != null) {
                        str = M02.title;
                        TLRPC.ChatPhoto chatPhoto = M02.photo;
                        if (chatPhoto != null && (fileLocation = chatPhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                            r14 = fileLocation;
                            str2 = str;
                            r12 = M02;
                            r02 = str4;
                        }
                    } else {
                        str = "";
                    }
                    String str6 = str4;
                    str2 = str;
                    r12 = M02;
                    r02 = str6;
                    r14 = str6;
                }
                remoteViews3.setTextViewText(i15 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2, str2);
                if (r14 != 0) {
                    try {
                        w7.G(p10.s0);
                        r13 = BitmapFactory.decodeFile(w7.K(r14, str4, true, true).toString());
                    } catch (Throwable th2) {
                        th = th2;
                        str3 = str4;
                        i10 = i14;
                        a8.g(th, true);
                        dialog = (TLRPC.Dialog) this.g.f(l10.longValue());
                        i11 = R.id.contacts_widget_item_badge_bg2;
                        if (dialog != null) {
                        }
                        i12 = i10;
                        if (i15 == 0) {
                        }
                        remoteViews3.setViewVisibility(i11, 8);
                        Bundle bundle2 = new Bundle();
                        if (m5.E(l10.longValue())) {
                        }
                        bundle2.putInt("currentAccount", cVar.a);
                        Intent intent2 = new Intent();
                        intent2.putExtras(bundle2);
                        remoteViews3.setOnClickFillInIntent(i15 != 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, intent2);
                        i15++;
                        i14 = i12;
                        str4 = str3;
                    }
                } else {
                    r13 = str4;
                }
                int L = g0.L(48.0f);
                Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                createBitmap.eraseColor(i14);
                try {
                    canvas = new Canvas(createBitmap);
                    if (r13 == 0) {
                        if (r02 != 0) {
                            w8Var = new org.telegram.ui.Components.w8(i14, r02);
                            if (t10.z(r02)) {
                                w8Var.g(12);
                            } else if (t10.B(r02)) {
                                w8Var.g(1);
                            }
                        } else {
                            ?? w8Var2 = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
                            int i17 = cVar.a;
                            w8Var2.q(r12);
                            w8Var = w8Var2;
                        }
                        w8Var.setBounds(i14, i14, L, L);
                        w8Var.draw(canvas);
                        i10 = i14;
                    } else {
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(r13, tileMode, tileMode);
                        if (this.e == null) {
                            this.e = new Paint(1);
                            this.f = new RectF();
                        }
                        float width = L / r13.getWidth();
                        canvas.save();
                        canvas.scale(width, width);
                        this.e.setShader(bitmapShader);
                        i10 = i14;
                        try {
                            this.f.set(0.0f, 0.0f, r13.getWidth(), r13.getHeight());
                            canvas.drawRoundRect(this.f, r13.getWidth(), r13.getHeight(), this.e);
                            canvas.restore();
                        } catch (Throwable th3) {
                            th = th3;
                            str3 = null;
                            a8.g(th, true);
                            dialog = (TLRPC.Dialog) this.g.f(l10.longValue());
                            i11 = R.id.contacts_widget_item_badge_bg2;
                            if (dialog != null) {
                            }
                            i12 = i10;
                            if (i15 == 0) {
                            }
                            remoteViews3.setViewVisibility(i11, 8);
                            Bundle bundle22 = new Bundle();
                            if (m5.E(l10.longValue())) {
                            }
                            bundle22.putInt("currentAccount", cVar.a);
                            Intent intent22 = new Intent();
                            intent22.putExtras(bundle22);
                            remoteViews3.setOnClickFillInIntent(i15 != 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, intent22);
                            i15++;
                            i14 = i12;
                            str4 = str3;
                        }
                    }
                    str3 = null;
                } catch (Throwable th4) {
                    th = th4;
                    i10 = i14;
                }
                try {
                    canvas.setBitmap(null);
                    remoteViews3.setImageViewBitmap(i15 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2, createBitmap);
                } catch (Throwable th5) {
                    th = th5;
                    a8.g(th, true);
                    dialog = (TLRPC.Dialog) this.g.f(l10.longValue());
                    i11 = R.id.contacts_widget_item_badge_bg2;
                    if (dialog != null) {
                    }
                    i12 = i10;
                    if (i15 == 0) {
                    }
                    remoteViews3.setViewVisibility(i11, 8);
                    Bundle bundle222 = new Bundle();
                    if (m5.E(l10.longValue())) {
                    }
                    bundle222.putInt("currentAccount", cVar.a);
                    Intent intent222 = new Intent();
                    intent222.putExtras(bundle222);
                    remoteViews3.setOnClickFillInIntent(i15 != 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, intent222);
                    i15++;
                    i14 = i12;
                    str4 = str3;
                }
                dialog = (TLRPC.Dialog) this.g.f(l10.longValue());
                i11 = R.id.contacts_widget_item_badge_bg2;
                if (dialog != null || (i13 = dialog.unread_count) <= 0) {
                    i12 = i10;
                    if (i15 == 0) {
                        i11 = R.id.contacts_widget_item_badge_bg1;
                    }
                    remoteViews3.setViewVisibility(i11, 8);
                } else {
                    if (i13 > 99) {
                        Object[] objArr = new Object[1];
                        objArr[i10] = 99;
                        format = String.format("%d+", objArr);
                    } else {
                        Object[] objArr2 = new Object[1];
                        objArr2[i10] = Integer.valueOf(i13);
                        format = String.format("%d", objArr2);
                    }
                    remoteViews3.setTextViewText(i15 == 0 ? R.id.contacts_widget_item_badge1 : R.id.contacts_widget_item_badge2, format);
                    if (i15 == 0) {
                        i11 = R.id.contacts_widget_item_badge_bg1;
                    }
                    i12 = i10;
                    remoteViews3.setViewVisibility(i11, i12);
                }
                Bundle bundle2222 = new Bundle();
                if (m5.E(l10.longValue())) {
                    bundle2222.putLong("chatId", -l10.longValue());
                } else {
                    bundle2222.putLong("userId", l10.longValue());
                }
                bundle2222.putInt("currentAccount", cVar.a);
                Intent intent2222 = new Intent();
                intent2222.putExtras(bundle2222);
                remoteViews3.setOnClickFillInIntent(i15 != 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, intent2222);
            }
            i15++;
            i14 = i12;
            str4 = str3;
        }
        return remoteViews3;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        t0.w();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        c cVar = this.d;
        if (cVar != null) {
            int i7 = cVar.a;
            if (p10.i(i7).p()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                a0.h hVar = new a0.h();
                yr a02 = yr.a0(i7);
                int i10 = this.c;
                a0.h hVar2 = this.g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                a02.a.c(new bg.c(a02, i10, arrayList, 1, hVar2, hVar, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e10) {
                    a02.o(e10, true);
                }
                qp.s1(i7).Y3(arrayList2, true);
                qp.s1(i7).S3(arrayList3, true);
            }
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
