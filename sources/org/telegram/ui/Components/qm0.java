package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class qm0 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final i5 E;
    public final i5 F;
    public final i5 G;
    public final i5 H;
    public final i5 I;
    public final f6 J;
    public final f6 K;
    public final f6 L;
    public final f6 M;
    public final f6 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public pm0[] W;
    public float X;
    public boolean Y;
    public ba0 h;
    public boolean i;
    public boolean j;
    public Bitmap k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean s;
    public p5 t;
    public p5 u;
    public long v;
    public long w;
    public int x;
    public int y;
    public int z;
    public final RectF a = new RectF();
    public final Paint b = new Paint(1);
    public final Paint c = new Paint(3);
    public final Matrix d = new Matrix();
    public final float[] e = new float[8];
    public final Path f = new Path();
    public final Paint g = new Paint();
    public int q = 0;
    public float r = 1.0f;

    public qm0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new ai.n6(this, 9));
        }
        bs bsVar = bs.h;
        this.E = new i5(view, 400L, bsVar, 0);
        this.F = new i5(view, 400L, bsVar, 0);
        this.G = new i5(view, 400L, bsVar, 0);
        this.H = new i5(view, 400L, bsVar, 0);
        this.I = new i5(view, 400L, bsVar, 0);
        this.J = new f6(view, 0L, 400L, bsVar);
        this.K = new f6(view, 0L, 400L, bsVar);
        this.L = new f6(view, 0L, 440L, bsVar);
        this.M = new f6(view, 0L, 320L, bsVar);
        this.N = new f6(view, 0L, 320L, bsVar);
    }

    public final int a(MessageObject messageObject, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        i5 i5Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        MessageObject messageObject2;
        TLRPC.Message message2;
        int colorId;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer;
        int colorId2;
        TLRPC.PeerColor peerColor;
        TLRPC.Message message3;
        TLRPC.PeerColor peerColor2;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        boolean z10;
        View view;
        TLRPC.Message message4;
        int i11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User user2 = user;
        boolean a2 = d6Var != null ? d6Var.a() : org.telegram.ui.ActionBar.h6.I.q();
        if (messageObject != null && !messageObject.isOutOwner() && i10 != 2 && (tL_peerColorCollectible = messageObject.overrideLinkPeerColor) != null) {
            return l(messageObject, tL_peerColorCollectible, d6Var);
        }
        this.R = false;
        this.v = 0L;
        this.w = 0L;
        this.s = messageObject != null && messageObject.isSponsored();
        i5 i5Var2 = this.I;
        if (messageObject == null) {
            this.j = false;
            this.i = false;
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Uc, d6Var);
            this.B = w02;
            this.A = w02;
            this.z = w02;
            this.x = org.telegram.ui.ActionBar.h6.m1(a2 ? 0.12f : 0.1f, w02);
            this.C = h();
            int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Wc, d6Var);
            this.y = w03;
            return i5Var2.a(w03, false);
        }
        if (i10 != 4 || (message4 = messageObject.messageOwner) == null || MessageObject.getMedia(message4) == null || !(MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaContact)) {
            i5Var = i5Var2;
            if (i10 != 0 && (messageObject.overrideLinkColor >= 0 || (messageObject.messageOwner != null && (((messageObject.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId())) && user2 != null) || ((messageObject.isFromChannel() && chat != null) || (((message3 = messageObject.messageOwner) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (messageObject.isSponsored() && (peerColor2 = messageObject.sponsoredColor) != null && peerColor2.color != -1))))))) {
                int i12 = messageObject.overrideLinkColor;
                if (i12 < 0) {
                    if (!messageObject.isSponsored() || (peerColor = messageObject.sponsoredColor) == null || (colorId2 = peerColor.color) == -1) {
                        TLRPC.Message message5 = messageObject.messageOwner;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long peerDialogId = DialogObject.getPeerDialogId(peer);
                            if (peerDialogId < 0) {
                                TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                                if (!messageObject.isOutOwner() && i10 != 2 && chat2 != null) {
                                    TLRPC.PeerColor peerColor3 = chat2.color;
                                    if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor3, d6Var);
                                    }
                                }
                                colorId2 = chat2 != null ? ChatObject.getColorId(chat2) : 5;
                                if (i10 == 3) {
                                    this.v = ChatObject.getEmojiId(chat2);
                                }
                            } else {
                                TLRPC.User user3 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(peerDialogId));
                                if (!messageObject.isOutOwner() && i10 != 2 && user3 != null) {
                                    TLRPC.PeerColor peerColor4 = user3.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor4, d6Var);
                                    }
                                }
                                colorId2 = user3 != null ? UserObject.getColorId(user3) : 5;
                                if (i10 == 3) {
                                    this.v = UserObject.getEmojiId(user3);
                                }
                            }
                        } else if (DialogObject.isEncryptedDialog(messageObject.getDialogId()) && user2 != null) {
                            TLRPC.User currentUser = messageObject.isOutOwner() ? UserConfig.getInstance(messageObject.currentAccount).getCurrentUser() : user2;
                            if (currentUser != null) {
                                user2 = currentUser;
                            }
                            if (!messageObject.isOutOwner() && i10 != 2) {
                                TLRPC.PeerColor peerColor5 = user2.color;
                                if (peerColor5 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor5, d6Var);
                                }
                            }
                            i12 = UserObject.getColorId(user2);
                            if (i10 == 3) {
                                this.v = UserObject.getEmojiId(user2);
                            }
                        } else if (messageObject.isFromUser() && user2 != null) {
                            if (!messageObject.isOutOwner() && i10 != 2) {
                                TLRPC.PeerColor peerColor6 = user2.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor6, d6Var);
                                }
                            }
                            i12 = UserObject.getColorId(user2);
                            if (i10 == 3) {
                                this.v = UserObject.getEmojiId(user2);
                            }
                        } else if (!messageObject.isFromChannel() || chat == null) {
                            i12 = 0;
                        } else {
                            if (!messageObject.isOutOwner() && i10 != 2) {
                                TLRPC.PeerColor peerColor7 = chat.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor7, d6Var);
                                }
                            }
                            if (chat.signature_profiles) {
                                long fromChatId = messageObject.getFromChatId();
                                if (fromChatId >= 0) {
                                    TLRPC.User user4 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(fromChatId));
                                    colorId = UserObject.getColorId(user4);
                                    if (i10 == 3) {
                                        this.v = UserObject.getEmojiId(user4);
                                    }
                                } else {
                                    TLRPC.Chat chat3 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-fromChatId));
                                    colorId = ChatObject.getColorId(chat3);
                                    if (i10 == 3) {
                                        this.v = ChatObject.getEmojiId(chat3);
                                    }
                                }
                                i12 = colorId;
                            } else {
                                i12 = ChatObject.getColorId(chat);
                                if (i10 == 3) {
                                    this.v = ChatObject.getEmojiId(chat);
                                }
                            }
                        }
                    } else if (i10 == 3) {
                        this.v = peerColor.background_emoji_id;
                    }
                    i12 = colorId2;
                }
                m(messageObject, i12, d6Var);
                this.x = org.telegram.ui.ActionBar.h6.m1(0.1f, this.z);
                this.y = this.z;
            } else if (i10 != 0 || (messageObject.overrideLinkColor < 0 && ((message = messageObject.messageOwner) == null || messageObject.replyMessageObject == null || (messageReplyHeader = message.reply_to) == null || (!((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) || (message2 = (messageObject2 = messageObject.replyMessageObject).messageOwner) == null || message2.from_id == null || !(messageObject2.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.replyMessageObject.isFromChannel()))))) {
                this.i = false;
                this.j = false;
                int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Uc, d6Var);
                this.B = w04;
                this.A = w04;
                this.z = w04;
                this.x = org.telegram.ui.ActionBar.h6.m1(0.1f, w04);
                this.y = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Wc, d6Var);
            } else {
                int i13 = messageObject.overrideLinkColor;
                if (i13 < 0) {
                    if (DialogObject.isEncryptedDialog(messageObject.replyMessageObject.getDialogId())) {
                        if (messageObject.replyMessageObject.isOutOwner()) {
                            user2 = UserConfig.getInstance(messageObject.replyMessageObject.currentAccount).getCurrentUser();
                        }
                        if (user2 != null) {
                            i13 = UserObject.getColorId(user2);
                            this.v = UserObject.getEmojiId(user2);
                        }
                        i13 = 0;
                    } else if (messageObject.replyMessageObject.isFromUser()) {
                        TLRPC.User user5 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.user_id));
                        if (!messageObject.isOutOwner() && i10 != 2 && user5 != null) {
                            TLRPC.PeerColor peerColor8 = user5.color;
                            if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor8, d6Var);
                            }
                        }
                        if (user5 != null) {
                            i13 = UserObject.getColorId(user5);
                            this.v = UserObject.getEmojiId(user5);
                        }
                        i13 = 0;
                    } else {
                        if (messageObject.replyMessageObject.isFromChannel()) {
                            TLRPC.Chat chat4 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.channel_id));
                            if (!messageObject.isOutOwner() && i10 != 2 && chat4 != null) {
                                TLRPC.PeerColor peerColor9 = chat4.color;
                                if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor9, d6Var);
                                }
                            }
                            if (chat4 != null) {
                                i13 = ChatObject.getColorId(chat4);
                                this.v = ChatObject.getEmojiId(chat4);
                            }
                        }
                        i13 = 0;
                    }
                }
                m(messageObject.replyMessageObject, i13, d6Var);
                this.x = org.telegram.ui.ActionBar.h6.m1(0.1f, this.z);
                this.y = this.z;
            }
        } else {
            long j10 = MessageObject.getMedia(messageObject.messageOwner).user_id;
            TLRPC.User user6 = j10 != 0 ? MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(j10)) : null;
            if (!messageObject.isOutOwner() && i10 != 2 && user6 != null) {
                TLRPC.PeerColor peerColor10 = user6.color;
                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor10, d6Var);
                }
            }
            if (user6 != null) {
                i11 = UserObject.getColorId(user6);
                i5Var = i5Var2;
                this.v = UserObject.getEmojiId(user6);
            } else {
                i5Var = i5Var2;
                i11 = 0;
            }
            m(messageObject, i11, d6Var);
            this.x = org.telegram.ui.ActionBar.h6.m1(0.1f, this.z);
            this.y = this.z;
        }
        if (messageObject.shouldDrawWithoutBackground()) {
            this.i = false;
            this.j = false;
            this.B = -1;
            this.A = -1;
            this.z = -1;
            this.x = 0;
            this.y = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Xc, d6Var);
        } else if (messageObject.isOutOwner() || i10 == 2) {
            if (i10 != 2 || messageObject.isOutOwner()) {
                int w05 = org.telegram.ui.ActionBar.h6.w0((this.i || this.j) ? org.telegram.ui.ActionBar.h6.bb : org.telegram.ui.ActionBar.h6.ab, d6Var);
                this.B = w05;
                this.A = w05;
                this.z = w05;
            } else {
                int w06 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.pk, d6Var);
                this.B = w06;
                this.A = w06;
                this.z = w06;
            }
            if (this.j) {
                this.R = true;
                this.z = org.telegram.ui.ActionBar.h6.m1(0.2f, this.z);
                this.A = org.telegram.ui.ActionBar.h6.m1(0.5f, this.A);
            } else if (this.i) {
                this.R = true;
                this.z = org.telegram.ui.ActionBar.h6.m1(0.35f, this.z);
            }
            this.x = org.telegram.ui.ActionBar.h6.m1(a2 ? 0.12f : 0.1f, this.B);
            this.y = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.cb, d6Var);
        }
        if (i10 == 0 || i10 == 3 || i10 == 4) {
            long j11 = messageObject.overrideLinkEmoji;
            if (j11 != -1) {
                this.v = j11;
            }
        }
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new p5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.u1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.u1) view).M0) {
                this.t.a();
            }
        }
        p5 p5Var = this.t;
        if (p5Var != null) {
            z10 = true;
            if (p5Var.j(this.v, true)) {
                this.Y = false;
            }
        } else {
            z10 = true;
        }
        p5 p5Var2 = this.u;
        if (p5Var2 != null) {
            p5Var2.j(this.w, z10);
        }
        this.C = h();
        return i5Var.a(this.y, false);
    }

    public final void b(float f7, float f10, float f11, float f12, Canvas canvas, RectF rectF) {
        c(canvas, rectF, f7, f10, f11, f12, false, false);
    }

    public final void c(Canvas canvas, RectF rectF, float f7, float f10, float f11, float f12, boolean z10, boolean z11) {
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f7));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float dp = AndroidUtilities.dp(f10);
        fArr[3] = dp;
        fArr[2] = dp;
        float dp2 = AndroidUtilities.dp(f11);
        fArr[5] = dp2;
        fArr[4] = dp2;
        float max2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f11));
        fArr[7] = max2;
        fArr[6] = max2;
        d(canvas, rectF, f12, z10, z11);
    }

    public final void d(Canvas canvas, RectF rectF, float f7, boolean z10, boolean z11) {
        boolean z12;
        ci.g3 g3Var;
        float e;
        int i10;
        p5 p5Var;
        if (!z11) {
            int m12 = org.telegram.ui.ActionBar.h6.m1(f7, this.E.a(this.x, false));
            Paint paint = this.g;
            paint.setColor(m12);
            float[] fArr = this.e;
            if (zf.f0.c(fArr)) {
                float f10 = fArr[0];
                canvas.drawRoundRect(rectF, f10, f10, paint);
            } else {
                Path path = this.f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        p5 p5Var2 = this.t;
        if (p5Var2 != null) {
            if (!this.Y) {
                Drawable drawable = p5Var2.f[0];
                if ((drawable instanceof r5) && (g3Var = ((r5) drawable).k) != null && g3Var.hasImageLoaded()) {
                    this.Y = true;
                } else {
                    z12 = false;
                    e = this.L.e(z12);
                    if (e > 0.0f || this.r <= 0.0f) {
                    }
                    if (this.W == null) {
                        i10 = 0;
                        this.W = new pm0[]{new pm0(4.0f, -6.33f, 1.0f, 1.0f), new pm0(30.0f, 3.0f, 0.78f, 0.9f), new pm0(46.0f, -17.0f, 0.6f, 0.6f), new pm0(69.66f, -0.666f, 0.87f, 0.7f), new pm0(98.0f, -12.6f, 1.03f, 0.3f), new pm0(51.0f, 24.0f, 1.0f, 0.5f), new pm0(6.33f, 20.0f, 0.77f, 0.7f), new pm0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new pm0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                    } else {
                        i10 = 0;
                    }
                    canvas.save();
                    canvas.clipRect(rectF);
                    canvas.translate(0.0f, this.X);
                    float max = Math.max(rectF.right - AndroidUtilities.dp(15.0f), rectF.centerX());
                    if (z10) {
                        max -= AndroidUtilities.dp(12.0f);
                    }
                    float min = Math.min(rectF.centerY(), rectF.top + AndroidUtilities.dp(21.0f));
                    p5 p5Var3 = this.u;
                    if (p5Var3 != null) {
                        p5Var3.v = (int) (f7 * 255.0f);
                    }
                    this.t.k(Integer.valueOf(this.C));
                    int i11 = i10;
                    while (true) {
                        pm0[] pm0VarArr = this.W;
                        if (i11 >= pm0VarArr.length) {
                            canvas.restore();
                            return;
                        }
                        if (i11 != 0 || (p5Var = this.u) == null || this.w == 0) {
                            p5Var = this.t;
                        }
                        pm0 pm0Var = pm0VarArr[i11];
                        if (!pm0Var.e || z10) {
                            p5Var.v = (int) ((p5Var == this.u ? 1.0f : 0.3f) * 255.0f * pm0Var.d * this.r);
                            float dp = max - AndroidUtilities.dp(pm0Var.a);
                            float dp2 = AndroidUtilities.dp(pm0Var.b) + min;
                            float dp3 = AndroidUtilities.dp(10.0f) * pm0Var.c * e;
                            p5Var.setBounds((int) (dp - dp3), (int) (dp2 - dp3), (int) (dp + dp3), (int) (dp2 + dp3));
                            p5Var.draw(canvas);
                        }
                        i11++;
                    }
                }
            }
            z12 = true;
            e = this.L.e(z12);
            if (e > 0.0f) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0246, code lost:
    
        if (r26.k.getHeight() == r10) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, RectF rectF, float f7) {
        float f10;
        float height;
        int i10;
        int i11;
        float f11;
        int floor = (int) Math.floor(SharedConfig.bubbleRadius / (this.s ? 2.0f : 3.0f));
        float max = rectF.left + Math.max(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(floor * 2));
        int a2 = this.F.a(this.z, false);
        int m12 = org.telegram.ui.ActionBar.h6.m1(f7, a2);
        Paint paint = this.b;
        paint.setColor(m12);
        float e = this.M.e(this.S);
        float e7 = this.J.e(this.i);
        float e10 = this.K.e(this.j);
        RectF rectF2 = this.a;
        if (e > 0.0f && !this.i) {
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * 0.3f));
            rectF2.set(rectF.left, rectF.top, max, rectF.bottom);
            canvas.save();
            float f12 = rectF2.left;
            canvas.clipRect(f12, rectF2.top, AndroidUtilities.dp(3.0f) + f12, rectF2.bottom);
            float f13 = floor;
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f13), AndroidUtilities.dp(f13), paint);
            paint.setAlpha(alpha);
            i();
            float pow = ((float) Math.pow((this.T / 240.0f) / 4.0f, 0.8500000238418579d)) * 4.0f;
            rectF2.set(rectF.left, (AndroidUtilities.lerp(0.0f, 1.0f - bs.i.getInterpolation(w7.r.a(((Math.max(pow, 0.5f) + 1.5f) % 3.5f) * 0.5f, 0.0f, 1.0f)), e) * rectF.height()) + rectF.top, rectF.left + AndroidUtilities.dp(6.0f), (AndroidUtilities.lerp(1.0f, 1.0f - bs.g.getInterpolation(w7.r.a((((pow + 1.5f) % 3.5f) - 1.5f) * 0.5f, 0.0f, 1.0f)), e) * rectF.height()) + rectF.top);
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            canvas.restore();
            View view = this.D;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (e7 <= 0.0f) {
            rectF2.set(rectF.left, rectF.top, max, rectF.bottom);
            canvas.save();
            float f14 = rectF2.left;
            canvas.clipRect(f14, rectF2.top, AndroidUtilities.dp(3.0f) + f14, rectF2.bottom);
            float f15 = floor;
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), paint);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        i();
        if (this.j) {
            height = rectF.height();
            f10 = 12.66f;
            int height2 = (int) rectF.height();
            int dp = AndroidUtilities.dp(18.99f);
            i10 = height2 % dp;
            if (i10 != 0) {
                if ((((height2 ^ dp) >> 31) | 1) <= 0) {
                    i10 += dp;
                }
                i11 = i10;
            }
            i11 = 0;
        } else {
            f10 = 12.66f;
            height = rectF.height();
            int height3 = (int) rectF.height();
            int dp2 = AndroidUtilities.dp(12.66f);
            i10 = height3 % dp2;
            if (i10 != 0) {
                if ((((height3 ^ dp2) >> 31) | 1) <= 0) {
                    i10 += dp2;
                }
                i11 = i10;
            }
            i11 = 0;
        }
        float d = ((((this.N.d(this.q * 425, false) + this.U) + (this.R ? 100 : 0)) / 1000.0f) * AndroidUtilities.dp(30.0f)) % (height - i11);
        int a10 = this.G.a(this.A, false);
        int a11 = this.H.a(this.B, false);
        int m13 = org.telegram.ui.ActionBar.h6.m1(f7, a2);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.h6.m1(e7 * f7, a10), m13);
        int k11 = this.j ? i0.a.k(org.telegram.ui.ActionBar.h6.m1(f7 * e10, a11), m13) : 0;
        int round = Math.round(AndroidUtilities.dpf2(6.33f));
        int max2 = Math.max(1, AndroidUtilities.dp(3.0f));
        int dp3 = this.j ? AndroidUtilities.dp(18.99f) : AndroidUtilities.dp(f10);
        Bitmap bitmap = this.k;
        Paint paint2 = this.c;
        if (bitmap != null && this.l == m13 && this.m == k10 && this.n == k11) {
            f11 = max;
            if (this.p == this.j) {
                if (this.o == round) {
                    if (bitmap.getWidth() == max2) {
                    }
                }
            }
        } else {
            f11 = max;
        }
        this.l = m13;
        this.m = k10;
        this.n = k11;
        this.p = this.j;
        this.o = round;
        Bitmap bitmap2 = this.k;
        if (bitmap2 == null || bitmap2.getWidth() != max2 || this.k.getHeight() != dp3) {
            Bitmap bitmap3 = this.k;
            if (bitmap3 != null) {
                bitmap3.recycle();
            }
            this.k = Bitmap.createBitmap(max2, dp3, Bitmap.Config.ARGB_8888);
            paint2.setShader(new BitmapShader(this.k, Shader.TileMode.CLAMP, Shader.TileMode.REPEAT));
        }
        Utilities.drawReplyLinePattern(this.k, m13, k10, k11, round, this.j);
        Matrix matrix = this.d;
        matrix.setTranslate(0.0f, -d);
        paint2.getShader().setLocalMatrix(matrix);
        paint2.setAlpha(255);
        rectF2.set(0.0f, 0.0f, f11 - rectF.left, rectF.bottom - rectF.top);
        float f16 = rectF2.left;
        canvas.clipRect(f16, rectF2.top, AndroidUtilities.dp(3.0f) + f16, rectF2.bottom);
        float f17 = floor;
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f17), AndroidUtilities.dp(f17), paint2);
        canvas.restore();
    }

    public final void f(float f7, float f10, float f11, float f12, Canvas canvas, RectF rectF) {
        ba0 ba0Var;
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f7));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float dp = AndroidUtilities.dp(f10);
        fArr[3] = dp;
        fArr[2] = dp;
        float dp2 = AndroidUtilities.dp(f11);
        fArr[5] = dp2;
        fArr[4] = dp2;
        float max2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f11));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.S && ((ba0Var = this.h) == null || !ba0Var.d())) {
            ba0 ba0Var2 = this.h;
            if (ba0Var2 != null) {
                ba0Var2.b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            ba0 ba0Var3 = new ba0();
            this.h = ba0Var3;
            ba0Var3.D = true;
            ba0Var3.t = 3.5f;
            ba0Var3.u = 0.5f;
        }
        this.h.g(org.telegram.ui.ActionBar.h6.m1(0.1f, this.z), org.telegram.ui.ActionBar.h6.m1(0.3f, this.z), org.telegram.ui.ActionBar.h6.m1(0.3f, this.z), org.telegram.ui.ActionBar.h6.m1(1.25f, this.z));
        this.h.e(rectF);
        this.h.j(fArr);
        this.h.x.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.h.setAlpha((int) (f12 * 255.0f));
        this.h.draw(canvas);
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
    }

    public final int g() {
        return this.x;
    }

    public final int h() {
        return this.R ? this.A : this.z;
    }

    public final void i() {
        long currentTimeMillis = System.currentTimeMillis();
        float e = this.M.e(this.S);
        this.T = (Math.min(30L, currentTimeMillis - this.V) * e) + this.T;
        this.U = (Math.min(30L, currentTimeMillis - this.V) * e) + this.U;
        this.V = currentTimeMillis;
    }

    public final void j(float f7) {
        this.X = f7;
    }

    public final void k() {
        this.F.a(this.z, true);
        this.G.a(this.A, true);
        this.J.f(this.i, true);
        this.I.a(this.y, true);
        this.E.a(this.x, true);
        p5 p5Var = this.t;
        if (p5Var != null) {
            p5Var.d.d(1.0f, true);
        }
    }

    public final int l(MessageObject messageObject, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.d6 d6Var) {
        boolean a2 = d6Var != null ? d6Var.a() : org.telegram.ui.ActionBar.h6.I.q();
        int i10 = (!a2 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
        ArrayList<Integer> arrayList = (!a2 || (tL_peerColorCollectible.flags & 2) == 0) ? tL_peerColorCollectible.colors : tL_peerColorCollectible.dark_colors;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0;
        }
        if (this.Q != tL_peerColorCollectible.collectible_id) {
            int id2 = messageObject != null ? messageObject.getId() : 0;
            if (id2 == this.O) {
                this.q++;
            }
            this.P = 0;
            this.Q = tL_peerColorCollectible.collectible_id;
            this.O = id2;
        }
        this.R = false;
        this.z = tL_peerColorCollectible.colors.get(0).intValue() | (-16777216);
        boolean z10 = arrayList.size() >= 2;
        this.i = z10;
        if (z10) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        boolean z11 = arrayList.size() >= 3;
        this.j = z11;
        if (z11) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i11 = i10 | (-16777216);
        this.y = i11;
        this.x = org.telegram.ui.ActionBar.h6.m1(0.1f, i11);
        long j10 = tL_peerColorCollectible.background_emoji_id;
        this.v = j10;
        this.w = tL_peerColorCollectible.gift_emoji_id;
        View view = this.D;
        if (j10 != 0 && this.t == null && view != null) {
            this.t = new p5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.u1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.u1) view).M0) {
                this.t.a();
            }
        }
        p5 p5Var = this.t;
        if (p5Var != null && p5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = this.y;
        if (this.w != 0 && this.u == null && view != null) {
            this.u = new p5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.u1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.u1) view).M0) {
                this.u.a();
            }
        }
        p5 p5Var2 = this.u;
        if (p5Var2 != null) {
            p5Var2.j(this.w, true);
        }
        return this.I.a(this.y, false);
    }

    public final void m(MessageObject messageObject, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        if (d6Var != null) {
            d6Var.a();
        } else {
            org.telegram.ui.ActionBar.h6.f1();
        }
        if (this.P != i10) {
            int id2 = messageObject != null ? messageObject.getId() : 0;
            if (id2 == this.O) {
                this.q++;
            }
            this.Q = 0L;
            this.P = i10;
            this.O = id2;
        }
        if (i10 < 7) {
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.r8[i10], d6Var);
            this.B = w02;
            this.A = w02;
            this.z = w02;
            this.j = false;
            this.i = false;
            return;
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(messageObject != null ? messageObject.currentAccount : UserConfig.selectedAccount).peerColors;
        MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i10) : null;
        if (color == null) {
            int w03 = org.telegram.ui.ActionBar.h6.w0((messageObject == null || !messageObject.isOutOwner()) ? org.telegram.ui.ActionBar.h6.Uc : org.telegram.ui.ActionBar.h6.ab, d6Var);
            this.B = w03;
            this.A = w03;
            this.z = w03;
            this.j = false;
            this.i = false;
            return;
        }
        this.z = color.getColor(0, d6Var);
        this.A = color.getColor(1, d6Var);
        int color2 = color.getColor(2, d6Var);
        this.B = color2;
        int i11 = this.A;
        int i12 = this.z;
        this.i = i11 != i12;
        boolean z10 = color2 != i12;
        this.j = z10;
        if (z10) {
            this.B = i11;
            this.A = color2;
        }
    }

    public final void n(float f7) {
        this.r = f7;
    }

    public final int o(org.telegram.ui.ActionBar.d6 d6Var) {
        View view;
        int i10 = org.telegram.ui.ActionBar.h6.q7;
        this.y = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        this.z = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        this.i = false;
        this.j = false;
        this.x = org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new p5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.u1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.u1) view).M0) {
                this.t.a();
            }
        }
        p5 p5Var = this.t;
        if (p5Var != null && p5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = h();
        return this.I.a(this.y, false);
    }

    public final void p(boolean z10) {
        ba0 ba0Var;
        if (!z10 && this.S) {
            this.T = 0.0f;
            ba0 ba0Var2 = this.h;
            if (ba0Var2 != null) {
                ba0Var2.a();
            }
        } else if (z10 && !this.S && (ba0Var = this.h) != null) {
            ba0Var.c = -1L;
            ba0Var.b = -1L;
        }
        this.S = z10;
    }

    public final void q(int i10, boolean z10) {
        this.R = false;
        this.j = false;
        this.i = false;
        this.B = i10;
        this.A = i10;
        this.z = i10;
        this.x = org.telegram.ui.ActionBar.h6.m1(z10 ? 0.12f : 0.1f, i10);
        this.C = i10;
    }
}
