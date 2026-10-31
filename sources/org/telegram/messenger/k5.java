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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class k5 implements RemoteViewsService.RemoteViewsFactory {
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
    public final long getItemId(int i10) {
        return i10;
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
    /* JADX WARN: Type inference failed for: r0v41, types: [org.telegram.ui.Components.r8] */
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
    public final RemoteViews getViewAt(int i10) {
        String str;
        String str2;
        ?? r12;
        ?? r02;
        TLRPC.FileLocation fileLocation;
        ?? r14;
        String str3;
        int i11;
        TLRPC.Dialog dialog;
        int i12;
        int i13;
        int i14;
        String format;
        ?? r13;
        Canvas canvas;
        org.telegram.ui.Components.r8 r8Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.FileLocation fileLocation2;
        ArrayList arrayList = this.a;
        Context context = this.b;
        c cVar = this.d;
        String str4 = null;
        if (this.h) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_deleted);
            remoteViews.setTextViewText(R.id.widget_deleted_text, cd.L0(2131742900, null));
            return remoteViews;
        }
        if (i10 >= getCount() - 1) {
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.widget_edititem);
            remoteViews2.setTextViewText(R.id.widget_edititem_text, cd.L0(2131744282, null));
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
        int i15 = 0;
        int i16 = 0;
        while (i16 < 2) {
            int i17 = (2 * i10) + i16;
            if (i17 >= arrayList.size()) {
                remoteViews3.setViewVisibility(i16 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, 4);
                str3 = str4;
                i13 = i15;
            } else {
                remoteViews3.setViewVisibility(i16 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, i15);
                Long l4 = (Long) arrayList.get(i17);
                if (o5.E(l4.longValue())) {
                    TLRPC.User Z1 = vp.r1(cVar.a).Z1(l4);
                    String L0 = h20.B(Z1) ? cd.L0(2131745918, str4) : h20.z(Z1) ? cd.L0(2131746281, str4) : h20.x(Z1) ? cd.L0(2131749337, str4) : h20.j(Z1, true);
                    if (h20.z(Z1) || h20.B(Z1) || Z1 == null || (userProfilePhoto = Z1.photo) == null || (fileLocation2 = userProfilePhoto.photo_small) == null || fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                        String str5 = str4;
                        str2 = L0;
                        r12 = str5;
                        r02 = Z1;
                        r14 = str5;
                    } else {
                        r14 = fileLocation2;
                        str2 = L0;
                        r12 = str4;
                        r02 = Z1;
                    }
                } else {
                    TLRPC.Chat L02 = vp.r1(cVar.a).L0(Long.valueOf(-l4.longValue()));
                    if (L02 != null) {
                        str = L02.title;
                        TLRPC.ChatPhoto chatPhoto = L02.photo;
                        if (chatPhoto != null && (fileLocation = chatPhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                            r14 = fileLocation;
                            str2 = str;
                            r12 = L02;
                            r02 = str4;
                        }
                    } else {
                        str = "";
                    }
                    String str6 = str4;
                    str2 = str;
                    r12 = L02;
                    r02 = str6;
                    r14 = str6;
                }
                remoteViews3.setTextViewText(i16 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2, str2);
                if (r14 != 0) {
                    try {
                        b8.G(d20.s0);
                        r13 = BitmapFactory.decodeFile(b8.K(r14, str4, true, true).toString());
                    } catch (Throwable th2) {
                        th = th2;
                        str3 = str4;
                        i11 = i15;
                        f8.g(th, true);
                        dialog = (TLRPC.Dialog) this.g.f(l4.longValue());
                        i12 = R.id.contacts_widget_item_badge_bg2;
                        if (dialog != null) {
                        }
                        i13 = i11;
                        if (i16 == 0) {
                        }
                        remoteViews3.setViewVisibility(i12, 8);
                        Bundle bundle2 = new Bundle();
                        if (o5.E(l4.longValue())) {
                        }
                        bundle2.putInt("currentAccount", cVar.a);
                        Intent intent2 = new Intent();
                        intent2.putExtras(bundle2);
                        remoteViews3.setOnClickFillInIntent(i16 != 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, intent2);
                        i16++;
                        i15 = i13;
                        str4 = str3;
                    }
                } else {
                    r13 = str4;
                }
                int L = i0.L(48.0f);
                Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                createBitmap.eraseColor(i15);
                try {
                    canvas = new Canvas(createBitmap);
                    if (r13 == 0) {
                        if (r02 != 0) {
                            r8Var = new org.telegram.ui.Components.r8(i15, r02);
                            if (h20.z(r02)) {
                                r8Var.g(12);
                            } else if (h20.B(r02)) {
                                r8Var.g(1);
                            }
                        } else {
                            ?? r8Var2 = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                            int i18 = cVar.a;
                            r8Var2.q(r12);
                            r8Var = r8Var2;
                        }
                        r8Var.setBounds(i15, i15, L, L);
                        r8Var.draw(canvas);
                        i11 = i15;
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
                        i11 = i15;
                        try {
                            this.f.set(0.0f, 0.0f, r13.getWidth(), r13.getHeight());
                            canvas.drawRoundRect(this.f, r13.getWidth(), r13.getHeight(), this.e);
                            canvas.restore();
                        } catch (Throwable th3) {
                            th = th3;
                            str3 = null;
                            f8.g(th, true);
                            dialog = (TLRPC.Dialog) this.g.f(l4.longValue());
                            i12 = R.id.contacts_widget_item_badge_bg2;
                            if (dialog != null) {
                            }
                            i13 = i11;
                            if (i16 == 0) {
                            }
                            remoteViews3.setViewVisibility(i12, 8);
                            Bundle bundle22 = new Bundle();
                            if (o5.E(l4.longValue())) {
                            }
                            bundle22.putInt("currentAccount", cVar.a);
                            Intent intent22 = new Intent();
                            intent22.putExtras(bundle22);
                            remoteViews3.setOnClickFillInIntent(i16 != 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, intent22);
                            i16++;
                            i15 = i13;
                            str4 = str3;
                        }
                    }
                    str3 = null;
                } catch (Throwable th4) {
                    th = th4;
                    i11 = i15;
                }
                try {
                    canvas.setBitmap(null);
                    remoteViews3.setImageViewBitmap(i16 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2, createBitmap);
                } catch (Throwable th5) {
                    th = th5;
                    f8.g(th, true);
                    dialog = (TLRPC.Dialog) this.g.f(l4.longValue());
                    i12 = R.id.contacts_widget_item_badge_bg2;
                    if (dialog != null) {
                    }
                    i13 = i11;
                    if (i16 == 0) {
                    }
                    remoteViews3.setViewVisibility(i12, 8);
                    Bundle bundle222 = new Bundle();
                    if (o5.E(l4.longValue())) {
                    }
                    bundle222.putInt("currentAccount", cVar.a);
                    Intent intent222 = new Intent();
                    intent222.putExtras(bundle222);
                    remoteViews3.setOnClickFillInIntent(i16 != 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, intent222);
                    i16++;
                    i15 = i13;
                    str4 = str3;
                }
                dialog = (TLRPC.Dialog) this.g.f(l4.longValue());
                i12 = R.id.contacts_widget_item_badge_bg2;
                if (dialog != null || (i14 = dialog.unread_count) <= 0) {
                    i13 = i11;
                    if (i16 == 0) {
                        i12 = R.id.contacts_widget_item_badge_bg1;
                    }
                    remoteViews3.setViewVisibility(i12, 8);
                } else {
                    if (i14 > 99) {
                        Object[] objArr = new Object[1];
                        objArr[i11] = 99;
                        format = String.format("%d+", objArr);
                    } else {
                        Object[] objArr2 = new Object[1];
                        objArr2[i11] = Integer.valueOf(i14);
                        format = String.format("%d", objArr2);
                    }
                    remoteViews3.setTextViewText(i16 == 0 ? R.id.contacts_widget_item_badge1 : R.id.contacts_widget_item_badge2, format);
                    if (i16 == 0) {
                        i12 = R.id.contacts_widget_item_badge_bg1;
                    }
                    i13 = i11;
                    remoteViews3.setViewVisibility(i12, i13);
                }
                Bundle bundle2222 = new Bundle();
                if (o5.E(l4.longValue())) {
                    bundle2222.putLong("chatId", -l4.longValue());
                } else {
                    bundle2222.putLong("userId", l4.longValue());
                }
                bundle2222.putInt("currentAccount", cVar.a);
                Intent intent2222 = new Intent();
                intent2222.putExtras(bundle2222);
                remoteViews3.setOnClickFillInIntent(i16 != 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, intent2222);
            }
            i16++;
            i15 = i13;
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
        w0.w();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        c cVar = this.d;
        if (cVar != null) {
            int i10 = cVar.a;
            if (d20.i(i10).p()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                a0.h hVar = new a0.h();
                hs a02 = hs.a0(i10);
                int i11 = this.c;
                a0.h hVar2 = this.g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                a02.a.c(new rr(a02, i11, arrayList, 1, hVar2, hVar, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e) {
                    a02.o(e, true);
                }
                vp.r1(i10).V3(arrayList2, true);
                vp.r1(i10).P3(arrayList3, true);
            }
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
