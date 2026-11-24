// default package

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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jv3 extends FrameLayout {
    public ve0 a;
    public ve0 b;
    public Drawable c;
    public Drawable d;
    public final Drawable e;
    public Paint f;
    public RectF h;
    public final ViewGroup[] n;
    public final /* synthetic */ kv3 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv3(kv3 kv3Var, Context context) {
        super(context);
        this.r = kv3Var;
        this.f = new Paint(1);
        this.h = new RectF();
        this.n = new ViewGroup[2];
        int i = 0;
        setWillNotDraw(false);
        setPadding(0, gm.L(24.0f), 0, gm.L(24.0f));
        LinearLayout i2 = hg9.i(context, 1);
        addView(i2, qoe.e(-2, -2, 17));
        cm1 cm1Var = new cm1(context);
        cm1Var.setCustomText(jb6.M0(2131742532, null));
        i2.addView(cm1Var, qoe.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.widget_bg);
        i2.addView(linearLayout, qoe.t(-2, -2, 17, 10, 0, 10, 0));
        kv3Var.d = new ImageView(context);
        int i3 = kv3Var.x;
        if (i3 == 0) {
            while (i < 2) {
                this.n[i] = (ViewGroup) kv3Var.getParentActivity().getLayoutInflater().inflate(R.layout.shortcut_widget_item, (ViewGroup) null);
                linearLayout.addView(this.n[i], qoe.o(-1, -2));
                i++;
            }
            linearLayout.addView(kv3Var.d, qoe.r(nm7.u3, nm7.p2, 17));
            kv3Var.d.setImageResource(R.drawable.chats_widget_preview);
        } else if (i3 == 1) {
            while (i < 2) {
                this.n[i] = (ViewGroup) kv3Var.getParentActivity().getLayoutInflater().inflate(R.layout.contacts_widget_item, (ViewGroup) null);
                linearLayout.addView(this.n[i], qoe.o(nm7.p2, -2));
                i++;
            }
            linearLayout.addView(kv3Var.d, qoe.r(nm7.p2, nm7.p2, 17));
            kv3Var.d.setImageResource(R.drawable.contacts_widget_preview);
        }
        a();
        this.e = cmb.W0(context, R.drawable.greydivider_bottom, cmb.a7);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:118|(1:120)(2:129|(1:131)(9:132|(1:134)(1:136)|135|122|123|124|125|99|100))|121|122|123|124|125|99|100) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03b9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03ba, code lost:
    
        fc4.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0263, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) == false) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x018e A[Catch: all -> 0x01f0, TryCatch #0 {all -> 0x01f0, blocks: (B:212:0x013c, B:38:0x0151, B:41:0x0167, B:43:0x0172, B:44:0x0187, B:45:0x01dd, B:200:0x0178, B:202:0x017e, B:203:0x0182, B:204:0x018e, B:206:0x0199, B:207:0x01a7), top: B:211:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05b8  */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v25, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v23, types: [org.telegram.tgnet.TLRPC$FileLocation] */
    /* JADX WARN: Type inference failed for: r7v49, types: [pc0] */
    /* JADX WARN: Type inference failed for: r7v56, types: [org.telegram.tgnet.TLRPC$FileLocation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        ViewGroup[] viewGroupArr;
        TLRPC.Dialog dialog;
        int i;
        TLRPC.Chat L0;
        String str;
        TLRPC.FileLocation fileLocation;
        TLRPC.User user;
        Bitmap decodeFile;
        int i2;
        String format;
        pc0 pc0Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.FileLocation fileLocation2;
        ViewGroup[] viewGroupArr2;
        TLRPC.Dialog dialog2;
        TLRPC.Chat chat;
        TLRPC.User user2;
        TLRPC.Chat chat2;
        String str2;
        ?? r7;
        Bitmap decodeFile2;
        k47 k47Var;
        TLRPC.Chat L02;
        TLRPC.User user3;
        String str3;
        SpannableStringBuilder valueOf;
        String i3;
        char c;
        ?? r13;
        String str4;
        String str5;
        pc0 pc0Var2;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        ?? r72;
        kv3 kv3Var = this.r;
        ArrayList arrayList = kv3Var.e;
        int i4 = kv3Var.x;
        int i5 = 2131745999;
        int i6 = 2131745635;
        int i7 = 8;
        int i8 = 2;
        ?? r15 = 1;
        ViewGroup[] viewGroupArr3 = this.n;
        int i9 = 0;
        ?? r12 = 0;
        if (i4 == 0) {
            int i10 = 0;
            while (i10 < i8) {
                if (arrayList.isEmpty()) {
                    dialog2 = i10 < kv3Var.getMessagesController().F.size() ? (TLRPC.Dialog) kv3Var.getMessagesController().F.get(i10) : r12;
                    viewGroupArr2 = viewGroupArr3;
                } else if (i10 < arrayList.size()) {
                    viewGroupArr2 = viewGroupArr3;
                    TLRPC.Dialog dialog3 = (TLRPC.Dialog) kv3Var.getMessagesController().R.f(((Long) arrayList.get(i10)).longValue());
                    if (dialog3 == null) {
                        dialog3 = new TLRPC.TL_dialog();
                        dialog3.id = ((Long) arrayList.get(i10)).longValue();
                    }
                    dialog2 = dialog3;
                } else {
                    viewGroupArr2 = viewGroupArr3;
                    dialog2 = r12;
                }
                if (dialog2 == null) {
                    viewGroupArr2[i10].setVisibility(i7);
                } else {
                    viewGroupArr2[i10].setVisibility(i9);
                    if (pg3.D(dialog2.id)) {
                        user2 = kv3Var.getMessagesController().W1(Long.valueOf(dialog2.id));
                        if (user2 != null) {
                            String M0 = m9c.D(user2) ? jb6.M0(i6, r12) : m9c.B(user2) ? jb6.M0(i5, r12) : m9c.z(user2) ? jb6.M0(2131749085, r12) : bw2.m(i9, user2.first_name, user2.last_name);
                            if (m9c.B(user2) || m9c.D(user2) || (userProfilePhoto2 = user2.photo) == null || (r72 = userProfilePhoto2.photo_small) == 0 || r72.volume_id == 0 || r72.local_id == 0) {
                                str2 = M0;
                                chat = r12;
                                chat2 = chat;
                            } else {
                                chat2 = r72;
                                str2 = M0;
                                chat = r12;
                            }
                            ((TextView) viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_text)).setText(str2);
                            if (chat2 == null) {
                                try {
                                    kv3Var.getFileLoader().getClass();
                                    decodeFile2 = BitmapFactory.decodeFile(bc4.J(chat2, r12, r15, r15).toString());
                                } catch (Throwable th) {
                                    fc4.g(th, r15);
                                }
                            } else {
                                decodeFile2 = r12;
                            }
                            int L = gm.L(48.0f);
                            Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                            createBitmap.eraseColor(i9);
                            Canvas canvas = new Canvas(createBitmap);
                            if (decodeFile2 != null) {
                                if (user2 != null) {
                                    ?? pc0Var3 = new pc0(i9, user2);
                                    if (m9c.B(user2)) {
                                        pc0Var3.f(12);
                                        pc0Var2 = pc0Var3;
                                    } else {
                                        pc0Var2 = pc0Var3;
                                        if (m9c.D(user2)) {
                                            pc0Var3.f(r15);
                                            pc0Var2 = pc0Var3;
                                        }
                                    }
                                } else {
                                    pc0Var2 = new pc0(chat);
                                }
                                pc0Var2.setBounds(i9, i9, L, L);
                                pc0Var2.draw(canvas);
                            } else {
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                BitmapShader bitmapShader = new BitmapShader(decodeFile2, tileMode, tileMode);
                                if (this.f == null) {
                                    this.f = new Paint((int) r15);
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
                            canvas.setBitmap(null);
                            ((ImageView) viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_avatar)).setImageBitmap(createBitmap);
                            ArrayList arrayList2 = (ArrayList) kv3Var.getMessagesController().S.f(dialog2.id);
                            k47Var = (arrayList2 != null || arrayList2.size() <= 0) ? null : (k47) arrayList2.get(0);
                            if (k47Var == null) {
                                long Z0 = k47Var.Z0();
                                if (Z0 > 0) {
                                    user3 = kv3Var.getMessagesController().W1(Long.valueOf(Z0));
                                    L02 = null;
                                } else {
                                    L02 = kv3Var.getMessagesController().L0(Long.valueOf(-Z0));
                                    user3 = null;
                                }
                                int color = getContext().getResources().getColor(R.color.widget_text);
                                if (k47Var.k instanceof TLRPC.TL_messageService) {
                                    if (sd2.T(chat)) {
                                        TLRPC.MessageAction messageAction = k47Var.k.action;
                                        str5 = "";
                                        if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                                            str5 = "";
                                        }
                                        color = getContext().getResources().getColor(R.color.widget_action_text);
                                        str4 = str5;
                                    }
                                    str5 = k47Var.v;
                                    color = getContext().getResources().getColor(R.color.widget_action_text);
                                    str4 = str5;
                                } else if (chat == null || chat.id <= 0 || L02 != null || (sd2.T(chat) && !sd2.n0(chat))) {
                                    TLRPC.Message message = k47Var.k;
                                    TLRPC.MessageMedia messageMedia = message.media;
                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                        str4 = jb6.M0(2131753912, null);
                                    } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (messageMedia.document instanceof TLRPC.TL_documentEmpty) && messageMedia.ttl_seconds != 0) {
                                        str4 = jb6.M0(2131753897, null);
                                    } else if (k47Var.z != null) {
                                        str4 = (k47.K4(message) ? "📹 " : k47.Q4(k47Var.k) ? "🎤 " : k47Var.I3() ? "🎧 " : k47.R3(k47Var.k) ? "🖼 " : "📎 ") + ((Object) k47Var.z);
                                    } else {
                                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                            str3 = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                            str3 = "🎮 " + k47Var.k.media.game.title;
                                        } else if (k47Var.D == 14) {
                                            str3 = td4.r("🎧 ", k47Var.w1(true), " - ", k47Var.y1(true));
                                        } else {
                                            ?? r0 = k47Var.v;
                                            gm.v1(r0, k47Var.a2, null);
                                            str3 = r0;
                                        }
                                        String str6 = str3;
                                        str4 = str6;
                                        if (k47Var.k.media != null) {
                                            str4 = str6;
                                            if (!k47Var.F3()) {
                                                color = getContext().getResources().getColor(R.color.widget_action_text);
                                                str4 = str6;
                                            }
                                        }
                                    }
                                } else {
                                    String M02 = k47Var.O3() ? jb6.M0(2131750436, null) : user3 != null ? m9c.k(user3, r15).replace("\n", "") : "DELETED";
                                    CharSequence charSequence = k47Var.z;
                                    boolean z = r15;
                                    try {
                                        if (charSequence != null) {
                                            String charSequence2 = charSequence.toString();
                                            if (charSequence2.length() > 150) {
                                                charSequence2 = charSequence2.substring(0, nm7.f2);
                                            }
                                            Object[] objArr = new Object[2];
                                            objArr[0] = (k47.K4(k47Var.k) ? "📹 " : k47.Q4(k47Var.k) ? "🎤 " : k47Var.I3() ? "🎧 " : k47.R3(k47Var.k) ? "🖼 " : "📎 ") + charSequence2.replace('\n', ' ');
                                            objArr[z ? 1 : 0] = M02;
                                            valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr));
                                        } else if (k47Var.k.media == null || k47Var.F3()) {
                                            String str7 = k47Var.k.message;
                                            if (str7 != null) {
                                                if (str7.length() > 150) {
                                                    str7 = str7.substring(0, nm7.f2);
                                                }
                                                valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", str7.replace('\n', ' ').trim(), M02));
                                            } else {
                                                valueOf = SpannableStringBuilder.valueOf("");
                                            }
                                        } else {
                                            color = getContext().getResources().getColor(R.color.widget_action_text);
                                            TLRPC.MessageMedia messageMedia2 = k47Var.k.media;
                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                i3 = kt6.o("📊 \u2068", ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.question.text, "\u2069");
                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                i3 = kt6.o("🎮 \u2068", messageMedia2.game.title, "\u2069");
                                            } else {
                                                i3 = k47Var.D == 14 ? b10.i("🎧 \u2068", k47Var.w1(z), " - ", k47Var.y1(z), "\u2069") : k47Var.v.toString();
                                                c = ' ';
                                                Object[] objArr2 = new Object[2];
                                                objArr2[0] = i3.replace('\n', c);
                                                objArr2[z ? 1 : 0] = M02;
                                                SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr2));
                                                valueOf2.setSpan(new do4(cmb.n9, null), M02.length() + 2, valueOf2.length(), 33);
                                                r13 = valueOf2;
                                                r13.setSpan(new do4(cmb.j9, null), 0, M02.length() + 1, 33);
                                                str4 = r13;
                                            }
                                            c = ' ';
                                            Object[] objArr22 = new Object[2];
                                            objArr22[0] = i3.replace('\n', c);
                                            objArr22[z ? 1 : 0] = M02;
                                            SpannableStringBuilder valueOf22 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr22));
                                            valueOf22.setSpan(new do4(cmb.n9, null), M02.length() + 2, valueOf22.length(), 33);
                                            r13 = valueOf22;
                                            r13.setSpan(new do4(cmb.j9, null), 0, M02.length() + 1, 33);
                                            str4 = r13;
                                        }
                                        r13.setSpan(new do4(cmb.j9, null), 0, M02.length() + 1, 33);
                                        str4 = r13;
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                        str4 = r13;
                                    }
                                    r13 = valueOf;
                                }
                                ((TextView) viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_time)).setText(jb6.e1(k47Var.k.date));
                                ((TextView) viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_message)).setText(str4.toString());
                                ((TextView) viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_message)).setTextColor(color);
                            } else {
                                if (dialog2.last_message_date != 0) {
                                    ((TextView) viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_time)).setText(jb6.e1(dialog2.last_message_date));
                                } else {
                                    ((TextView) viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_time)).setText("");
                                }
                                ((TextView) viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_message)).setText("");
                            }
                            if (dialog2.unread_count <= 0) {
                                ((TextView) viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_badge)).setText(String.format("%d", Integer.valueOf(dialog2.unread_count)));
                                viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_badge).setVisibility(0);
                                if (kv3Var.getMessagesController().o2(dialog2.id, 0L, null)) {
                                    viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_badge).setBackgroundResource(R.drawable.widget_counter_muted);
                                } else {
                                    viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_badge).setBackgroundResource(R.drawable.widget_counter);
                                }
                            } else {
                                viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_badge).setVisibility(8);
                            }
                        } else {
                            chat = r12;
                            chat2 = chat;
                            str2 = "";
                            ((TextView) viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_text)).setText(str2);
                            if (chat2 == null) {
                            }
                            int L2 = gm.L(48.0f);
                            Bitmap createBitmap2 = Bitmap.createBitmap(L2, L2, Bitmap.Config.ARGB_8888);
                            createBitmap2.eraseColor(i9);
                            Canvas canvas2 = new Canvas(createBitmap2);
                            if (decodeFile2 != null) {
                            }
                            canvas2.setBitmap(null);
                            ((ImageView) viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_avatar)).setImageBitmap(createBitmap2);
                            ArrayList arrayList22 = (ArrayList) kv3Var.getMessagesController().S.f(dialog2.id);
                            if (arrayList22 != null) {
                            }
                            if (k47Var == null) {
                            }
                            if (dialog2.unread_count <= 0) {
                            }
                        }
                    } else {
                        TLRPC.Chat L03 = kv3Var.getMessagesController().L0(Long.valueOf(-dialog2.id));
                        if (L03 != null) {
                            String str8 = L03.title;
                            TLRPC.ChatPhoto chatPhoto = L03.photo;
                            if (chatPhoto == null || (r7 = chatPhoto.photo_small) == 0 || r7.volume_id == 0 || r7.local_id == 0) {
                                str2 = str8;
                                chat2 = r12;
                                chat = L03;
                                user2 = chat2;
                            } else {
                                chat2 = r7;
                                str2 = str8;
                                chat = L03;
                                user2 = r12;
                            }
                            ((TextView) viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_text)).setText(str2);
                            if (chat2 == null) {
                            }
                            int L22 = gm.L(48.0f);
                            Bitmap createBitmap22 = Bitmap.createBitmap(L22, L22, Bitmap.Config.ARGB_8888);
                            createBitmap22.eraseColor(i9);
                            Canvas canvas22 = new Canvas(createBitmap22);
                            if (decodeFile2 != null) {
                            }
                            canvas22.setBitmap(null);
                            ((ImageView) viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_avatar)).setImageBitmap(createBitmap22);
                            ArrayList arrayList222 = (ArrayList) kv3Var.getMessagesController().S.f(dialog2.id);
                            if (arrayList222 != null) {
                            }
                            if (k47Var == null) {
                            }
                            if (dialog2.unread_count <= 0) {
                            }
                        } else {
                            chat = L03;
                            user2 = r12;
                            chat2 = user2;
                            str2 = "";
                            ((TextView) viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_text)).setText(str2);
                            if (chat2 == null) {
                            }
                            int L222 = gm.L(48.0f);
                            Bitmap createBitmap222 = Bitmap.createBitmap(L222, L222, Bitmap.Config.ARGB_8888);
                            createBitmap222.eraseColor(i9);
                            Canvas canvas222 = new Canvas(createBitmap222);
                            if (decodeFile2 != null) {
                            }
                            canvas222.setBitmap(null);
                            ((ImageView) viewGroupArr2[i10].findViewById(R.id.shortcut_widget_item_avatar)).setImageBitmap(createBitmap222);
                            ArrayList arrayList2222 = (ArrayList) kv3Var.getMessagesController().S.f(dialog2.id);
                            if (arrayList2222 != null) {
                            }
                            if (k47Var == null) {
                            }
                            if (dialog2.unread_count <= 0) {
                            }
                        }
                    }
                }
                i10++;
                viewGroupArr3 = viewGroupArr2;
                i5 = 2131745999;
                i6 = 2131745635;
                i9 = 0;
                r12 = 0;
                i7 = 8;
                i8 = 2;
                r15 = 1;
            }
            viewGroupArr = viewGroupArr3;
            viewGroupArr[i9].findViewById(R.id.shortcut_widget_item_divider).setVisibility(viewGroupArr[1].getVisibility());
            viewGroupArr[1].findViewById(R.id.shortcut_widget_item_divider).setVisibility(8);
        } else {
            viewGroupArr = viewGroupArr3;
            if (i4 == 1) {
                int i11 = 0;
                while (true) {
                    if (i11 >= 2) {
                        break;
                    }
                    int i12 = 0;
                    for (int i13 = 2; i12 < i13; i13 = 2) {
                        int i14 = (i11 << 1) + i12;
                        if (arrayList.isEmpty()) {
                            if (i14 < kv3Var.getMediaDataController().j1.size()) {
                                long j = ((TLRPC.TL_topPeer) kv3Var.getMediaDataController().j1.get(i14)).peer.user_id;
                                TLRPC.Dialog dialog4 = (TLRPC.Dialog) kv3Var.getMessagesController().R.f(j);
                                if (dialog4 == null) {
                                    dialog4 = new TLRPC.TL_dialog();
                                    dialog4.id = j;
                                }
                                dialog = dialog4;
                            }
                            dialog = null;
                        } else {
                            if (i14 < arrayList.size()) {
                                dialog = (TLRPC.Dialog) kv3Var.getMessagesController().R.f(((Long) arrayList.get(i14)).longValue());
                                if (dialog == null) {
                                    dialog = new TLRPC.TL_dialog();
                                    dialog.id = ((Long) arrayList.get(i14)).longValue();
                                }
                            }
                            dialog = null;
                        }
                        int i15 = R.id.contacts_widget_item2;
                        if (dialog == null) {
                            ViewGroup viewGroup = viewGroupArr[i11];
                            if (i12 == 0) {
                                i15 = R.id.contacts_widget_item1;
                            }
                            viewGroup.findViewById(i15).setVisibility(4);
                            if (i14 == 0 || i14 == 2) {
                                viewGroupArr[i11].setVisibility(8);
                            }
                            i = i11;
                        } else {
                            ViewGroup viewGroup2 = viewGroupArr[i11];
                            if (i12 == 0) {
                                i15 = R.id.contacts_widget_item1;
                            }
                            viewGroup2.findViewById(i15).setVisibility(0);
                            if (i14 == 0 || i14 == 2) {
                                viewGroupArr[i11].setVisibility(0);
                            }
                            if (pg3.D(dialog.id)) {
                                TLRPC.User W1 = kv3Var.getMessagesController().W1(Long.valueOf(dialog.id));
                                str = m9c.D(W1) ? jb6.M0(2131745635, null) : m9c.B(W1) ? jb6.M0(2131745999, null) : m9c.z(W1) ? jb6.M0(2131749085, null) : m9c.k(W1, true);
                                if (m9c.B(W1) || m9c.D(W1) || W1 == null || (userProfilePhoto = W1.photo) == null || (fileLocation2 = userProfilePhoto.photo_small) == null) {
                                    i = i11;
                                } else {
                                    i = i11;
                                    if (fileLocation2.volume_id != 0 && fileLocation2.local_id != 0) {
                                        user = W1;
                                        fileLocation = fileLocation2;
                                        L0 = null;
                                    }
                                }
                                user = W1;
                                L0 = null;
                                fileLocation = null;
                            } else {
                                i = i11;
                                L0 = kv3Var.getMessagesController().L0(Long.valueOf(-dialog.id));
                                str = L0.title;
                                TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                if (chatPhoto2 == null || (fileLocation = chatPhoto2.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
                                    fileLocation = null;
                                }
                                user = null;
                            }
                            ((TextView) viewGroupArr[i].findViewById(i12 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2)).setText(str);
                            if (fileLocation != null) {
                                try {
                                    kv3Var.getFileLoader().getClass();
                                    decodeFile = BitmapFactory.decodeFile(bc4.J(fileLocation, null, true, true).toString());
                                } catch (Throwable th2) {
                                    i2 = 1;
                                    fc4.g(th2, true);
                                }
                            } else {
                                decodeFile = null;
                            }
                            int L3 = gm.L(48.0f);
                            Bitmap createBitmap3 = Bitmap.createBitmap(L3, L3, Bitmap.Config.ARGB_8888);
                            createBitmap3.eraseColor(0);
                            Canvas canvas3 = new Canvas(createBitmap3);
                            if (decodeFile == null) {
                                if (user != null) {
                                    pc0Var = new pc0(0, user);
                                    if (m9c.B(user)) {
                                        pc0Var.f(12);
                                    } else if (m9c.D(user)) {
                                        pc0Var.f(1);
                                    }
                                } else {
                                    pc0Var = new pc0(L0);
                                }
                                pc0Var.setBounds(0, 0, L3, L3);
                                pc0Var.draw(canvas3);
                            } else {
                                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                                BitmapShader bitmapShader2 = new BitmapShader(decodeFile, tileMode2, tileMode2);
                                float width2 = L3 / decodeFile.getWidth();
                                canvas3.save();
                                canvas3.scale(width2, width2);
                                this.f.setShader(bitmapShader2);
                                this.h.set(0.0f, 0.0f, decodeFile.getWidth(), decodeFile.getHeight());
                                canvas3.drawRoundRect(this.h, decodeFile.getWidth(), decodeFile.getHeight(), this.f);
                                canvas3.restore();
                            }
                            canvas3.setBitmap(null);
                            ((ImageView) viewGroupArr[i].findViewById(i12 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2)).setImageBitmap(createBitmap3);
                            i2 = 1;
                            int i16 = dialog.unread_count;
                            int i17 = R.id.contacts_widget_item_badge_bg2;
                            if (i16 > 0) {
                                if (i16 > 99) {
                                    Object[] objArr3 = new Object[i2];
                                    objArr3[0] = 99;
                                    format = String.format("%d+", objArr3);
                                } else {
                                    Object[] objArr4 = new Object[i2];
                                    objArr4[0] = Integer.valueOf(i16);
                                    format = String.format("%d", objArr4);
                                }
                                ((TextView) viewGroupArr[i].findViewById(i12 == 0 ? R.id.contacts_widget_item_badge1 : R.id.contacts_widget_item_badge2)).setText(format);
                                ViewGroup viewGroup3 = viewGroupArr[i];
                                if (i12 == 0) {
                                    i17 = R.id.contacts_widget_item_badge_bg1;
                                }
                                viewGroup3.findViewById(i17).setVisibility(0);
                            } else {
                                ViewGroup viewGroup4 = viewGroupArr[i];
                                if (i12 == 0) {
                                    i17 = R.id.contacts_widget_item_badge_bg1;
                                }
                                viewGroup4.findViewById(i17).setVisibility(8);
                            }
                        }
                        i12++;
                        i11 = i;
                    }
                    i11++;
                }
            }
        }
        int visibility = viewGroupArr[0].getVisibility();
        ImageView imageView = kv3Var.d;
        if (visibility == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ve0 ve0Var = this.a;
        if (ve0Var != null) {
            ve0Var.dispose();
            this.a = null;
        }
        ve0 ve0Var2 = this.b;
        if (ve0Var2 != null) {
            ve0Var2.dispose();
            this.b = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0101  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        tk5 tk5Var;
        ve0 ve0Var;
        tk5 tk5Var2;
        Drawable s0 = cmb.s0();
        if (s0 != this.c && s0 != null) {
            if (cmb.f1()) {
                this.d = this.c;
                this.b = this.a;
            } else {
                ve0 ve0Var2 = this.a;
                if (ve0Var2 != null) {
                    ve0Var2.dispose();
                    this.a = null;
                }
            }
            this.c = s0;
        }
        kv3 kv3Var = this.r;
        tk5Var = ((d) kv3Var).parentLayout;
        float themeAnimationValue = tk5Var.getThemeAnimationValue();
        int i = 0;
        while (i < 2) {
            Drawable drawable = i == 0 ? this.d : this.c;
            if (drawable != null) {
                if (i == 1 && this.d != null) {
                    tk5Var2 = ((d) kv3Var).parentLayout;
                    if (tk5Var2 != null) {
                        drawable.setAlpha((int) (255.0f * themeAnimationValue));
                        if (!(drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof ah7)) {
                            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            if (drawable instanceof we0) {
                                drawable.draw(canvas);
                            } else {
                                this.a = ((we0) drawable).b(canvas, this);
                            }
                        } else if (drawable instanceof BitmapDrawable) {
                            if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                canvas.save();
                                float f = 2.0f / gm.p;
                                canvas.scale(f, f);
                                drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                            } else {
                                int measuredHeight = getMeasuredHeight();
                                float max = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight / drawable.getIntrinsicHeight());
                                int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max);
                                int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max);
                                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                                int i2 = (measuredHeight - ceil2) / 2;
                                canvas.save();
                                canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                                drawable.setBounds(measuredWidth, i2, ceil + measuredWidth, ceil2 + i2);
                            }
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                        if (i == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                            ve0Var = this.b;
                            if (ve0Var != null) {
                                ve0Var.dispose();
                                this.b = null;
                            }
                            this.d = null;
                            invalidate();
                        }
                    }
                }
                drawable.setAlpha(nm7.d4);
                if (drawable instanceof ColorDrawable) {
                }
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                if (drawable instanceof we0) {
                }
                if (i == 0) {
                    ve0Var = this.b;
                    if (ve0Var != null) {
                    }
                    this.d = null;
                    invalidate();
                }
            }
            i++;
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
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(264.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z) {
    }
}
