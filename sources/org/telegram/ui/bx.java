package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bx extends FrameLayout {
    public org.telegram.ui.Components.h9 a;
    public org.telegram.ui.Components.h9 b;
    public Drawable c;
    public Drawable d;
    public final Drawable e;
    public Paint f;
    public RectF h;
    public final ViewGroup[] n;
    public final /* synthetic */ cx r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(cx cxVar, Context context) {
        super(context);
        this.r = cxVar;
        this.f = new Paint(1);
        this.h = new RectF();
        this.n = new ViewGroup[2];
        int i3 = 0;
        setWillNotDraw(false);
        setPadding(0, org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f));
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        addView(f10, b8.mf.e(-2, -2, 17));
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context);
        t0Var.setCustomText(org.telegram.messenger.bd.M0(2131742879, null));
        f10.addView(t0Var, b8.mf.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.widget_bg);
        f10.addView(linearLayout, b8.mf.t(-2, -2, 17, 10, 0, 10, 0));
        cxVar.d = new ImageView(context);
        int i10 = cxVar.x;
        if (i10 == 0) {
            while (i3 < 2) {
                this.n[i3] = (ViewGroup) cxVar.getParentActivity().getLayoutInflater().inflate(R.layout.shortcut_widget_item, (ViewGroup) null);
                linearLayout.addView(this.n[i3], b8.mf.o(-1, -2));
                i3++;
            }
            linearLayout.addView(cxVar.d, b8.mf.r(org.telegram.messenger.hs.v3, org.telegram.messenger.hs.q2, 17));
            cxVar.d.setImageResource(R.drawable.chats_widget_preview);
        } else if (i10 == 1) {
            while (i3 < 2) {
                this.n[i3] = (ViewGroup) cxVar.getParentActivity().getLayoutInflater().inflate(R.layout.contacts_widget_item, (ViewGroup) null);
                linearLayout.addView(this.n[i3], b8.mf.o(org.telegram.messenger.hs.q2, -2));
                i3++;
            }
            linearLayout.addView(cxVar.d, b8.mf.r(org.telegram.messenger.hs.q2, org.telegram.messenger.hs.q2, 17));
            cxVar.d.setImageResource(R.drawable.contacts_widget_preview);
        }
        a();
        this.e = org.telegram.ui.ActionBar.k6.Y0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:290|(1:292)(2:393|(1:395)(4:396|(1:398)(1:399)|294|(18:391|392|308|(1:310)(1:390)|311|312|(2:385|386)(1:314)|315|316|(4:(3:355|356|(3:358|359|360)(2:364|(1:366)))(1:319)|320|321|322)(6:370|371|372|373|374|375)|323|324|325|(1:327)(1:350)|328|329|330|(8:332|(1:334)(1:344)|335|(1:337)(1:343)|338|(1:340)|341|342)(4:345|(1:347)|348|349))(17:307|308|(0)(0)|311|312|(0)(0)|315|316|(0)(0)|323|324|325|(0)(0)|328|329|330|(0)(0))))|293|294|(1:296)|391|392|308|(0)(0)|311|312|(0)(0)|315|316|(0)(0)|323|324|325|(0)(0)|328|329|330|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:118|(1:120)(2:128|(1:130)(7:131|(1:133)(1:134)|122|123|124|100|101))|121|122|123|124|100|101) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03c4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03c5, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x084e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0858, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x026e, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) != false) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0785 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0776  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v9, types: [android.graphics.Bitmap, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        ViewGroup[] viewGroupArr;
        TLRPC.Dialog dialog;
        TLRPC.Dialog dialog2;
        String str;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        boolean z10;
        Bitmap decodeFile;
        int i3;
        int i10;
        String format;
        org.telegram.ui.Components.u8 u8Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.FileLocation fileLocation3;
        TLRPC.Dialog dialog3;
        TLRPC.Dialog dialog4;
        int i11;
        TLRPC.Chat chat2;
        String str2;
        TLRPC.User user2;
        TLRPC.Chat chat3;
        TLRPC.FileLocation fileLocation4;
        Bitmap decodeFile2;
        ViewGroup[] viewGroupArr2;
        TLRPC.Chat M0;
        TLRPC.User user3;
        CharSequence charSequence;
        SpannableStringBuilder valueOf;
        char c2;
        char c10;
        String charSequence2;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence3;
        CharSequence charSequence4;
        Drawable drawable;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        TLRPC.FileLocation fileLocation5;
        cx cxVar = this.r;
        ArrayList arrayList = cxVar.e;
        int i12 = cxVar.x;
        int i13 = 2131745911;
        int i14 = 8;
        int i15 = 0;
        ViewGroup[] viewGroupArr3 = this.n;
        ?? r12 = 0;
        if (i12 == 0) {
            int i16 = 0;
            for (int i17 = 2; i16 < i17; i17 = 2) {
                if (arrayList.isEmpty()) {
                    dialog4 = i16 < cxVar.getMessagesController().F.size() ? (TLRPC.Dialog) cxVar.getMessagesController().F.get(i16) : r12;
                } else if (i16 < arrayList.size()) {
                    dialog4 = (TLRPC.Dialog) cxVar.getMessagesController().R.f(((Long) arrayList.get(i16)).longValue());
                    if (dialog4 == null) {
                        dialog4 = new TLRPC.TL_dialog();
                        dialog4.id = ((Long) arrayList.get(i16)).longValue();
                    }
                } else {
                    dialog3 = r12;
                    if (dialog3 != null) {
                        viewGroupArr3[i16].setVisibility(i14);
                        i11 = i16;
                        viewGroupArr2 = viewGroupArr3;
                    } else {
                        viewGroupArr3[i16].setVisibility(i15);
                        if (org.telegram.messenger.m5.E(dialog3.id)) {
                            user2 = cxVar.getMessagesController().a2(Long.valueOf(dialog3.id));
                            if (user2 != null) {
                                String M02 = org.telegram.messenger.l10.B(user2) ? org.telegram.messenger.bd.M0(i13, r12) : org.telegram.messenger.l10.z(user2) ? org.telegram.messenger.bd.M0(2131746274, r12) : org.telegram.messenger.l10.x(user2) ? org.telegram.messenger.bd.M0(2131749336, r12) : org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name);
                                if (org.telegram.messenger.l10.z(user2) || org.telegram.messenger.l10.B(user2) || (userProfilePhoto2 = user2.photo) == null || (fileLocation5 = userProfilePhoto2.photo_small) == 0) {
                                    i11 = i16;
                                } else {
                                    i11 = i16;
                                    if (fileLocation5.volume_id != 0 && fileLocation5.local_id != 0) {
                                        str2 = M02;
                                        chat3 = fileLocation5;
                                        chat2 = r12;
                                    }
                                }
                                str2 = M02;
                            } else {
                                i11 = i16;
                                str2 = "";
                            }
                            chat2 = r12;
                            chat3 = chat2;
                        } else {
                            i11 = i16;
                            TLRPC.Chat M03 = cxVar.getMessagesController().M0(Long.valueOf(-dialog3.id));
                            if (M03 != null) {
                                String str3 = M03.title;
                                TLRPC.ChatPhoto chatPhoto = M03.photo;
                                if (chatPhoto == null || (fileLocation4 = chatPhoto.photo_small) == 0 || fileLocation4.volume_id == 0 || fileLocation4.local_id == 0) {
                                    chat2 = M03;
                                    str2 = str3;
                                } else {
                                    str2 = str3;
                                    chat3 = fileLocation4;
                                    chat2 = M03;
                                    user2 = r12;
                                }
                            } else {
                                chat2 = M03;
                                str2 = "";
                            }
                            user2 = r12;
                            chat3 = user2;
                        }
                        ((TextView) viewGroupArr3[i11].findViewById(R.id.shortcut_widget_item_text)).setText(str2);
                        if (chat3 != null) {
                            try {
                                cxVar.getFileLoader().getClass();
                                decodeFile2 = BitmapFactory.decodeFile(org.telegram.messenger.w7.K(chat3, r12, true, true).toString());
                            } catch (Throwable th2) {
                                org.telegram.messenger.a8.g(th2, true);
                            }
                        } else {
                            decodeFile2 = r12;
                        }
                        int L = org.telegram.messenger.g0.L(48.0f);
                        Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                        createBitmap.eraseColor(0);
                        Canvas canvas = new Canvas(createBitmap);
                        if (decodeFile2 == null) {
                            if (user2 != null) {
                                org.telegram.ui.Components.u8 u8Var2 = new org.telegram.ui.Components.u8(0, user2);
                                if (org.telegram.messenger.l10.z(user2)) {
                                    u8Var2.g(12);
                                    drawable = u8Var2;
                                } else {
                                    drawable = u8Var2;
                                    if (org.telegram.messenger.l10.B(user2)) {
                                        u8Var2.g(1);
                                        drawable = u8Var2;
                                    }
                                }
                            } else {
                                drawable = new org.telegram.ui.Components.u8(chat2);
                            }
                            drawable.setBounds(0, 0, L, L);
                            drawable.draw(canvas);
                        } else {
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader(decodeFile2, tileMode, tileMode);
                            if (this.f == null) {
                                this.f = new Paint(1);
                                this.h = new RectF();
                            }
                            float width = L / decodeFile2.getWidth();
                            canvas.save();
                            canvas.scale(width, width);
                            this.f.setShader(bitmapShader);
                            this.h.set(0.0f, 0.0f, decodeFile2.getWidth(), decodeFile2.getHeight());
                            canvas.drawRoundRect(this.h, decodeFile2.getWidth(), decodeFile2.getHeight(), this.f);
                            canvas.restore();
                        }
                        canvas.setBitmap(r12);
                        ((ImageView) viewGroupArr3[i11].findViewById(R.id.shortcut_widget_item_avatar)).setImageBitmap(createBitmap);
                        ArrayList arrayList2 = (ArrayList) cxVar.getMessagesController().S.f(dialog3.id);
                        org.telegram.messenger.zi ziVar = (arrayList2 == null || arrayList2.size() <= 0) ? r12 : (org.telegram.messenger.zi) arrayList2.get(0);
                        if (ziVar != null) {
                            long Z0 = ziVar.Z0();
                            if (Z0 > 0) {
                                user3 = cxVar.getMessagesController().a2(Long.valueOf(Z0));
                                M0 = r12;
                            } else {
                                M0 = cxVar.getMessagesController().M0(Long.valueOf(-Z0));
                                user3 = r12;
                            }
                            int color = getContext().getResources().getColor(R.color.widget_text);
                            if (ziVar.k instanceof TLRPC.TL_messageService) {
                                if (org.telegram.messenger.t3.T(chat2)) {
                                    TLRPC.MessageAction messageAction = ziVar.k.action;
                                    charSequence4 = "";
                                    if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                                        charSequence4 = "";
                                    }
                                    color = getContext().getResources().getColor(R.color.widget_action_text);
                                    viewGroupArr2 = viewGroupArr3;
                                    charSequence3 = charSequence4;
                                }
                                charSequence4 = ziVar.v;
                                color = getContext().getResources().getColor(R.color.widget_action_text);
                                viewGroupArr2 = viewGroupArr3;
                                charSequence3 = charSequence4;
                            } else {
                                String str4 = "📎 ";
                                viewGroupArr2 = viewGroupArr3;
                                if (chat2 == null || chat2.id <= 0 || M0 != null || (org.telegram.messenger.t3.T(chat2) && !org.telegram.messenger.t3.n0(chat2))) {
                                    TLRPC.Message message = ziVar.k;
                                    TLRPC.MessageMedia messageMedia = message.media;
                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                        charSequence3 = org.telegram.messenger.bd.M0(2131753947, null);
                                    } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (messageMedia.document instanceof TLRPC.TL_documentEmpty) && messageMedia.ttl_seconds != 0) {
                                        charSequence3 = org.telegram.messenger.bd.M0(2131753932, null);
                                    } else if (ziVar.z != null) {
                                        if (org.telegram.messenger.zi.M4(message)) {
                                            str4 = "📹 ";
                                        } else if (org.telegram.messenger.zi.S4(ziVar.k)) {
                                            str4 = "🎤 ";
                                        } else if (ziVar.J3()) {
                                            str4 = "🎧 ";
                                        } else if (org.telegram.messenger.zi.T3(ziVar.k)) {
                                            str4 = "🖼 ";
                                        }
                                        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str4);
                                        l10.append((Object) ziVar.z);
                                        charSequence3 = l10.toString();
                                    } else {
                                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                            charSequence = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                            charSequence = "🎮 " + ziVar.k.media.game.title;
                                        } else if (ziVar.D == 14) {
                                            charSequence = com.google.android.recaptcha.internal.a.k("🎧 ", ziVar.x1(true), " - ", ziVar.z1(true));
                                        } else {
                                            charSequence = ziVar.v;
                                            org.telegram.messenger.g0.x1(charSequence, ziVar.Y1, null);
                                        }
                                        CharSequence charSequence5 = charSequence;
                                        charSequence3 = charSequence5;
                                        if (ziVar.k.media != null) {
                                            charSequence3 = charSequence5;
                                            if (!ziVar.G3()) {
                                                color = getContext().getResources().getColor(R.color.widget_action_text);
                                                charSequence3 = charSequence5;
                                            }
                                        }
                                    }
                                } else {
                                    String M04 = ziVar.Q3() ? org.telegram.messenger.bd.M0(2131750511, r12) : user3 != null ? org.telegram.messenger.l10.j(user3, true).replace("\n", "") : "DELETED";
                                    CharSequence charSequence6 = ziVar.z;
                                    try {
                                        if (charSequence6 != null) {
                                            String charSequence7 = charSequence6.toString();
                                            if (charSequence7.length() > 150) {
                                                charSequence7 = charSequence7.substring(0, org.telegram.messenger.hs.g2);
                                            }
                                            if (org.telegram.messenger.zi.M4(ziVar.k)) {
                                                str4 = "📹 ";
                                            } else if (org.telegram.messenger.zi.S4(ziVar.k)) {
                                                str4 = "🎤 ";
                                            } else if (ziVar.J3()) {
                                                str4 = "🎧 ";
                                            } else if (org.telegram.messenger.zi.T3(ziVar.k)) {
                                                str4 = "🖼 ";
                                            }
                                            StringBuilder l11 = com.google.android.recaptcha.internal.a.l(str4);
                                            l11.append(charSequence7.replace('\n', ' '));
                                            valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", l11.toString(), M04));
                                        } else if (ziVar.k.media == null || ziVar.G3()) {
                                            String str5 = ziVar.k.message;
                                            if (str5 != null) {
                                                if (str5.length() > 150) {
                                                    c2 = 0;
                                                    str5 = str5.substring(0, org.telegram.messenger.hs.g2);
                                                } else {
                                                    c2 = 0;
                                                }
                                                Object[] objArr = new Object[2];
                                                objArr[c2] = str5.replace('\n', ' ').trim();
                                                objArr[1] = M04;
                                                valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr));
                                            } else {
                                                valueOf = SpannableStringBuilder.valueOf("");
                                            }
                                        } else {
                                            color = getContext().getResources().getColor(R.color.widget_action_text);
                                            TLRPC.MessageMedia messageMedia2 = ziVar.k.media;
                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                charSequence2 = a1.g.q("📊 \u2068", ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.question.text, "\u2069");
                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                charSequence2 = a1.g.q("🎮 \u2068", messageMedia2.game.title, "\u2069");
                                            } else {
                                                if (ziVar.D == 14) {
                                                    c10 = 1;
                                                    charSequence2 = org.telegram.ui.Cells.f1.q("🎧 \u2068", ziVar.x1(true), " - ", ziVar.z1(true), "\u2069");
                                                } else {
                                                    c10 = 1;
                                                    charSequence2 = ziVar.v.toString();
                                                }
                                                Object[] objArr2 = new Object[2];
                                                objArr2[0] = charSequence2.replace('\n', ' ');
                                                objArr2[c10] = M04;
                                                SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr2));
                                                valueOf2.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.o9, null), M04.length() + 2, valueOf2.length(), 33);
                                                spannableStringBuilder = valueOf2;
                                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.k9, null), 0, M04.length() + 1, 33);
                                                charSequence3 = spannableStringBuilder;
                                            }
                                            c10 = 1;
                                            Object[] objArr22 = new Object[2];
                                            objArr22[0] = charSequence2.replace('\n', ' ');
                                            objArr22[c10] = M04;
                                            SpannableStringBuilder valueOf22 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr22));
                                            valueOf22.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.o9, null), M04.length() + 2, valueOf22.length(), 33);
                                            spannableStringBuilder = valueOf22;
                                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.k9, null), 0, M04.length() + 1, 33);
                                            charSequence3 = spannableStringBuilder;
                                        }
                                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.k9, null), 0, M04.length() + 1, 33);
                                        charSequence3 = spannableStringBuilder;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        charSequence3 = spannableStringBuilder;
                                    }
                                    spannableStringBuilder = valueOf;
                                }
                            }
                            ((TextView) viewGroupArr2[i11].findViewById(R.id.shortcut_widget_item_time)).setText(org.telegram.messenger.bd.e1(ziVar.k.date));
                            ((TextView) viewGroupArr2[i11].findViewById(R.id.shortcut_widget_item_message)).setText(charSequence3.toString());
                            ((TextView) viewGroupArr2[i11].findViewById(R.id.shortcut_widget_item_message)).setTextColor(color);
                        } else {
                            viewGroupArr2 = viewGroupArr3;
                            if (dialog3.last_message_date != 0) {
                                ((TextView) viewGroupArr2[i11].findViewById(R.id.shortcut_widget_item_time)).setText(org.telegram.messenger.bd.e1(dialog3.last_message_date));
                            } else {
                                ((TextView) viewGroupArr2[i11].findViewById(R.id.shortcut_widget_item_time)).setText("");
                            }
                            ((TextView) viewGroupArr2[i11].findViewById(R.id.shortcut_widget_item_message)).setText("");
                        }
                        if (dialog3.unread_count > 0) {
                            ((TextView) viewGroupArr2[i11].findViewById(R.id.shortcut_widget_item_badge)).setText(String.format("%d", Integer.valueOf(dialog3.unread_count)));
                            viewGroupArr2[i11].findViewById(R.id.shortcut_widget_item_badge).setVisibility(0);
                            if (cxVar.getMessagesController().r2(dialog3.id, 0L, null)) {
                                viewGroupArr2[i11].findViewById(R.id.shortcut_widget_item_badge).setBackgroundResource(R.drawable.widget_counter_muted);
                            } else {
                                viewGroupArr2[i11].findViewById(R.id.shortcut_widget_item_badge).setBackgroundResource(R.drawable.widget_counter);
                            }
                        } else {
                            viewGroupArr2[i11].findViewById(R.id.shortcut_widget_item_badge).setVisibility(8);
                        }
                    }
                    i16 = i11 + 1;
                    viewGroupArr3 = viewGroupArr2;
                    i15 = 0;
                    i13 = 2131745911;
                    r12 = 0;
                    i14 = 8;
                }
                dialog3 = dialog4;
                if (dialog3 != null) {
                }
                i16 = i11 + 1;
                viewGroupArr3 = viewGroupArr2;
                i15 = 0;
                i13 = 2131745911;
                r12 = 0;
                i14 = 8;
            }
            viewGroupArr = viewGroupArr3;
            viewGroupArr[i15].findViewById(R.id.shortcut_widget_item_divider).setVisibility(viewGroupArr[1].getVisibility());
            viewGroupArr[1].findViewById(R.id.shortcut_widget_item_divider).setVisibility(8);
        } else {
            viewGroupArr = viewGroupArr3;
            if (i12 == 1) {
                int i18 = 0;
                while (true) {
                    if (i18 >= 2) {
                        break;
                    }
                    int i19 = 0;
                    for (int i20 = 2; i19 < i20; i20 = 2) {
                        int i21 = (i18 * 2) + i19;
                        if (arrayList.isEmpty()) {
                            if (i21 < cxVar.getMediaDataController().j1.size()) {
                                long j10 = ((TLRPC.TL_topPeer) cxVar.getMediaDataController().j1.get(i21)).peer.user_id;
                                dialog = (TLRPC.Dialog) cxVar.getMessagesController().R.f(j10);
                                if (dialog == null) {
                                    dialog = new TLRPC.TL_dialog();
                                    dialog.id = j10;
                                }
                                dialog2 = dialog;
                            }
                            dialog2 = null;
                        } else {
                            if (i21 < arrayList.size()) {
                                dialog = (TLRPC.Dialog) cxVar.getMessagesController().R.f(((Long) arrayList.get(i21)).longValue());
                                if (dialog == null) {
                                    dialog = new TLRPC.TL_dialog();
                                    dialog.id = ((Long) arrayList.get(i21)).longValue();
                                }
                                dialog2 = dialog;
                            }
                            dialog2 = null;
                        }
                        int i22 = R.id.contacts_widget_item2;
                        if (dialog2 == null) {
                            ViewGroup viewGroup = viewGroupArr[i18];
                            if (i19 == 0) {
                                i22 = R.id.contacts_widget_item1;
                            }
                            viewGroup.findViewById(i22).setVisibility(4);
                            if (i21 == 0 || i21 == 2) {
                                viewGroupArr[i18].setVisibility(8);
                            }
                        } else {
                            ViewGroup viewGroup2 = viewGroupArr[i18];
                            if (i19 == 0) {
                                i22 = R.id.contacts_widget_item1;
                            }
                            viewGroup2.findViewById(i22).setVisibility(0);
                            if (i21 == 0 || i21 == 2) {
                                viewGroupArr[i18].setVisibility(0);
                            }
                            if (org.telegram.messenger.m5.E(dialog2.id)) {
                                user = cxVar.getMessagesController().a2(Long.valueOf(dialog2.id));
                                if (org.telegram.messenger.l10.B(user)) {
                                    str = org.telegram.messenger.bd.M0(2131745911, null);
                                } else if (org.telegram.messenger.l10.z(user)) {
                                    str = org.telegram.messenger.bd.M0(2131746274, null);
                                } else {
                                    str = org.telegram.messenger.l10.x(user) ? org.telegram.messenger.bd.M0(2131749336, null) : org.telegram.messenger.l10.j(user, true);
                                    if (!org.telegram.messenger.l10.z(user) || org.telegram.messenger.l10.B(user) || user == null || (userProfilePhoto = user.photo) == null || (fileLocation3 = userProfilePhoto.photo_small) == null || fileLocation3.volume_id == 0 || fileLocation3.local_id == 0) {
                                        chat = null;
                                        fileLocation2 = null;
                                        ((TextView) viewGroupArr[i18].findViewById(i19 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2)).setText(str);
                                        if (fileLocation2 != null) {
                                            try {
                                                cxVar.getFileLoader().getClass();
                                                decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.w7.K(fileLocation2, null, true, true).toString());
                                            } catch (Throwable th3) {
                                                th = th3;
                                                z10 = 1;
                                                org.telegram.messenger.a8.g(th, z10);
                                                i3 = z10;
                                                i10 = dialog2.unread_count;
                                                int i23 = R.id.contacts_widget_item_badge_bg2;
                                                if (i10 > 0) {
                                                }
                                                i19++;
                                            }
                                        } else {
                                            decodeFile = null;
                                        }
                                        int L2 = org.telegram.messenger.g0.L(48.0f);
                                        Bitmap createBitmap2 = Bitmap.createBitmap(L2, L2, Bitmap.Config.ARGB_8888);
                                        createBitmap2.eraseColor(0);
                                        Canvas canvas2 = new Canvas(createBitmap2);
                                        if (decodeFile == null) {
                                            if (user != null) {
                                                try {
                                                    u8Var = new org.telegram.ui.Components.u8(0, user);
                                                    if (org.telegram.messenger.l10.z(user)) {
                                                        try {
                                                            u8Var.g(12);
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            z10 = 1;
                                                            org.telegram.messenger.a8.g(th, z10);
                                                            i3 = z10;
                                                            i10 = dialog2.unread_count;
                                                            int i232 = R.id.contacts_widget_item_badge_bg2;
                                                            if (i10 > 0) {
                                                            }
                                                            i19++;
                                                        }
                                                    } else if (org.telegram.messenger.l10.B(user)) {
                                                        u8Var.g(1);
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                }
                                            } else {
                                                u8Var = new org.telegram.ui.Components.u8(chat);
                                            }
                                            u8Var.setBounds(0, 0, L2, L2);
                                            u8Var.draw(canvas2);
                                        } else {
                                            try {
                                                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                                                BitmapShader bitmapShader2 = new BitmapShader(decodeFile, tileMode2, tileMode2);
                                                float width2 = L2 / decodeFile.getWidth();
                                                canvas2.save();
                                                canvas2.scale(width2, width2);
                                                this.f.setShader(bitmapShader2);
                                                try {
                                                    this.h.set(0.0f, 0.0f, decodeFile.getWidth(), decodeFile.getHeight());
                                                    canvas2.drawRoundRect(this.h, decodeFile.getWidth(), decodeFile.getHeight(), this.f);
                                                    canvas2.restore();
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    z10 = 1;
                                                    org.telegram.messenger.a8.g(th, z10);
                                                    i3 = z10;
                                                    i10 = dialog2.unread_count;
                                                    int i2322 = R.id.contacts_widget_item_badge_bg2;
                                                    if (i10 > 0) {
                                                    }
                                                    i19++;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                            }
                                        }
                                        canvas2.setBitmap(null);
                                        ((ImageView) viewGroupArr[i18].findViewById(i19 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2)).setImageBitmap(createBitmap2);
                                        i3 = 1;
                                        i10 = dialog2.unread_count;
                                        int i23222 = R.id.contacts_widget_item_badge_bg2;
                                        if (i10 > 0) {
                                            if (i10 > 99) {
                                                Object[] objArr3 = new Object[i3];
                                                objArr3[0] = 99;
                                                format = String.format("%d+", objArr3);
                                            } else {
                                                Object[] objArr4 = new Object[i3];
                                                objArr4[0] = Integer.valueOf(i10);
                                                format = String.format("%d", objArr4);
                                            }
                                            ((TextView) viewGroupArr[i18].findViewById(i19 == 0 ? R.id.contacts_widget_item_badge1 : R.id.contacts_widget_item_badge2)).setText(format);
                                            ViewGroup viewGroup3 = viewGroupArr[i18];
                                            if (i19 == 0) {
                                                i23222 = R.id.contacts_widget_item_badge_bg1;
                                            }
                                            viewGroup3.findViewById(i23222).setVisibility(0);
                                        } else {
                                            ViewGroup viewGroup4 = viewGroupArr[i18];
                                            if (i19 == 0) {
                                                i23222 = R.id.contacts_widget_item_badge_bg1;
                                            }
                                            viewGroup4.findViewById(i23222).setVisibility(8);
                                        }
                                    } else {
                                        fileLocation2 = fileLocation3;
                                        chat = null;
                                        ((TextView) viewGroupArr[i18].findViewById(i19 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2)).setText(str);
                                        if (fileLocation2 != null) {
                                        }
                                        int L22 = org.telegram.messenger.g0.L(48.0f);
                                        Bitmap createBitmap22 = Bitmap.createBitmap(L22, L22, Bitmap.Config.ARGB_8888);
                                        createBitmap22.eraseColor(0);
                                        Canvas canvas22 = new Canvas(createBitmap22);
                                        if (decodeFile == null) {
                                        }
                                        canvas22.setBitmap(null);
                                        ((ImageView) viewGroupArr[i18].findViewById(i19 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2)).setImageBitmap(createBitmap22);
                                        i3 = 1;
                                        i10 = dialog2.unread_count;
                                        int i232222 = R.id.contacts_widget_item_badge_bg2;
                                        if (i10 > 0) {
                                        }
                                    }
                                }
                                if (org.telegram.messenger.l10.z(user)) {
                                }
                                chat = null;
                                fileLocation2 = null;
                                ((TextView) viewGroupArr[i18].findViewById(i19 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2)).setText(str);
                                if (fileLocation2 != null) {
                                }
                                int L222 = org.telegram.messenger.g0.L(48.0f);
                                Bitmap createBitmap222 = Bitmap.createBitmap(L222, L222, Bitmap.Config.ARGB_8888);
                                createBitmap222.eraseColor(0);
                                Canvas canvas222 = new Canvas(createBitmap222);
                                if (decodeFile == null) {
                                }
                                canvas222.setBitmap(null);
                                ((ImageView) viewGroupArr[i18].findViewById(i19 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2)).setImageBitmap(createBitmap222);
                                i3 = 1;
                                i10 = dialog2.unread_count;
                                int i2322222 = R.id.contacts_widget_item_badge_bg2;
                                if (i10 > 0) {
                                }
                            } else {
                                TLRPC.Chat M05 = cxVar.getMessagesController().M0(Long.valueOf(-dialog2.id));
                                str = M05.title;
                                TLRPC.ChatPhoto chatPhoto2 = M05.photo;
                                if (chatPhoto2 == null || (fileLocation = chatPhoto2.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
                                    chat = M05;
                                    user = null;
                                    fileLocation2 = null;
                                    ((TextView) viewGroupArr[i18].findViewById(i19 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2)).setText(str);
                                    if (fileLocation2 != null) {
                                    }
                                    int L2222 = org.telegram.messenger.g0.L(48.0f);
                                    Bitmap createBitmap2222 = Bitmap.createBitmap(L2222, L2222, Bitmap.Config.ARGB_8888);
                                    createBitmap2222.eraseColor(0);
                                    Canvas canvas2222 = new Canvas(createBitmap2222);
                                    if (decodeFile == null) {
                                    }
                                    canvas2222.setBitmap(null);
                                    ((ImageView) viewGroupArr[i18].findViewById(i19 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2)).setImageBitmap(createBitmap2222);
                                    i3 = 1;
                                    i10 = dialog2.unread_count;
                                    int i23222222 = R.id.contacts_widget_item_badge_bg2;
                                    if (i10 > 0) {
                                    }
                                } else {
                                    fileLocation2 = fileLocation;
                                    chat = M05;
                                    user = null;
                                    ((TextView) viewGroupArr[i18].findViewById(i19 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2)).setText(str);
                                    if (fileLocation2 != null) {
                                    }
                                    int L22222 = org.telegram.messenger.g0.L(48.0f);
                                    Bitmap createBitmap22222 = Bitmap.createBitmap(L22222, L22222, Bitmap.Config.ARGB_8888);
                                    createBitmap22222.eraseColor(0);
                                    Canvas canvas22222 = new Canvas(createBitmap22222);
                                    if (decodeFile == null) {
                                    }
                                    canvas22222.setBitmap(null);
                                    ((ImageView) viewGroupArr[i18].findViewById(i19 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2)).setImageBitmap(createBitmap22222);
                                    i3 = 1;
                                    i10 = dialog2.unread_count;
                                    int i232222222 = R.id.contacts_widget_item_badge_bg2;
                                    if (i10 > 0) {
                                    }
                                }
                            }
                        }
                        i19++;
                    }
                    i18++;
                }
            }
        }
        if (viewGroupArr[0].getVisibility() == 0) {
            cxVar.d.setVisibility(8);
        } else {
            cxVar.d.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.h9 h9Var = this.a;
        if (h9Var != null) {
            h9Var.dispose();
            this.a = null;
        }
        org.telegram.ui.Components.h9 h9Var2 = this.b;
        if (h9Var2 != null) {
            h9Var2.dispose();
            this.b = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.Components.h9 h9Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        Drawable t02 = org.telegram.ui.ActionBar.k6.t0();
        if (t02 != this.c && t02 != null) {
            if (org.telegram.ui.ActionBar.k6.h1()) {
                this.d = this.c;
                this.b = this.a;
            } else {
                org.telegram.ui.Components.h9 h9Var2 = this.a;
                if (h9Var2 != null) {
                    h9Var2.dispose();
                    this.a = null;
                }
            }
            this.c = t02;
        }
        cx cxVar = this.r;
        q4Var = ((org.telegram.ui.ActionBar.d2) cxVar).parentLayout;
        float themeAnimationValue = q4Var.getThemeAnimationValue();
        int i3 = 0;
        while (i3 < 2) {
            Drawable drawable = i3 == 0 ? this.d : this.c;
            if (drawable != null) {
                if (i3 == 1 && this.d != null) {
                    q4Var2 = ((org.telegram.ui.ActionBar.d2) cxVar).parentLayout;
                    if (q4Var2 != null) {
                        drawable.setAlpha((int) (255.0f * themeAnimationValue));
                        if (!(drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof org.telegram.ui.Components.la0)) {
                            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            if (drawable instanceof org.telegram.ui.Components.j9) {
                                drawable.draw(canvas);
                            } else {
                                this.a = ((org.telegram.ui.Components.j9) drawable).c(canvas, this);
                            }
                        } else if (drawable instanceof BitmapDrawable) {
                            if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                canvas.save();
                                float f10 = 2.0f / org.telegram.messenger.g0.p;
                                canvas.scale(f10, f10);
                                drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                            } else {
                                int measuredHeight = getMeasuredHeight();
                                float max = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight / drawable.getIntrinsicHeight());
                                int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max);
                                int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max);
                                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                                int i10 = (measuredHeight - ceil2) / 2;
                                canvas.save();
                                canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                                drawable.setBounds(measuredWidth, i10, ceil + measuredWidth, ceil2 + i10);
                            }
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                        if (i3 == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                            h9Var = this.b;
                            if (h9Var != null) {
                                h9Var.dispose();
                                this.b = null;
                            }
                            this.d = null;
                            invalidate();
                        }
                    }
                }
                drawable.setAlpha(org.telegram.messenger.hs.e4);
                if (drawable instanceof ColorDrawable) {
                }
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                if (drawable instanceof org.telegram.ui.Components.j9) {
                }
                if (i3 == 0) {
                    h9Var = this.b;
                    if (h9Var != null) {
                    }
                    this.d = null;
                    invalidate();
                }
            }
            i3++;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable2 = this.e;
        drawable2.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable2.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(264.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z10) {
    }
}
