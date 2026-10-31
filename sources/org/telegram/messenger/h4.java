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
import android.text.SpannableStringBuilder;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h4 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList a;
    public Context b;
    public int c;
    public c d;
    public Paint e;
    public RectF f;
    public a0.h g;
    public a0.h h;
    public boolean i;

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        if (this.i) {
            return 1;
        }
        return this.a.size() + 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:118|(1:120)(2:129|(1:131)(9:132|(1:134)(1:136)|135|122|123|124|125|100|101))|121|122|123|124|125|100|101) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03e1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03e2, code lost:
    
        org.telegram.messenger.f8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0293, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) != false) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x05bc  */
    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RemoteViews getViewAt(int i10) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.FileLocation fileLocation;
        String str;
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        boolean z10;
        Bitmap decodeFile;
        jj jjVar;
        TLRPC.Dialog dialog;
        int i11;
        int i12;
        int i13;
        TLRPC.Chat L0;
        TLRPC.User user2;
        CharSequence charSequence;
        SpannableStringBuilder valueOf;
        char c10;
        char c11;
        String charSequence2;
        char c12;
        char c13;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence3;
        CharSequence charSequence4;
        org.telegram.ui.Components.r8 r8Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ArrayList arrayList = this.a;
        Context context = this.b;
        c cVar = this.d;
        if (this.i) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_deleted);
            remoteViews.setTextViewText(R.id.widget_deleted_text, cd.L0(2131742900, null));
            return remoteViews;
        }
        if (i10 >= arrayList.size()) {
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.widget_edititem);
            remoteViews2.setTextViewText(R.id.widget_edititem_text, cd.L0(2131744283, null));
            Bundle bundle = new Bundle();
            bundle.putInt("appWidgetId", this.c);
            bundle.putInt("appWidgetType", 0);
            bundle.putInt("currentAccount", cVar.a);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            remoteViews2.setOnClickFillInIntent(R.id.widget_edititem, intent);
            return remoteViews2;
        }
        Long l4 = (Long) arrayList.get(i10);
        CharSequence charSequence5 = "";
        if (o5.E(l4.longValue())) {
            user = vp.r1(cVar.a).Z1(l4);
            if (user != null) {
                str = h20.B(user) ? cd.L0(2131745918, null) : h20.z(user) ? cd.L0(2131746281, null) : h20.x(user) ? cd.L0(2131749337, null) : i5.m(0, user.first_name, user.last_name);
                if (h20.z(user) || h20.B(user) || (userProfilePhoto = user.photo) == null || (fileLocation = userProfilePhoto.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
                    chat = null;
                    fileLocation = null;
                } else {
                    chat = null;
                }
            } else {
                chat = null;
                fileLocation = null;
                str = "";
            }
        } else {
            int i14 = cVar.a;
            int i15 = cVar.a;
            TLRPC.Chat L02 = vp.r1(i14).L0(Long.valueOf(-l4.longValue()));
            if (L02 != null) {
                if (w3.p0(L02)) {
                    String i16 = gg.e.i(i15, L02, false);
                    TLRPC.Chat L03 = vp.r1(i15).L0(Long.valueOf(L02.linked_monoforum_id));
                    if (L03 == null || (chatPhoto = L03.photo) == null || (fileLocation2 = chatPhoto.photo_small) == null || fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                        fileLocation2 = null;
                    }
                    fileLocation = fileLocation2;
                    str = i16;
                } else {
                    str = L02.title;
                    TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                    if (chatPhoto2 == null || (fileLocation = chatPhoto2.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
                        chat = L02;
                        user = null;
                        fileLocation = null;
                    }
                }
                chat = L02;
                user = null;
            } else {
                chat = L02;
                user = null;
                fileLocation = null;
                str = "";
            }
        }
        RemoteViews remoteViews3 = new RemoteViews(context.getPackageName(), R.layout.shortcut_widget_item);
        remoteViews3.setTextViewText(R.id.shortcut_widget_item_text, str);
        if (fileLocation != null) {
            try {
                b8.G(d20.s0);
                decodeFile = BitmapFactory.decodeFile(b8.K(fileLocation, null, true, true).toString());
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                f8.g(th, z10);
                jjVar = (jj) this.h.f(l4.longValue());
                dialog = (TLRPC.Dialog) this.g.f(l4.longValue());
                if (jjVar != null) {
                }
                if (dialog != null) {
                }
                i12 = 0;
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
                Bundle bundle2 = new Bundle();
                if (o5.E(l4.longValue())) {
                }
                bundle2.putInt("currentAccount", cVar.a);
                Intent intent2 = new Intent();
                intent2.putExtras(bundle2);
                remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent2);
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i10 == getCount() ? 8 : i12);
                return remoteViews3;
            }
        } else {
            decodeFile = null;
        }
        try {
            int L = i0.L(48.0f);
            Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            Canvas canvas = new Canvas(createBitmap);
            if (decodeFile == null) {
                if (user != null) {
                    r8Var = new org.telegram.ui.Components.r8(0, user);
                    if (h20.z(user)) {
                        r8Var.g(12);
                    } else if (h20.B(user)) {
                        r8Var.g(1);
                    }
                } else {
                    r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                    int i17 = cVar.a;
                    r8Var.q(chat);
                }
                r8Var.setBounds(0, 0, L, L);
                r8Var.draw(canvas);
            } else {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
                if (this.e == null) {
                    this.e = new Paint(1);
                    this.f = new RectF();
                }
                float width = L / decodeFile.getWidth();
                canvas.save();
                canvas.scale(width, width);
                this.e.setShader(bitmapShader);
                this.f.set(0.0f, 0.0f, decodeFile.getWidth(), decodeFile.getHeight());
                canvas.drawRoundRect(this.f, decodeFile.getWidth(), decodeFile.getHeight(), this.e);
                canvas.restore();
            }
            canvas.setBitmap(null);
            remoteViews3.setImageViewBitmap(R.id.shortcut_widget_item_avatar, createBitmap);
        } catch (Throwable th3) {
            th = th3;
            z10 = true;
            f8.g(th, z10);
            jjVar = (jj) this.h.f(l4.longValue());
            dialog = (TLRPC.Dialog) this.g.f(l4.longValue());
            if (jjVar != null) {
            }
            if (dialog != null) {
            }
            i12 = 0;
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
            Bundle bundle22 = new Bundle();
            if (o5.E(l4.longValue())) {
            }
            bundle22.putInt("currentAccount", cVar.a);
            Intent intent22 = new Intent();
            intent22.putExtras(bundle22);
            remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent22);
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i10 == getCount() ? 8 : i12);
            return remoteViews3;
        }
        jjVar = (jj) this.h.f(l4.longValue());
        dialog = (TLRPC.Dialog) this.g.f(l4.longValue());
        if (jjVar != null) {
            long Z0 = jjVar.Z0();
            if (o5.E(Z0)) {
                user2 = vp.r1(cVar.a).Z1(Long.valueOf(Z0));
                L0 = null;
            } else {
                L0 = vp.r1(cVar.a).L0(Long.valueOf(-Z0));
                user2 = null;
            }
            int color = context.getResources().getColor(R.color.widget_text);
            if (jjVar.k instanceof TLRPC.TL_messageService) {
                if (w3.T(chat)) {
                    TLRPC.MessageAction messageAction = jjVar.k.action;
                    charSequence4 = charSequence5;
                    if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                        charSequence4 = charSequence5;
                    }
                    color = context.getResources().getColor(R.color.widget_action_text);
                    charSequence3 = charSequence4;
                }
                charSequence4 = jjVar.v;
                color = context.getResources().getColor(R.color.widget_action_text);
                charSequence3 = charSequence4;
            } else {
                String str2 = "📎 ";
                if (chat == null || L0 != null || (w3.T(chat) && !w3.n0(chat))) {
                    TLRPC.Message message = jjVar.k;
                    TLRPC.MessageMedia messageMedia = message.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                        charSequence3 = cd.L0(2131753947, null);
                    } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (messageMedia.document instanceof TLRPC.TL_documentEmpty) && messageMedia.ttl_seconds != 0) {
                        charSequence3 = cd.L0(2131753932, null);
                    } else if (jjVar.z != null) {
                        if (jj.L4(message)) {
                            str2 = "📹 ";
                        } else if (jj.R4(jjVar.k)) {
                            str2 = "🎤 ";
                        } else if (jjVar.I3()) {
                            str2 = "🎧 ";
                        } else if (jj.S3(jjVar.k)) {
                            str2 = "🖼 ";
                        }
                        StringBuilder t10 = a1.g.t(str2);
                        t10.append((Object) jjVar.z);
                        charSequence3 = t10.toString();
                    } else {
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            charSequence = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                            charSequence = "🎮 " + jjVar.k.media.game.title;
                        } else if (jjVar.D == 14) {
                            charSequence = c3.i0.n("🎧 ", jjVar.x1(true), " - ", jjVar.z1(true));
                        } else {
                            charSequence = jjVar.v;
                            i0.x1(charSequence, jjVar.Y1, null);
                        }
                        CharSequence charSequence6 = charSequence;
                        charSequence3 = charSequence6;
                        if (jjVar.k.media != null) {
                            charSequence3 = charSequence6;
                            if (!jjVar.F3()) {
                                color = context.getResources().getColor(R.color.widget_action_text);
                                charSequence3 = charSequence6;
                            }
                        }
                    }
                } else {
                    String L04 = jjVar.P3() ? cd.L0(2131750512, null) : user2 != null ? h20.j(user2, true).replace("\n", "") : "DELETED";
                    CharSequence charSequence7 = jjVar.z;
                    try {
                        if (charSequence7 != null) {
                            String charSequence8 = charSequence7.toString();
                            if (charSequence8.length() > 150) {
                                charSequence8 = charSequence8.substring(0, zs.g2);
                            }
                            if (jj.L4(jjVar.k)) {
                                str2 = "📹 ";
                            } else if (jj.R4(jjVar.k)) {
                                str2 = "🎤 ";
                            } else if (jjVar.I3()) {
                                str2 = "🎧 ";
                            } else if (jj.S3(jjVar.k)) {
                                str2 = "🖼 ";
                            }
                            StringBuilder t11 = a1.g.t(str2);
                            t11.append(charSequence8.replace('\n', ' '));
                            valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", t11.toString(), L04));
                        } else if (jjVar.k.media == null || jjVar.F3()) {
                            String str3 = jjVar.k.message;
                            if (str3 != null) {
                                if (str3.length() > 150) {
                                    c10 = 0;
                                    str3 = str3.substring(0, zs.g2);
                                } else {
                                    c10 = 0;
                                }
                                Object[] objArr = new Object[2];
                                objArr[c10] = str3.replace('\n', ' ').trim();
                                objArr[1] = L04;
                                valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr));
                            } else {
                                valueOf = SpannableStringBuilder.valueOf("");
                            }
                        } else {
                            color = context.getResources().getColor(R.color.widget_action_text);
                            TLRPC.MessageMedia messageMedia2 = jjVar.k.media;
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                charSequence2 = a1.g.n("📊 \u2068", ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.question.text, "\u2069");
                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                charSequence2 = a1.g.n("🎮 \u2068", messageMedia2.game.title, "\u2069");
                            } else {
                                if (jjVar.D == 14) {
                                    c11 = 1;
                                    charSequence2 = org.telegram.ui.Cells.f1.o("🎧 \u2068", jjVar.x1(true), " - ", jjVar.z1(true), "\u2069");
                                } else {
                                    c11 = 1;
                                    charSequence2 = jjVar.v.toString();
                                }
                                c12 = ' ';
                                c13 = '\n';
                                String replace = charSequence2.replace(c13, c12);
                                Object[] objArr2 = new Object[2];
                                objArr2[0] = replace;
                                objArr2[c11] = L04;
                                SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr2));
                                valueOf2.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.o9, null), L04.length() + 2, valueOf2.length(), 33);
                                spannableStringBuilder = valueOf2;
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.k9, null), 0, L04.length() + 1, 33);
                                charSequence3 = spannableStringBuilder;
                            }
                            c12 = ' ';
                            c13 = '\n';
                            c11 = 1;
                            String replace2 = charSequence2.replace(c13, c12);
                            Object[] objArr22 = new Object[2];
                            objArr22[0] = replace2;
                            objArr22[c11] = L04;
                            SpannableStringBuilder valueOf22 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr22));
                            valueOf22.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.o9, null), L04.length() + 2, valueOf22.length(), 33);
                            spannableStringBuilder = valueOf22;
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.k9, null), 0, L04.length() + 1, 33);
                            charSequence3 = spannableStringBuilder;
                        }
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.k9, null), 0, L04.length() + 1, 33);
                        charSequence3 = spannableStringBuilder;
                    } catch (Exception e) {
                        f8.g(e, true);
                        charSequence3 = spannableStringBuilder;
                    }
                    spannableStringBuilder = valueOf;
                }
            }
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, cd.a1(jjVar.k.date));
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, charSequence3.toString());
            remoteViews3.setTextColor(R.id.shortcut_widget_item_message, color);
        } else {
            if (dialog == null || (i11 = dialog.last_message_date) == 0) {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, "");
            } else {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, cd.a1(i11));
            }
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, "");
        }
        if (dialog != null || (i13 = dialog.unread_count) <= 0) {
            i12 = 0;
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
        } else {
            i12 = 0;
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_badge, String.format("%d", Integer.valueOf(i13)));
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 0);
            if (vp.r1(cVar.a).q2(dialog.id, 0L, null)) {
                remoteViews3.setBoolean(R.id.shortcut_widget_item_badge, "setEnabled", false);
                remoteViews3.setInt(R.id.shortcut_widget_item_badge, "setBackgroundResource", R.drawable.widget_badge_muted_background);
            } else {
                remoteViews3.setBoolean(R.id.shortcut_widget_item_badge, "setEnabled", true);
                remoteViews3.setInt(R.id.shortcut_widget_item_badge, "setBackgroundResource", R.drawable.widget_badge_background);
            }
        }
        Bundle bundle222 = new Bundle();
        if (o5.E(l4.longValue())) {
            bundle222.putLong("userId", l4.longValue());
        } else {
            bundle222.putLong("chatId", -l4.longValue());
        }
        bundle222.putInt("currentAccount", cVar.a);
        Intent intent222 = new Intent();
        intent222.putExtras(bundle222);
        remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent222);
        remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i10 == getCount() ? 8 : i12);
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
        a0.h hVar = this.h;
        hVar.b();
        c cVar = this.d;
        if (cVar != null) {
            int i10 = cVar.a;
            if (d20.i(i10).p()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                a0.h hVar2 = new a0.h();
                hs a02 = hs.a0(i10);
                int i11 = this.c;
                a0.h hVar3 = this.g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                a02.a.c(new rr(a02, i11, arrayList, 0, hVar3, hVar2, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e) {
                    a02.o(e, true);
                }
                vp.r1(i10).V3(arrayList2, true);
                vp.r1(i10).P3(arrayList3, true);
                hVar.b();
                int m10 = hVar2.m();
                for (int i12 = 0; i12 < m10; i12++) {
                    hVar.k(new jj(cVar.a, (TLRPC.Message) hVar2.n(i12), (a0.h) null, (a0.h) null, false, true), hVar2.j(i12));
                }
            }
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
