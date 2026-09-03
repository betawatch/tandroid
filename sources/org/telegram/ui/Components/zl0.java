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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zl0 {
    public int A;
    public int B;
    public int C;
    public final View D;
    public final c5 E;
    public final c5 F;
    public final c5 G;
    public final c5 H;
    public final c5 I;
    public final z5 J;
    public final z5 K;
    public final z5 L;
    public final z5 M;
    public final z5 N;
    public int O;
    public int P;
    public long Q;
    public boolean R;
    public boolean S;
    public float T;
    public float U;
    public long V;
    public yl0[] W;
    public float X;
    public boolean Y;
    public j90 h;
    public boolean i;
    public boolean j;
    public Bitmap k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean s;
    public j5 t;
    public j5 u;
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

    public zl0(View view) {
        this.D = view;
        if (view != null) {
            view.addOnAttachStateChangeListener(new ef.b(this, 12));
        }
        mr mrVar = mr.h;
        this.E = new c5(view, 400L, mrVar, 0);
        this.F = new c5(view, 400L, mrVar, 0);
        this.G = new c5(view, 400L, mrVar, 0);
        this.H = new c5(view, 400L, mrVar, 0);
        this.I = new c5(view, 400L, mrVar, 0);
        this.J = new z5(view, 0L, 400L, mrVar);
        this.K = new z5(view, 0L, 400L, mrVar);
        this.L = new z5(view, 0L, 440L, mrVar);
        this.M = new z5(view, 0L, 320L, mrVar);
        this.N = new z5(view, 0L, 320L, mrVar);
    }

    public final int a(MessageObject messageObject, TLRPC.User user, TLRPC.Chat chat, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        c5 c5Var;
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.MessageFwdHeader messageFwdHeader;
        MessageObject messageObject2;
        TLRPC.Message message2;
        int colorId;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer;
        TLRPC.PeerColor peerColor;
        int i11;
        TLRPC.Message message3;
        TLRPC.PeerColor peerColor2;
        TLRPC.MessageFwdHeader messageFwdHeader3;
        boolean z4;
        View view;
        TLRPC.Message message4;
        int i12;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.User user2 = user;
        boolean a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
        if (messageObject != null && !messageObject.isOutOwner() && i10 != 2 && (tL_peerColorCollectible = messageObject.overrideLinkPeerColor) != null) {
            return l(messageObject, tL_peerColorCollectible, f6Var);
        }
        this.R = false;
        this.v = 0L;
        this.w = 0L;
        this.s = messageObject != null && messageObject.isSponsored();
        c5 c5Var2 = this.I;
        if (messageObject == null) {
            this.j = false;
            this.i = false;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Uc, f6Var);
            this.B = v02;
            this.A = v02;
            this.z = v02;
            this.x = org.telegram.ui.ActionBar.j6.l1(a2 ? 0.12f : 0.1f, v02);
            this.C = h();
            int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wc, f6Var);
            this.y = v03;
            return c5Var2.a(v03, false);
        }
        if (i10 != 4 || (message4 = messageObject.messageOwner) == null || MessageObject.getMedia(message4) == null || !(MessageObject.getMedia(messageObject.messageOwner) instanceof TLRPC.TL_messageMediaContact)) {
            c5Var = c5Var2;
            if (i10 != 0 && (messageObject.overrideLinkColor >= 0 || (messageObject.messageOwner != null && (((messageObject.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId())) && user2 != null) || ((messageObject.isFromChannel() && chat != null) || (((message3 = messageObject.messageOwner) != null && (messageFwdHeader3 = message3.fwd_from) != null && messageFwdHeader3.from_id != null) || (messageObject.isSponsored() && (peerColor2 = messageObject.sponsoredColor) != null && peerColor2.color != -1))))))) {
                int i13 = messageObject.overrideLinkColor;
                if (i13 < 0) {
                    if (!messageObject.isSponsored() || (peerColor = messageObject.sponsoredColor) == null || (i11 = peerColor.color) == -1) {
                        TLRPC.Message message5 = messageObject.messageOwner;
                        if (message5 != null && (messageFwdHeader2 = message5.fwd_from) != null && (peer = messageFwdHeader2.from_id) != null) {
                            long peerDialogId = DialogObject.getPeerDialogId(peer);
                            if (peerDialogId < 0) {
                                TLRPC.Chat chat2 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-peerDialogId));
                                if (!messageObject.isOutOwner() && i10 != 2 && chat2 != null) {
                                    TLRPC.PeerColor peerColor3 = chat2.color;
                                    if (peerColor3 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor3, f6Var);
                                    }
                                }
                                i13 = chat2 != null ? ChatObject.getColorId(chat2) : 5;
                                if (i10 == 3) {
                                    this.v = ChatObject.getEmojiId(chat2);
                                }
                            } else {
                                TLRPC.User user3 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(peerDialogId));
                                if (!messageObject.isOutOwner() && i10 != 2 && user3 != null) {
                                    TLRPC.PeerColor peerColor4 = user3.color;
                                    if (peerColor4 instanceof TLRPC.TL_peerColorCollectible) {
                                        return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor4, f6Var);
                                    }
                                }
                                i13 = user3 != null ? UserObject.getColorId(user3) : 5;
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
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor5, f6Var);
                                }
                            }
                            i13 = UserObject.getColorId(user2);
                            if (i10 == 3) {
                                this.v = UserObject.getEmojiId(user2);
                            }
                        } else if (messageObject.isFromUser() && user2 != null) {
                            if (!messageObject.isOutOwner() && i10 != 2) {
                                TLRPC.PeerColor peerColor6 = user2.color;
                                if (peerColor6 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor6, f6Var);
                                }
                            }
                            i13 = UserObject.getColorId(user2);
                            if (i10 == 3) {
                                this.v = UserObject.getEmojiId(user2);
                            }
                        } else if (!messageObject.isFromChannel() || chat == null) {
                            i13 = 0;
                        } else {
                            if (!messageObject.isOutOwner() && i10 != 2) {
                                TLRPC.PeerColor peerColor7 = chat.color;
                                if (peerColor7 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor7, f6Var);
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
                                i13 = colorId;
                            } else {
                                i13 = ChatObject.getColorId(chat);
                                if (i10 == 3) {
                                    this.v = ChatObject.getEmojiId(chat);
                                }
                            }
                        }
                    } else {
                        if (i10 == 3) {
                            this.v = peerColor.background_emoji_id;
                        }
                        i13 = i11;
                    }
                }
                m(messageObject, i13, f6Var);
                this.x = org.telegram.ui.ActionBar.j6.l1(0.1f, this.z);
                this.y = this.z;
            } else if (i10 != 0 || (messageObject.overrideLinkColor < 0 && ((message = messageObject.messageOwner) == null || messageObject.replyMessageObject == null || (messageReplyHeader = message.reply_to) == null || (!((messageFwdHeader = messageReplyHeader.reply_from) == null || TextUtils.isEmpty(messageFwdHeader.from_name)) || (message2 = (messageObject2 = messageObject.replyMessageObject).messageOwner) == null || message2.from_id == null || !(messageObject2.isFromUser() || DialogObject.isEncryptedDialog(messageObject.getDialogId()) || messageObject.replyMessageObject.isFromChannel()))))) {
                this.i = false;
                this.j = false;
                int v04 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Uc, f6Var);
                this.B = v04;
                this.A = v04;
                this.z = v04;
                this.x = org.telegram.ui.ActionBar.j6.l1(0.1f, v04);
                this.y = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Wc, f6Var);
            } else {
                int i14 = messageObject.overrideLinkColor;
                if (i14 < 0) {
                    if (DialogObject.isEncryptedDialog(messageObject.replyMessageObject.getDialogId())) {
                        if (messageObject.replyMessageObject.isOutOwner()) {
                            user2 = UserConfig.getInstance(messageObject.replyMessageObject.currentAccount).getCurrentUser();
                        }
                        if (user2 != null) {
                            i14 = UserObject.getColorId(user2);
                            this.v = UserObject.getEmojiId(user2);
                        }
                        i14 = 0;
                    } else if (messageObject.replyMessageObject.isFromUser()) {
                        TLRPC.User user5 = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.user_id));
                        if (!messageObject.isOutOwner() && i10 != 2 && user5 != null) {
                            TLRPC.PeerColor peerColor8 = user5.color;
                            if (peerColor8 instanceof TLRPC.TL_peerColorCollectible) {
                                return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor8, f6Var);
                            }
                        }
                        if (user5 != null) {
                            i14 = UserObject.getColorId(user5);
                            this.v = UserObject.getEmojiId(user5);
                        }
                        i14 = 0;
                    } else {
                        if (messageObject.replyMessageObject.isFromChannel()) {
                            TLRPC.Chat chat4 = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(messageObject.replyMessageObject.messageOwner.from_id.channel_id));
                            if (!messageObject.isOutOwner() && i10 != 2 && chat4 != null) {
                                TLRPC.PeerColor peerColor9 = chat4.color;
                                if (peerColor9 instanceof TLRPC.TL_peerColorCollectible) {
                                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor9, f6Var);
                                }
                            }
                            if (chat4 != null) {
                                i14 = ChatObject.getColorId(chat4);
                                this.v = ChatObject.getEmojiId(chat4);
                            }
                        }
                        i14 = 0;
                    }
                }
                m(messageObject.replyMessageObject, i14, f6Var);
                this.x = org.telegram.ui.ActionBar.j6.l1(0.1f, this.z);
                this.y = this.z;
            }
        } else {
            long j10 = MessageObject.getMedia(messageObject.messageOwner).user_id;
            TLRPC.User user6 = j10 != 0 ? MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(j10)) : null;
            if (!messageObject.isOutOwner() && i10 != 2 && user6 != null) {
                TLRPC.PeerColor peerColor10 = user6.color;
                if (peerColor10 instanceof TLRPC.TL_peerColorCollectible) {
                    return l(messageObject, (TLRPC.TL_peerColorCollectible) peerColor10, f6Var);
                }
            }
            if (user6 != null) {
                i12 = UserObject.getColorId(user6);
                c5Var = c5Var2;
                this.v = UserObject.getEmojiId(user6);
            } else {
                c5Var = c5Var2;
                i12 = 0;
            }
            m(messageObject, i12, f6Var);
            this.x = org.telegram.ui.ActionBar.j6.l1(0.1f, this.z);
            this.y = this.z;
        }
        if (messageObject.shouldDrawWithoutBackground()) {
            this.i = false;
            this.j = false;
            this.B = -1;
            this.A = -1;
            this.z = -1;
            this.x = 0;
            this.y = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xc, f6Var);
        } else if (messageObject.isOutOwner() || i10 == 2) {
            if (i10 != 2 || messageObject.isOutOwner()) {
                int v05 = org.telegram.ui.ActionBar.j6.v0((this.i || this.j) ? org.telegram.ui.ActionBar.j6.bb : org.telegram.ui.ActionBar.j6.ab, f6Var);
                this.B = v05;
                this.A = v05;
                this.z = v05;
            } else {
                int v06 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pk, f6Var);
                this.B = v06;
                this.A = v06;
                this.z = v06;
            }
            if (this.j) {
                this.R = true;
                this.z = org.telegram.ui.ActionBar.j6.l1(0.2f, this.z);
                this.A = org.telegram.ui.ActionBar.j6.l1(0.5f, this.A);
            } else if (this.i) {
                this.R = true;
                this.z = org.telegram.ui.ActionBar.j6.l1(0.35f, this.z);
            }
            this.x = org.telegram.ui.ActionBar.j6.l1(a2 ? 0.12f : 0.1f, this.B);
            this.y = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cb, f6Var);
        }
        if (i10 == 0 || i10 == 3 || i10 == 4) {
            long j11 = messageObject.overrideLinkEmoji;
            if (j11 != -1) {
                this.v = j11;
            }
        }
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new j5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).J0) {
                this.t.a();
            }
        }
        j5 j5Var = this.t;
        if (j5Var != null) {
            z4 = true;
            if (j5Var.j(this.v, true)) {
                this.Y = false;
            }
        } else {
            z4 = true;
        }
        j5 j5Var2 = this.u;
        if (j5Var2 != null) {
            j5Var2.j(this.w, z4);
        }
        this.C = h();
        return c5Var.a(this.y, false);
    }

    public final void b(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13) {
        c(canvas, rectF, f10, f11, f12, f13, false, false);
    }

    public final void c(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13, boolean z4, boolean z10) {
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f10));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float dp = AndroidUtilities.dp(f11);
        fArr[3] = dp;
        fArr[2] = dp;
        float dp2 = AndroidUtilities.dp(f12);
        fArr[5] = dp2;
        fArr[4] = dp2;
        float max2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        d(canvas, rectF, f13, z4, z10);
    }

    public final void d(Canvas canvas, RectF rectF, float f10, boolean z4, boolean z10) {
        boolean z11;
        nh.y2 y2Var;
        float e;
        j5 j5Var;
        if (!z10) {
            int l1 = org.telegram.ui.ActionBar.j6.l1(f10, this.E.a(this.x, false));
            Paint paint = this.g;
            paint.setColor(l1);
            float[] fArr = this.e;
            if (kf.m0.c(fArr)) {
                float f11 = fArr[0];
                canvas.drawRoundRect(rectF, f11, f11, paint);
            } else {
                Path path = this.f;
                path.rewind();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
        j5 j5Var2 = this.t;
        if (j5Var2 != null) {
            if (!this.Y) {
                Drawable drawable = j5Var2.f[0];
                if ((drawable instanceof l5) && (y2Var = ((l5) drawable).k) != null && y2Var.hasImageLoaded()) {
                    this.Y = true;
                } else {
                    z11 = false;
                    e = this.L.e(z11);
                    if (e > 0.0f || this.r <= 0.0f) {
                    }
                    if (this.W == null) {
                        this.W = new yl0[]{new yl0(4.0f, -6.33f, 1.0f, 1.0f), new yl0(30.0f, 3.0f, 0.78f, 0.9f), new yl0(46.0f, -17.0f, 0.6f, 0.6f), new yl0(69.66f, -0.666f, 0.87f, 0.7f), new yl0(98.0f, -12.6f, 1.03f, 0.3f), new yl0(51.0f, 24.0f, 1.0f, 0.5f), new yl0(6.33f, 20.0f, 0.77f, 0.7f), new yl0(-19.0f, 12.0f, 0.8f, 0.6f, 0), new yl0(-22.0f, 36.0f, 0.7f, 0.5f, 0)};
                    }
                    canvas.save();
                    canvas.clipRect(rectF);
                    canvas.translate(0.0f, this.X);
                    float max = Math.max(rectF.right - AndroidUtilities.dp(15.0f), rectF.centerX());
                    if (z4) {
                        max -= AndroidUtilities.dp(12.0f);
                    }
                    float min = Math.min(rectF.centerY(), rectF.top + AndroidUtilities.dp(21.0f));
                    j5 j5Var3 = this.u;
                    if (j5Var3 != null) {
                        j5Var3.v = (int) (f10 * 255.0f);
                    }
                    this.t.k(Integer.valueOf(this.C));
                    int i10 = 0;
                    while (true) {
                        yl0[] yl0VarArr = this.W;
                        if (i10 >= yl0VarArr.length) {
                            canvas.restore();
                            return;
                        }
                        if (i10 != 0 || (j5Var = this.u) == null || this.w == 0) {
                            j5Var = this.t;
                        }
                        yl0 yl0Var = yl0VarArr[i10];
                        if (!yl0Var.e || z4) {
                            j5Var.v = (int) ((j5Var == this.u ? 1.0f : 0.3f) * 255.0f * yl0Var.d * this.r);
                            float dp = max - AndroidUtilities.dp(yl0Var.a);
                            float dp2 = AndroidUtilities.dp(yl0Var.b) + min;
                            float dp3 = AndroidUtilities.dp(10.0f) * yl0Var.c * e;
                            j5Var.setBounds((int) (dp - dp3), (int) (dp2 - dp3), (int) (dp + dp3), (int) (dp2 + dp3));
                            j5Var.draw(canvas);
                        }
                        i10++;
                    }
                }
            }
            z11 = true;
            e = this.L.e(z11);
            if (e > 0.0f) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0251, code lost:
    
        if (r26.k.getHeight() == r10) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas, RectF rectF, float f10) {
        float f11;
        float height;
        int i10;
        int i11;
        float f12;
        int floor = (int) Math.floor(SharedConfig.bubbleRadius / (this.s ? 2.0f : 3.0f));
        float max = rectF.left + Math.max(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(floor * 2));
        int a2 = this.F.a(this.z, false);
        int l1 = org.telegram.ui.ActionBar.j6.l1(f10, a2);
        Paint paint = this.b;
        paint.setColor(l1);
        float e = this.M.e(this.S);
        float e6 = this.J.e(this.i);
        float e10 = this.K.e(this.j);
        RectF rectF2 = this.a;
        if (e > 0.0f && !this.i) {
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (alpha * 0.3f));
            rectF2.set(rectF.left, rectF.top, max, rectF.bottom);
            canvas.save();
            float f13 = rectF2.left;
            canvas.clipRect(f13, rectF2.top, AndroidUtilities.dp(3.0f) + f13, rectF2.bottom);
            float f14 = floor;
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f14), AndroidUtilities.dp(f14), paint);
            paint.setAlpha(alpha);
            i();
            float pow = ((float) Math.pow((this.T / 240.0f) / 4.0f, 0.8500000238418579d)) * 4.0f;
            rectF2.set(rectF.left, (AndroidUtilities.lerp(0.0f, 1.0f - mr.i.getInterpolation(k7.n.a(((Math.max(pow, 0.5f) + 1.5f) % 3.5f) * 0.5f, 0.0f, 1.0f)), e) * rectF.height()) + rectF.top, rectF.left + AndroidUtilities.dp(6.0f), (AndroidUtilities.lerp(1.0f, 1.0f - mr.g.getInterpolation(k7.n.a((((pow + 1.5f) % 3.5f) - 1.5f) * 0.5f, 0.0f, 1.0f)), e) * rectF.height()) + rectF.top);
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            canvas.restore();
            View view = this.D;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (e6 <= 0.0f) {
            rectF2.set(rectF.left, rectF.top, max, rectF.bottom);
            canvas.save();
            float f15 = rectF2.left;
            canvas.clipRect(f15, rectF2.top, AndroidUtilities.dp(3.0f) + f15, rectF2.bottom);
            float f16 = floor;
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f16), AndroidUtilities.dp(f16), paint);
            canvas.restore();
            return;
        }
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        i();
        if (this.j) {
            height = rectF.height();
            f11 = 12.66f;
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
            f11 = 12.66f;
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
        int l12 = org.telegram.ui.ActionBar.j6.l1(f10, a2);
        int h = i0.a.h(org.telegram.ui.ActionBar.j6.l1(e6 * f10, a10), l12);
        int h9 = this.j ? i0.a.h(org.telegram.ui.ActionBar.j6.l1(f10 * e10, a11), l12) : 0;
        int round = Math.round(AndroidUtilities.dpf2(6.33f));
        int max2 = Math.max(1, AndroidUtilities.dp(3.0f));
        int dp3 = this.j ? AndroidUtilities.dp(18.99f) : AndroidUtilities.dp(f11);
        Bitmap bitmap = this.k;
        Paint paint2 = this.c;
        if (bitmap != null && this.l == l12 && this.m == h && this.n == h9) {
            f12 = max;
            if (this.p == this.j) {
                if (this.o == round) {
                    if (bitmap.getWidth() == max2) {
                    }
                }
            }
        } else {
            f12 = max;
        }
        this.l = l12;
        this.m = h;
        this.n = h9;
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
        Utilities.drawReplyLinePattern(this.k, l12, h, h9, round, this.j);
        Matrix matrix = this.d;
        matrix.setTranslate(0.0f, -d);
        paint2.getShader().setLocalMatrix(matrix);
        paint2.setAlpha(255);
        rectF2.set(0.0f, 0.0f, f12 - rectF.left, rectF.bottom - rectF.top);
        float f17 = rectF2.left;
        canvas.clipRect(f17, rectF2.top, AndroidUtilities.dp(3.0f) + f17, rectF2.bottom);
        float f18 = floor;
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(f18), AndroidUtilities.dp(f18), paint2);
        canvas.restore();
    }

    public final void f(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13) {
        j90 j90Var;
        float max = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f10));
        float[] fArr = this.e;
        fArr[1] = max;
        fArr[0] = max;
        float dp = AndroidUtilities.dp(f11);
        fArr[3] = dp;
        fArr[2] = dp;
        float dp2 = AndroidUtilities.dp(f12);
        fArr[5] = dp2;
        fArr[4] = dp2;
        float max2 = Math.max(AndroidUtilities.dp((int) Math.floor(SharedConfig.bubbleRadius / 3.0f)), AndroidUtilities.dp(f12));
        fArr[7] = max2;
        fArr[6] = max2;
        if (!this.S && ((j90Var = this.h) == null || !j90Var.c())) {
            j90 j90Var2 = this.h;
            if (j90Var2 != null) {
                j90Var2.b = -1L;
                return;
            }
            return;
        }
        if (this.h == null) {
            j90 j90Var3 = new j90();
            this.h = j90Var3;
            j90Var3.C = true;
            j90Var3.t = 3.5f;
            j90Var3.u = 0.5f;
        }
        this.h.f(org.telegram.ui.ActionBar.j6.l1(0.1f, this.z), org.telegram.ui.ActionBar.j6.l1(0.3f, this.z), org.telegram.ui.ActionBar.j6.l1(0.3f, this.z), org.telegram.ui.ActionBar.j6.l1(1.25f, this.z));
        this.h.d(rectF);
        this.h.i(fArr);
        this.h.w.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.h.setAlpha((int) (f13 * 255.0f));
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

    public final void j(float f10) {
        this.X = f10;
    }

    public final void k() {
        this.F.a(this.z, true);
        this.G.a(this.A, true);
        this.J.f(this.i, true);
        this.I.a(this.y, true);
        this.E.a(this.x, true);
        j5 j5Var = this.t;
        if (j5Var != null) {
            j5Var.d.d(1.0f, true);
        }
    }

    public final int l(MessageObject messageObject, TLRPC.TL_peerColorCollectible tL_peerColorCollectible, org.telegram.ui.ActionBar.f6 f6Var) {
        boolean a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
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
        boolean z4 = arrayList.size() >= 2;
        this.i = z4;
        if (z4) {
            this.A = tL_peerColorCollectible.colors.get(1).intValue() | (-16777216);
        }
        boolean z10 = arrayList.size() >= 3;
        this.j = z10;
        if (z10) {
            this.B = tL_peerColorCollectible.colors.get(2).intValue() | (-16777216);
        }
        int i11 = i10 | (-16777216);
        this.y = i11;
        this.x = org.telegram.ui.ActionBar.j6.l1(0.1f, i11);
        long j10 = tL_peerColorCollectible.background_emoji_id;
        this.v = j10;
        this.w = tL_peerColorCollectible.gift_emoji_id;
        View view = this.D;
        if (j10 != 0 && this.t == null && view != null) {
            this.t = new j5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).J0) {
                this.t.a();
            }
        }
        j5 j5Var = this.t;
        if (j5Var != null && j5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = this.y;
        if (this.w != 0 && this.u == null && view != null) {
            this.u = new j5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).J0) {
                this.u.a();
            }
        }
        j5 j5Var2 = this.u;
        if (j5Var2 != null) {
            j5Var2.j(this.w, true);
        }
        return this.I.a(this.y, false);
    }

    public final void m(MessageObject messageObject, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        if (f6Var != null) {
            f6Var.a();
        } else {
            org.telegram.ui.ActionBar.j6.e1();
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
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.r8[i10], f6Var);
            this.B = v02;
            this.A = v02;
            this.z = v02;
            this.j = false;
            this.i = false;
            return;
        }
        MessagesController.PeerColors peerColors = MessagesController.getInstance(messageObject != null ? messageObject.currentAccount : UserConfig.selectedAccount).peerColors;
        MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(i10) : null;
        if (color == null) {
            int v03 = org.telegram.ui.ActionBar.j6.v0((messageObject == null || !messageObject.isOutOwner()) ? org.telegram.ui.ActionBar.j6.Uc : org.telegram.ui.ActionBar.j6.ab, f6Var);
            this.B = v03;
            this.A = v03;
            this.z = v03;
            this.j = false;
            this.i = false;
            return;
        }
        this.z = color.getColor(0, f6Var);
        this.A = color.getColor(1, f6Var);
        int color2 = color.getColor(2, f6Var);
        this.B = color2;
        int i11 = this.A;
        int i12 = this.z;
        this.i = i11 != i12;
        boolean z4 = color2 != i12;
        this.j = z4;
        if (z4) {
            this.B = i11;
            this.A = color2;
        }
    }

    public final void n(float f10) {
        this.r = f10;
    }

    public final int o(org.telegram.ui.ActionBar.f6 f6Var) {
        View view;
        int i10 = org.telegram.ui.ActionBar.j6.q7;
        this.y = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        this.z = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        this.i = false;
        this.j = false;
        this.x = org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        if (this.v != 0 && this.t == null && (view = this.D) != null) {
            this.t = new j5(AndroidUtilities.dp(20.0f), 13, view, false);
            if (!(view instanceof org.telegram.ui.Cells.s1) ? view.isAttachedToWindow() : ((org.telegram.ui.Cells.s1) view).J0) {
                this.t.a();
            }
        }
        j5 j5Var = this.t;
        if (j5Var != null && j5Var.j(this.v, true)) {
            this.Y = false;
        }
        this.C = h();
        return this.I.a(this.y, false);
    }

    public final void p(boolean z4) {
        j90 j90Var;
        if (!z4 && this.S) {
            this.T = 0.0f;
            j90 j90Var2 = this.h;
            if (j90Var2 != null) {
                j90Var2.a();
            }
        } else if (z4 && !this.S && (j90Var = this.h) != null) {
            j90Var.c = -1L;
            j90Var.b = -1L;
        }
        this.S = z4;
    }

    public final void q(int i10, boolean z4) {
        this.R = false;
        this.j = false;
        this.i = false;
        this.B = i10;
        this.A = i10;
        this.z = i10;
        this.x = org.telegram.ui.ActionBar.j6.l1(z4 ? 0.12f : 0.1f, i10);
        this.C = i10;
    }
}
