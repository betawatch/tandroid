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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class g4 implements RemoteViewsService.RemoteViewsFactory {
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
    public final long getItemId(int i7) {
        return i7;
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
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0293, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) != false) goto L115;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x05b3  */
    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RemoteViews getViewAt(int i7) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.FileLocation fileLocation;
        String str;
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        boolean z10;
        Bitmap decodeFile;
        fj fjVar;
        TLRPC.Dialog dialog;
        int i10;
        int i11;
        int i12;
        TLRPC.Chat O0;
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
        org.telegram.ui.Components.b9 b9Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ArrayList arrayList = this.a;
        Context context = this.b;
        c cVar = this.d;
        if (this.i) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_deleted);
            remoteViews.setTextViewText(R.id.widget_deleted_text, gd.M0(2131742616, null));
            return remoteViews;
        }
        if (i7 >= arrayList.size()) {
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.widget_edititem);
            remoteViews2.setTextViewText(R.id.widget_edititem_text, gd.M0(2131744022, null));
            Bundle bundle = new Bundle();
            bundle.putInt("appWidgetId", this.c);
            bundle.putInt("appWidgetType", 0);
            bundle.putInt("currentAccount", cVar.a);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            remoteViews2.setOnClickFillInIntent(R.id.widget_edititem, intent);
            return remoteViews2;
        }
        Long l10 = (Long) arrayList.get(i7);
        CharSequence charSequence5 = "";
        if (n5.E(l10.longValue())) {
            user = mp.u1(cVar.a).c2(l10);
            if (user != null) {
                str = o10.C(user) ? gd.M0(2131745706, null) : o10.A(user) ? gd.M0(2131746071, null) : o10.y(user) ? gd.M0(2131749136, null) : i5.m(0, user.first_name, user.last_name);
                if (o10.A(user) || o10.C(user) || (userProfilePhoto = user.photo) == null || (fileLocation = userProfilePhoto.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
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
            int i13 = cVar.a;
            int i14 = cVar.a;
            TLRPC.Chat O02 = mp.u1(i13).O0(Long.valueOf(-l10.longValue()));
            if (O02 != null) {
                if (v3.p0(O02)) {
                    String j3 = qg.c.j(i14, O02, false);
                    TLRPC.Chat O03 = mp.u1(i14).O0(Long.valueOf(O02.linked_monoforum_id));
                    if (O03 == null || (chatPhoto = O03.photo) == null || (fileLocation2 = chatPhoto.photo_small) == null || fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                        fileLocation2 = null;
                    }
                    fileLocation = fileLocation2;
                    str = j3;
                } else {
                    str = O02.title;
                    TLRPC.ChatPhoto chatPhoto2 = O02.photo;
                    if (chatPhoto2 == null || (fileLocation = chatPhoto2.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
                        chat = O02;
                        user = null;
                        fileLocation = null;
                    }
                }
                chat = O02;
                user = null;
            } else {
                chat = O02;
                user = null;
                fileLocation = null;
                str = "";
            }
        }
        RemoteViews remoteViews3 = new RemoteViews(context.getPackageName(), R.layout.shortcut_widget_item);
        remoteViews3.setTextViewText(R.id.shortcut_widget_item_text, str);
        if (fileLocation != null) {
            try {
                w7.G(j10.t0);
                decodeFile = BitmapFactory.decodeFile(w7.J(fileLocation, null, true, true).toString());
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                a8.g(th, z10);
                fjVar = (fj) this.h.f(l10.longValue());
                dialog = (TLRPC.Dialog) this.g.f(l10.longValue());
                if (fjVar != null) {
                }
                if (dialog != null) {
                }
                i11 = 0;
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
                Bundle bundle2 = new Bundle();
                if (n5.E(l10.longValue())) {
                }
                bundle2.putInt("currentAccount", cVar.a);
                Intent intent2 = new Intent();
                intent2.putExtras(bundle2);
                remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent2);
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i7 == getCount() ? 8 : i11);
                return remoteViews3;
            }
        } else {
            decodeFile = null;
        }
        try {
            int L = g0.L(48.0f);
            Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            Canvas canvas = new Canvas(createBitmap);
            if (decodeFile == null) {
                if (user != null) {
                    b9Var = new org.telegram.ui.Components.b9(0, user);
                    if (o10.A(user)) {
                        b9Var.g(12);
                    } else if (o10.C(user)) {
                        b9Var.g(1);
                    }
                } else {
                    b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
                    int i15 = cVar.a;
                    b9Var.q(chat);
                }
                b9Var.setBounds(0, 0, L, L);
                b9Var.draw(canvas);
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
            a8.g(th, z10);
            fjVar = (fj) this.h.f(l10.longValue());
            dialog = (TLRPC.Dialog) this.g.f(l10.longValue());
            if (fjVar != null) {
            }
            if (dialog != null) {
            }
            i11 = 0;
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
            Bundle bundle22 = new Bundle();
            if (n5.E(l10.longValue())) {
            }
            bundle22.putInt("currentAccount", cVar.a);
            Intent intent22 = new Intent();
            intent22.putExtras(bundle22);
            remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent22);
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i7 == getCount() ? 8 : i11);
            return remoteViews3;
        }
        fjVar = (fj) this.h.f(l10.longValue());
        dialog = (TLRPC.Dialog) this.g.f(l10.longValue());
        if (fjVar != null) {
            long Z0 = fjVar.Z0();
            if (n5.E(Z0)) {
                user2 = mp.u1(cVar.a).c2(Long.valueOf(Z0));
                O0 = null;
            } else {
                O0 = mp.u1(cVar.a).O0(Long.valueOf(-Z0));
                user2 = null;
            }
            int color = context.getResources().getColor(R.color.widget_text);
            if (fjVar.k instanceof TLRPC.TL_messageService) {
                if (v3.T(chat)) {
                    TLRPC.MessageAction messageAction = fjVar.k.action;
                    charSequence4 = charSequence5;
                    if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                        charSequence4 = charSequence5;
                    }
                    color = context.getResources().getColor(R.color.widget_action_text);
                    charSequence3 = charSequence4;
                }
                charSequence4 = fjVar.v;
                color = context.getResources().getColor(R.color.widget_action_text);
                charSequence3 = charSequence4;
            } else {
                String str2 = "📎 ";
                if (chat == null || O0 != null || (v3.T(chat) && !v3.n0(chat))) {
                    TLRPC.Message message = fjVar.k;
                    TLRPC.MessageMedia messageMedia = message.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                        charSequence3 = gd.M0(2131753945, null);
                    } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (messageMedia.document instanceof TLRPC.TL_documentEmpty) && messageMedia.ttl_seconds != 0) {
                        charSequence3 = gd.M0(2131753930, null);
                    } else if (fjVar.z != null) {
                        if (fj.L4(message)) {
                            str2 = "📹 ";
                        } else if (fj.R4(fjVar.k)) {
                            str2 = "🎤 ";
                        } else if (fjVar.I3()) {
                            str2 = "🎧 ";
                        } else if (fj.S3(fjVar.k)) {
                            str2 = "🖼 ";
                        }
                        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str2);
                        m10.append((Object) fjVar.z);
                        charSequence3 = m10.toString();
                    } else {
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            charSequence = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                            charSequence = "🎮 " + fjVar.k.media.game.title;
                        } else if (fjVar.D == 14) {
                            charSequence = com.google.android.gms.internal.vision.e2.l("🎧 ", fjVar.w1(true), " - ", fjVar.y1(true));
                        } else {
                            charSequence = fjVar.v;
                            g0.x1(charSequence, fjVar.a2, null);
                        }
                        CharSequence charSequence6 = charSequence;
                        charSequence3 = charSequence6;
                        if (fjVar.k.media != null) {
                            charSequence3 = charSequence6;
                            if (!fjVar.F3()) {
                                color = context.getResources().getColor(R.color.widget_action_text);
                                charSequence3 = charSequence6;
                            }
                        }
                    }
                } else {
                    String M0 = fjVar.P3() ? gd.M0(2131750487, null) : user2 != null ? o10.k(user2, true).replace("\n", "") : "DELETED";
                    CharSequence charSequence7 = fjVar.z;
                    try {
                        if (charSequence7 != null) {
                            String charSequence8 = charSequence7.toString();
                            if (charSequence8.length() > 150) {
                                charSequence8 = charSequence8.substring(0, ks.g2);
                            }
                            if (fj.L4(fjVar.k)) {
                                str2 = "📹 ";
                            } else if (fj.R4(fjVar.k)) {
                                str2 = "🎤 ";
                            } else if (fjVar.I3()) {
                                str2 = "🎧 ";
                            } else if (fj.S3(fjVar.k)) {
                                str2 = "🖼 ";
                            }
                            StringBuilder m11 = com.google.android.gms.internal.vision.e2.m(str2);
                            m11.append(charSequence8.replace('\n', ' '));
                            valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", m11.toString(), M0));
                        } else if (fjVar.k.media == null || fjVar.F3()) {
                            String str3 = fjVar.k.message;
                            if (str3 != null) {
                                if (str3.length() > 150) {
                                    c10 = 0;
                                    str3 = str3.substring(0, ks.g2);
                                } else {
                                    c10 = 0;
                                }
                                Object[] objArr = new Object[2];
                                objArr[c10] = str3.replace('\n', ' ').trim();
                                objArr[1] = M0;
                                valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr));
                            } else {
                                valueOf = SpannableStringBuilder.valueOf("");
                            }
                        } else {
                            color = context.getResources().getColor(R.color.widget_action_text);
                            TLRPC.MessageMedia messageMedia2 = fjVar.k.media;
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                charSequence2 = a8.p0.p("📊 \u2068", ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.question.text, "\u2069");
                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                charSequence2 = a8.p0.p("🎮 \u2068", messageMedia2.game.title, "\u2069");
                            } else {
                                if (fjVar.D == 14) {
                                    c11 = 1;
                                    charSequence2 = p5.c.l("🎧 \u2068", fjVar.w1(true), " - ", fjVar.y1(true), "\u2069");
                                } else {
                                    c11 = 1;
                                    charSequence2 = fjVar.v.toString();
                                }
                                c12 = ' ';
                                c13 = '\n';
                                String replace = charSequence2.replace(c13, c12);
                                Object[] objArr2 = new Object[2];
                                objArr2[0] = replace;
                                objArr2[c11] = M0;
                                SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr2));
                                valueOf2.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.o9, null), M0.length() + 2, valueOf2.length(), 33);
                                spannableStringBuilder = valueOf2;
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.k9, null), 0, M0.length() + 1, 33);
                                charSequence3 = spannableStringBuilder;
                            }
                            c12 = ' ';
                            c13 = '\n';
                            c11 = 1;
                            String replace2 = charSequence2.replace(c13, c12);
                            Object[] objArr22 = new Object[2];
                            objArr22[0] = replace2;
                            objArr22[c11] = M0;
                            SpannableStringBuilder valueOf22 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr22));
                            valueOf22.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.o9, null), M0.length() + 2, valueOf22.length(), 33);
                            spannableStringBuilder = valueOf22;
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.k9, null), 0, M0.length() + 1, 33);
                            charSequence3 = spannableStringBuilder;
                        }
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.k9, null), 0, M0.length() + 1, 33);
                        charSequence3 = spannableStringBuilder;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        charSequence3 = spannableStringBuilder;
                    }
                    spannableStringBuilder = valueOf;
                }
            }
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, gd.e1(fjVar.k.date));
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, charSequence3.toString());
            remoteViews3.setTextColor(R.id.shortcut_widget_item_message, color);
        } else {
            if (dialog == null || (i10 = dialog.last_message_date) == 0) {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, "");
            } else {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, gd.e1(i10));
            }
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, "");
        }
        if (dialog != null || (i12 = dialog.unread_count) <= 0) {
            i11 = 0;
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
        } else {
            i11 = 0;
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_badge, String.format("%d", Integer.valueOf(i12)));
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 0);
            if (mp.u1(cVar.a).u2(dialog.id, 0L, null)) {
                remoteViews3.setInt(R.id.shortcut_widget_item_badge, "setBackgroundResource", R.drawable.widget_badge_muted_background);
            } else {
                remoteViews3.setInt(R.id.shortcut_widget_item_badge, "setBackgroundResource", R.drawable.widget_badge_background);
            }
        }
        Bundle bundle222 = new Bundle();
        if (n5.E(l10.longValue())) {
            bundle222.putLong("userId", l10.longValue());
        } else {
            bundle222.putLong("chatId", -l10.longValue());
        }
        bundle222.putInt("currentAccount", cVar.a);
        Intent intent222 = new Intent();
        intent222.putExtras(bundle222);
        remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent222);
        remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i7 == getCount() ? 8 : i11);
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
        a0.h hVar = this.h;
        hVar.b();
        c cVar = this.d;
        if (cVar != null) {
            int i7 = cVar.a;
            if (j10.i(i7).p()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                a0.h hVar2 = new a0.h();
                tr a02 = tr.a0(i7);
                int i10 = this.c;
                a0.h hVar3 = this.g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                a02.a.c(new bg.c(a02, i10, arrayList, 0, hVar3, hVar2, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e10) {
                    a02.o(e10, true);
                }
                mp.u1(i7).f4(arrayList2, true);
                mp.u1(i7).Z3(arrayList3, true);
                hVar.b();
                int m10 = hVar2.m();
                for (int i11 = 0; i11 < m10; i11++) {
                    hVar.k(new fj(cVar.a, (TLRPC.Message) hVar2.n(i11), (a0.h) null, (a0.h) null, false, true), hVar2.j(i11));
                }
            }
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
