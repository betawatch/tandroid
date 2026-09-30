package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Object obj, Object obj2) {
        mz mzVar = (mz) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        vy vyVar = mzVar.R1;
        if (vyVar == null || !(vyVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            return;
        }
        ((CompoundEmoji.CompoundEmojiDrawable) mzVar.R1.getDrawable()).update(num.intValue(), num2.intValue());
        String str = (String) mzVar.R1.getTag();
        if (num.intValue() == -1 && num2.intValue() == -1) {
            Emoji.emojiColor.remove(str);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(num.intValue() >= 0 ? CompoundEmoji.skinTones.get(num.intValue()) : "");
            sb2.append("\u200d");
            sb2.append(num2.intValue() >= 0 ? CompoundEmoji.skinTones.get(num2.intValue()) : "");
            Emoji.emojiColor.put(str, sb2.toString());
        }
        Emoji.saveEmojiColors();
    }

    private final void b(Object obj, Object obj2) {
        my myVar = (my) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = myVar.s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            fy fyVar = (fy) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = fyVar.b;
            if (tL_messages_stickerSet != null) {
                boolean z10 = tL_messages_stickerSet.set.id == myVar.d;
                int i11 = oy.a;
                x51 J = x51.J(oy.class);
                long j3 = tL_messages_stickerSet.set.id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = fyVar.a;
                if (stickerSetCovered != null) {
                    arrayList.add(oy.a(stickerSetCovered, fyVar, stickerSetCovered.set.id == myVar.d));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        hz hzVar = (hz) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = hzVar.E;
        int size = arrayList2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            Object obj3 = arrayList2.get(i10);
            i10++;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj3;
            if (longSparseIntArray.indexOfKey(tL_messages_stickerSet.set.id) < 0) {
                longSparseIntArray.append(tL_messages_stickerSet.set.id, 1);
                boolean z10 = tL_messages_stickerSet.set.id == hzVar.d;
                int i11 = oy.a;
                x51 J = x51.J(oy.class);
                long j3 = tL_messages_stickerSet.set.id;
                J.d = (int) ((j3 >>> 32) ^ j3);
                J.B = j3;
                J.G = tL_messages_stickerSet;
                J.e = z10;
                arrayList.add(J);
            }
        }
        ArrayList arrayList3 = hzVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            fy fyVar = (fy) obj4;
            TLRPC.StickerSet stickerSet = fyVar.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(oy.a(fyVar.a, fyVar, stickerSet.id == hzVar.d));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        float[] fArr = FragmentContextView.P0;
        fragmentContextView.z0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.V;
        org.telegram.ui.ActionBar.a1 a1Var = fragmentContextView.H;
        float floatValue = ((Float) obj).floatValue();
        a1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        g40 g40Var = (g40) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList(0);
        g40Var.c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(g40Var.a).history);
        if (g40Var.c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < g40Var.c.size(); i10++) {
            String str = (String) g40Var.c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(x51.c(i10 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(x51.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        ai.v8 v8Var;
        h40 h40Var = (h40) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = h40Var.O;
        int i10 = 0;
        boolean z10 = h40Var.P && (v8Var = h40Var.Q) != null && v8Var.i.size() > 0;
        if (z10) {
            ai.v8 v8Var2 = h40Var.Q;
            int i11 = gg.m1.a;
            x51 J = x51.J(gg.m1.class);
            J.G = v8Var2;
            arrayList.add(J);
        }
        h40Var.R = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            MessageObject messageObject = (MessageObject) arrayList2.get(i10);
            x51 x51Var = new x51(33);
            x51Var.d = i12;
            x51Var.G = messageObject;
            arrayList.add(x51Var);
            i10 = i12;
        }
        if (h40Var.S || !h40Var.V) {
            arrayList.add(x51.o(-2, 1));
            arrayList.add(x51.o(-3, 1));
            arrayList.add(x51.o(-4, 1));
        }
        if (h40Var.R || !z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new zp(h40Var, 20));
    }

    private final void g(Object obj, Object obj2) {
        y70 y70Var = (y70) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        a80 a80Var = y70Var.x;
        a80Var.f.setAlpha(1.0f);
        if (a80Var.u) {
            y70Var.c = bitmap;
        }
        fh.b bVar = a80Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            gh.d.c(a80Var.n, y70Var);
            ViewGroup viewGroup = a80Var.A;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    private final void h(Object obj, Object obj2) {
        lh0 lh0Var = (lh0) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = lh0Var.e;
        ArrayList arrayList3 = lh0Var.n;
        int i10 = 0;
        if (lh0Var.d == null) {
            arrayList.add(x51.o(-1, 7));
            arrayList.add(x51.o(-2, 7));
            arrayList.add(x51.o(-3, 7));
            lh0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(lh0Var.w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(x51.q(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                x51 x51Var = new x51(33);
                x51Var.G = (MessageObject) obj3;
                arrayList.add(x51Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(x51.q(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                x51 x51Var2 = new x51(33);
                x51Var2.G = (MessageObject) obj4;
                arrayList.add(x51Var2);
            }
        }
        if (lh0Var.v || ((lh0Var.M && !lh0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !lh0Var.s))) {
            arrayList.add(x51.o(lh0Var.L * 3, 7));
            arrayList.add(x51.o((lh0Var.L * 3) + 1, 7));
            arrayList.add(x51.o((lh0Var.L * 3) + 2, 7));
        }
        lh0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        om0 om0Var = (om0) this.b;
        om0Var.c = (Bitmap) obj;
        Paint paint = new Paint(1);
        om0Var.e = paint;
        Bitmap bitmap = om0Var.c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        om0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        om0Var.f = new Matrix();
        fh.b bVar = om0Var.h;
        bVar.a((Bitmap) obj2);
        gh.d.c(bVar, om0Var.s);
        ViewGroup viewGroup = om0Var.y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        hy0 hy0Var = (hy0) this.b;
        CharSequence charSequence = (CharSequence) obj;
        hy0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(hy0Var.S.set);
        tL_stickers_renameStickerSet.title = charSequence.toString();
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_renameStickerSet, new y1((Utilities.Callback) obj2, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:388:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0800 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x07b8  */
    @Override // org.telegram.messenger.Utilities.Callback2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj, Object obj2) {
        x51 a2;
        TL_iv.RichMessage richMessage;
        x51 a10;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        x51 a11;
        TL_iv.RichMessage richMessage3;
        String substring2;
        String substring3;
        boolean z10;
        String str2;
        MediaController.AudioEntry audioEntry;
        l61 l61Var;
        int i10;
        boolean z11;
        int i11 = this.a;
        String str3 = null;
        int i12 = 5;
        final int i13 = 0;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                e0 e0Var = (e0) obj3;
                ArrayList arrayList = (ArrayList) obj;
                l61 l61Var2 = (l61) obj2;
                boolean[] zArr = e0Var.p0;
                boolean[] zArr2 = e0Var.q0;
                d0 d0Var = e0Var.x0;
                arrayList.add(x51.B(null));
                arrayList.add(x51.l(e0Var.v0));
                arrayList.add(x51.B(null));
                l61Var2.E = 1;
                l61Var2.U();
                d0 d0Var2 = e0Var.w0;
                int selectedTab = d0Var2 != null ? d0Var2.getSelectedTab() : 0;
                int i14 = 6;
                int i15 = 7;
                if (selectedTab == 0) {
                    String str4 = e0Var.r0;
                    if (str4 == null || str4.equalsIgnoreCase(TranslateController.UNKNOWN_LANGUAGE)) {
                        arrayList.add(p41.b(3, LocaleController.getString(R.string.AIEditorOriginalText), null, null, null));
                    } else {
                        String E = k41.E(e0Var.r0, null, zArr2);
                        String string = LocaleController.getString((zArr2 == null || !zArr2[0]) ? R.string.AIEditorFromOther : R.string.AIEditorFrom);
                        int indexOf = string.indexOf("%s");
                        if (indexOf < 0) {
                            substring3 = "";
                            substring2 = substring3;
                        } else {
                            substring2 = string.substring(0, indexOf);
                            substring3 = string.substring(indexOf + 2);
                        }
                        if (TextUtils.isEmpty(substring2)) {
                            E = k41.y(E);
                        }
                        arrayList.add(p41.b(3, substring2, E, substring3, null));
                    }
                    arrayList.add(e0Var.i0() ? e0Var.j0(4, e0Var.Y, false) : t41.a(4, e0Var.X, e0Var.P0, new b(e0Var, 4), null, null));
                    String E2 = k41.E(e0Var.s0, zArr, null);
                    String string2 = LocaleController.getString((zArr == null || !zArr[0]) ? R.string.AIEditorToOther : R.string.AIEditorTo);
                    int indexOf2 = string2.indexOf("%s");
                    if (indexOf2 < 0) {
                        str = "";
                        substring = str;
                    } else {
                        String substring4 = string2.substring(0, indexOf2);
                        substring = string2.substring(indexOf2 + 2);
                        str = substring4;
                    }
                    if (TextUtils.isEmpty(str)) {
                        E2 = k41.y(E2);
                    }
                    arrayList.add(p41.a(5, str, v7.j.t(E2, ""), substring, new b(e0Var, i12), e0Var.t0, new b(e0Var, i14), null));
                    if (e0Var.i0()) {
                        boolean z12 = e0Var.Z;
                        if (z12 || (richMessage3 = e0Var.b0) == null) {
                            richMessage3 = e0Var.Y;
                        }
                        a11 = e0Var.j0(6, richMessage3, z12);
                    } else {
                        boolean z13 = e0Var.Z;
                        a11 = t41.a(z13 ? 7 : 6, e0Var.a0, false, null, null, !z13 ? new b(e0Var, i15) : null);
                    }
                    arrayList.add(a11);
                } else if (selectedTab == 1) {
                    arrayList.add(x51.k(d0Var));
                    if (d0Var.getSelectedTone() instanceof z) {
                        arrayList.add(x51.j(10, e0Var.z0));
                        l61Var2.T();
                        arrayList.add(x51.A(11, null));
                        l61Var2.U();
                    }
                    if ((d0Var.getSelectedTab() >= 0 || e0Var.t0) && (!(d0Var.getSelectedTone() instanceof z) || TextUtils.equals(e0Var.A0.getText().toString(), e0Var.I0))) {
                        arrayList.add(p41.a(7, LocaleController.getString(R.string.AIEditorResult), null, null, null, e0Var.t0, new b(e0Var, i14), null));
                        if (e0Var.i0()) {
                            boolean z14 = e0Var.c0;
                            if (z14 || (richMessage2 = e0Var.e0) == null) {
                                richMessage2 = e0Var.Y;
                            }
                            a10 = e0Var.j0(8, richMessage2, z14);
                        } else {
                            boolean z15 = e0Var.c0;
                            a10 = t41.a(z15 ? 7 : 6, e0Var.d0, false, null, null, !z15 ? new b(e0Var, i15) : null);
                        }
                        arrayList.add(a10);
                    } else {
                        arrayList.add(p41.a(5, LocaleController.getString(R.string.AIEditorOriginal), null, null, null, e0Var.t0, new b(e0Var, i14), null));
                        arrayList.add(e0Var.i0() ? e0Var.j0(6, e0Var.Y, false) : t41.a(e0Var.c0 ? 7 : 6, e0Var.X, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList.add(p41.b(3, LocaleController.getString(R.string.AIEditorOriginal), null, null, null));
                    arrayList.add(e0Var.i0() ? e0Var.j0(4, e0Var.Y, false) : t41.a(4, e0Var.X, e0Var.P0, new b(e0Var, 4), null, null));
                    arrayList.add(p41.b(5, LocaleController.getString(R.string.AIEditorResult), null, null, null));
                    if (e0Var.i0()) {
                        boolean z16 = e0Var.f0;
                        if (z16 || (richMessage = e0Var.h0) == null) {
                            richMessage = e0Var.Y;
                        }
                        a2 = e0Var.j0(6, richMessage, z16);
                    } else {
                        boolean z17 = e0Var.f0;
                        a2 = t41.a(z17 ? 7 : 6, e0Var.g0, false, null, null, !z17 ? new b(e0Var, i15) : null);
                    }
                    arrayList.add(a2);
                }
                l61Var2.T();
                arrayList.add(x51.B(null));
                break;
            case 1:
                q.R((q) obj3, (ArrayList) obj, (l61) obj2);
                break;
            case 2:
                y yVar = (y) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(x51.B(null));
                arrayList2.add(x51.l(yVar.X));
                arrayList2.add(x51.B(null));
                arrayList2.add(x51.k(yVar.a0));
                arrayList2.add(x51.B(null));
                arrayList2.add(x51.k(yVar.b0));
                arrayList2.add(x51.B(null));
                if (yVar.j0 != null) {
                    x51 e = x51.e(1, LocaleController.getString(R.string.AIEditorDeleteStyle));
                    e.r = true;
                    arrayList2.add(e);
                    arrayList2.add(x51.B(null));
                }
                arrayList2.add(x51.l(yVar.c0));
                break;
            case 3:
                ((g0) obj3).Q((ArrayList) obj, (l61) obj2);
                break;
            case 4:
                ((ChatActivityEnterView) obj3).f0((Canvas) obj, (Utilities.Callback0Return) obj2);
                break;
            case 5:
                ij ijVar = (ij) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                l61 l61Var3 = (l61) obj2;
                int i16 = ijVar.P;
                ArrayList arrayList4 = ijVar.M;
                MessagesController.SavedMusicList savedMusicList = ijVar.J;
                ArrayList arrayList5 = ijVar.K;
                HashSet hashSet = ijVar.I;
                ArrayList arrayList6 = ijVar.L;
                arrayList3.add(x51.D(-100, AndroidUtilities.dp(1.0f)));
                int size = arrayList3.size();
                if (TextUtils.isEmpty(ijVar.y)) {
                    l61Var3.U();
                    int i17 = 0;
                    while (i17 < ijVar.H.size()) {
                        MediaController.AudioEntry audioEntry2 = (MediaController.AudioEntry) ijVar.H.get(i17);
                        audioEntry2.messageObject.setQuery(str3);
                        x51 a12 = org.telegram.ui.Cells.i7.a(audioEntry2, new yi(ijVar, 0));
                        a12.K(hashSet.contains(audioEntry2));
                        a12.d = -1;
                        arrayList3.add(a12);
                        i17++;
                        str3 = null;
                    }
                    if (ijVar.G) {
                        arrayList3.add(x51.o(11, 4));
                        arrayList3.add(x51.o(12, 4));
                        arrayList3.add(x51.o(13, 4));
                    }
                    l61Var3.T();
                    if (savedMusicList != null) {
                        int size2 = savedMusicList.list.size();
                        if (size2 < arrayList5.size()) {
                            arrayList5.subList(size2, arrayList5.size()).clear();
                        }
                        int i18 = 0;
                        while (i18 < size2) {
                            if (i18 >= arrayList5.size()) {
                                audioEntry = new MediaController.AudioEntry();
                                arrayList5.add(audioEntry);
                            } else {
                                audioEntry = (MediaController.AudioEntry) arrayList5.get(i18);
                            }
                            if (audioEntry.messageObject != savedMusicList.list.get(i18)) {
                                MessageObject messageObject = savedMusicList.list.get(i18);
                                int i19 = ijVar.l0;
                                ijVar.l0 = i19 - 1;
                                l61Var = l61Var3;
                                i10 = i18;
                                audioEntry.id = i19;
                                audioEntry.messageObject = messageObject;
                            } else {
                                l61Var = l61Var3;
                                i10 = i18;
                            }
                            i18 = i10 + 1;
                            l61Var3 = l61Var;
                        }
                    }
                    l61 l61Var4 = l61Var3;
                    if (savedMusicList != null && arrayList5 != null && !arrayList5.isEmpty()) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(x51.A(-98, null));
                        }
                        l61Var4.U();
                        arrayList3.add(x51.s(45, LocaleController.getString(R.string.AudioSearchProfile)));
                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                            MediaController.AudioEntry audioEntry3 = (MediaController.AudioEntry) arrayList5.get(i20);
                            x51 a13 = org.telegram.ui.Cells.i7.a(audioEntry3, new yi(ijVar, 0));
                            a13.K(hashSet.contains(audioEntry3));
                            arrayList3.add(a13);
                        }
                        if (savedMusicList.loading) {
                            arrayList3.add(x51.o(41, 4));
                            arrayList3.add(x51.o(42, 4));
                            arrayList3.add(x51.o(43, 4));
                        }
                        if (!savedMusicList.loading && !savedMusicList.endReached) {
                            x51 c10 = x51.c(ijVar.R, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c10.q = true;
                            arrayList3.add(c10);
                        }
                        l61Var4.T();
                    }
                    if (arrayList6 != null && (!arrayList6.isEmpty() || ijVar.U >= 0 || ijVar.W)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(x51.A(-98, null));
                        }
                        l61Var4.U();
                        arrayList3.add(x51.s(((ijVar.U >= 0 || ijVar.W) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                            MediaController.AudioEntry audioEntry4 = (MediaController.AudioEntry) arrayList6.get(i21);
                            audioEntry4.messageObject.setQuery(ijVar.y);
                            x51 a14 = org.telegram.ui.Cells.i7.a(audioEntry4, new yi(ijVar, 0));
                            a14.K(hashSet.contains(audioEntry4));
                            arrayList3.add(a14);
                        }
                        if (ijVar.U >= 0 || ijVar.W) {
                            arrayList3.add(x51.o(21, 4));
                            arrayList3.add(x51.o(22, 4));
                            arrayList3.add(x51.o(23, 4));
                        }
                        if (ijVar.c0) {
                            x51 c11 = x51.c(i16, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c11.q = true;
                            arrayList3.add(c11);
                        }
                        l61Var4.T();
                    }
                } else {
                    String lowerCase = ijVar.y.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    boolean z18 = false;
                    for (int i22 = 0; i22 < ijVar.H.size(); i22++) {
                        MediaController.AudioEntry audioEntry5 = (MediaController.AudioEntry) ijVar.H.get(i22);
                        String str5 = audioEntry5.author;
                        if (str5 != null) {
                            String lowerCase2 = str5.toLowerCase();
                            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                            if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.f0.w(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe2)) {
                                z10 = true;
                                str2 = audioEntry5.title;
                                if (str2 == null) {
                                    String lowerCase3 = str2.toLowerCase();
                                    boolean z19 = z10;
                                    String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                                    z10 = z19 || lowerCase3.startsWith(lowerCase) || org.telegram.messenger.f0.w(" ", lowerCase, lowerCase3) || translitSafe3.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe3);
                                }
                                if (z10) {
                                    if (!z18) {
                                        if (arrayList3.size() > size) {
                                            arrayList3.add(x51.A(-97, null));
                                        }
                                        l61Var3.U();
                                        arrayList3.add(x51.s(10, LocaleController.getString(R.string.AudioSearchLocal)));
                                        z18 = true;
                                    }
                                    audioEntry5.messageObject.setQuery(ijVar.y);
                                    x51 a15 = org.telegram.ui.Cells.i7.a(audioEntry5, new yi(ijVar, 0));
                                    a15.K(hashSet.contains(audioEntry5));
                                    a15.d = 10;
                                    arrayList3.add(a15);
                                }
                            }
                        }
                        z10 = false;
                        str2 = audioEntry5.title;
                        if (str2 == null) {
                        }
                        if (z10) {
                        }
                    }
                    l61Var3.T();
                    if (arrayList6 != null && (!arrayList6.isEmpty() || ijVar.U >= 0 || ijVar.W)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(x51.A(-98, null));
                        }
                        l61Var3.U();
                        arrayList3.add(x51.s(((ijVar.U >= 0 || ijVar.W) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                            MediaController.AudioEntry audioEntry6 = (MediaController.AudioEntry) arrayList6.get(i23);
                            audioEntry6.messageObject.setQuery(ijVar.y);
                            x51 a16 = org.telegram.ui.Cells.i7.a(audioEntry6, new yi(ijVar, 0));
                            a16.K(hashSet.contains(audioEntry6));
                            arrayList3.add(a16);
                        }
                        if (ijVar.U >= 0 || ijVar.W) {
                            arrayList3.add(x51.o(21, 4));
                            arrayList3.add(x51.o(22, 4));
                            arrayList3.add(x51.o(23, 4));
                        }
                        if (ijVar.c0) {
                            x51 c12 = x51.c(i16, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c12.q = true;
                            arrayList3.add(c12);
                        }
                        l61Var3.T();
                    }
                    if (arrayList4 != null && (!arrayList4.isEmpty() || ijVar.d0 >= 0 || ijVar.m0)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(x51.A(-96, null));
                        }
                        l61Var3.U();
                        arrayList3.add(x51.s(((ijVar.d0 >= 0 || ijVar.m0) && arrayList4.isEmpty()) ? 35 : 30, LocaleController.getString(R.string.AudioSearchGlobal)));
                        int size3 = arrayList4.size();
                        for (int i24 = 0; i24 < size3; i24++) {
                            MediaController.AudioEntry audioEntry7 = (MediaController.AudioEntry) arrayList4.get(i24);
                            audioEntry7.messageObject.setQuery(ijVar.y);
                            x51 a17 = org.telegram.ui.Cells.i7.a(audioEntry7, new yi(ijVar, 0));
                            a17.K(hashSet.contains(audioEntry7));
                            arrayList3.add(a17);
                        }
                        if (ijVar.d0 >= 0 || ijVar.m0) {
                            arrayList3.add(x51.o(31, 4));
                            arrayList3.add(x51.o(32, 4));
                            arrayList3.add(x51.o(33, 4));
                        }
                        if (ijVar.g0) {
                            x51 c13 = x51.c(ijVar.Q, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c13.q = true;
                            arrayList3.add(c13);
                        }
                        l61Var3.T();
                    }
                }
                if (arrayList3.size() <= size && !ijVar.G) {
                    if (TextUtils.isEmpty(ijVar.y)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFiles);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i25 = gj.a;
                        x51 J = x51.J(gj.class);
                        J.l = string3;
                        J.m = string4;
                        arrayList3.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(ijVar.y.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, ijVar.y));
                        int i26 = gj.a;
                        x51 J2 = x51.J(gj.class);
                        J2.l = string5;
                        J2.m = replaceTags;
                        arrayList3.add(J2);
                    }
                }
                arrayList3.add(x51.A(-99, null));
                break;
            case 6:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                boolean z20 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.getClass();
                ((Runnable) obj2).run();
                chatAttachAlertPhotoLayout.setStarsPrice(((Long) obj).longValue());
                break;
            case 7:
                or.R((or) obj3, (ArrayList) obj);
                break;
            case 8:
                final ts tsVar = (ts) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                int i27 = tsVar.N;
                y2 y2Var = tsVar.h0;
                ArrayList arrayList8 = tsVar.T;
                ss ssVar = tsVar.Q;
                boolean z21 = tsVar.P;
                HashSet hashSet2 = new HashSet();
                if (TextUtils.isEmpty(tsVar.e0)) {
                    ArrayList<TLRPC.TL_topPeer> arrayList9 = MediaDataController.getInstance(i27).webapps;
                    ArrayList arrayList10 = new ArrayList();
                    if (arrayList9 != null) {
                        for (int i28 = 0; i28 < arrayList9.size(); i28++) {
                            TLRPC.User user = MessagesController.getInstance(i27).getUser(Long.valueOf(DialogObject.getPeerDialogId(arrayList9.get(i28).peer)));
                            if (user != null && user.bot) {
                                arrayList10.add(user);
                            }
                        }
                    }
                    tsVar.X = arrayList7.size();
                    if (!arrayList10.isEmpty() && !z21) {
                        if (arrayList10.size() > 5) {
                            final int i29 = 1;
                            arrayList7.add(x51.r(LocaleController.getString(R.string.SearchAppsMine), LocaleController.getString(tsVar.U ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.qs
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i29) {
                                        case 0:
                                            ts tsVar2 = tsVar;
                                            tsVar2.V = !tsVar2.V;
                                            tsVar2.N(true);
                                            break;
                                        default:
                                            ts tsVar3 = tsVar;
                                            tsVar3.U = !tsVar3.U;
                                            tsVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList7.add(x51.q(LocaleController.getString(R.string.SearchAppsMine)));
                        }
                        for (int i30 = 0; i30 < arrayList10.size() && (i30 < 5 || tsVar.U); i30++) {
                            TLRPC.User user2 = (TLRPC.User) arrayList10.get(i30);
                            if (!hashSet2.contains(Long.valueOf(user2.id))) {
                                hashSet2.add(Long.valueOf(user2.id));
                                x51 v = x51.v(user2);
                                v.q = true;
                                v.t = true;
                                v.H = y2Var;
                                arrayList7.add(v);
                            }
                        }
                    }
                    hashSet2.clear();
                    tsVar.Y = arrayList7.size();
                    ArrayList arrayList11 = ssVar.h;
                    if (arrayList11.isEmpty()) {
                        if (ssVar.c || !ssVar.e) {
                            if (!z21) {
                                arrayList7.add(x51.n(30));
                            }
                            arrayList7.add(x51.n(29));
                            arrayList7.add(x51.n(29));
                            arrayList7.add(x51.n(29));
                            arrayList7.add(x51.n(29));
                        }
                        z11 = false;
                    } else {
                        if (!z21) {
                            arrayList7.add(x51.q(LocaleController.getString(R.string.SearchAppsPopular)));
                        }
                        boolean z22 = false;
                        for (int i31 = 0; i31 < arrayList11.size(); i31++) {
                            TLRPC.User user3 = (TLRPC.User) arrayList11.get(i31);
                            if (!hashSet2.contains(Long.valueOf(user3.id))) {
                                hashSet2.add(Long.valueOf(user3.id));
                                x51 v9 = x51.v(user3);
                                v9.q = true;
                                v9.r = true;
                                v9.t = true;
                                v9.H = y2Var;
                                arrayList7.add(v9);
                                z22 = true;
                            }
                        }
                        if (ssVar.c || !ssVar.e) {
                            arrayList7.add(x51.n(29));
                            arrayList7.add(x51.n(29));
                            arrayList7.add(x51.n(29));
                        }
                        z11 = z22;
                    }
                    if (z11) {
                        arrayList7.add(x51.B(tsVar.W));
                        break;
                    }
                } else {
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.addAll(tsVar.R);
                    arrayList12.addAll(tsVar.S);
                    if (!arrayList12.isEmpty()) {
                        if (arrayList12.size() <= 5 || arrayList8.isEmpty() || z21) {
                            arrayList7.add(x51.q(LocaleController.getString(R.string.SearchApps)));
                        } else {
                            final int i32 = 0;
                            arrayList7.add(x51.r(LocaleController.getString(R.string.SearchApps), LocaleController.getString(tsVar.V ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.qs
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i32) {
                                        case 0:
                                            ts tsVar2 = tsVar;
                                            tsVar2.V = !tsVar2.V;
                                            tsVar2.N(true);
                                            break;
                                        default:
                                            ts tsVar3 = tsVar;
                                            tsVar3.U = !tsVar3.U;
                                            tsVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        }
                        int size4 = arrayList12.size();
                        if (!tsVar.V && !arrayList8.isEmpty() && !z21) {
                            size4 = Math.min(5, size4);
                        }
                        for (int i33 = 0; i33 < size4; i33++) {
                            x51 v10 = x51.v((TLObject) arrayList12.get(i33));
                            v10.t = true;
                            v10.H = y2Var;
                            arrayList7.add(v10);
                        }
                    }
                    if (!arrayList8.isEmpty() && !z21) {
                        arrayList7.add(x51.q(LocaleController.getString(R.string.SearchMessages)));
                        int size5 = arrayList8.size();
                        int i34 = 0;
                        while (i34 < size5) {
                            Object obj4 = arrayList8.get(i34);
                            i34++;
                            x51 x51Var = new x51(33);
                            x51Var.G = (MessageObject) obj4;
                            arrayList7.add(x51Var);
                        }
                        if (tsVar.b0) {
                            arrayList7.add(x51.n(1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                final io0 io0Var = (io0) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                ArrayList arrayList14 = io0Var.P;
                ArrayList arrayList15 = io0Var.V;
                int i35 = io0Var.N;
                if (TextUtils.isEmpty(io0Var.b0)) {
                    if (arrayList15 != null && !arrayList15.isEmpty()) {
                        if (arrayList15.size() > 5) {
                            arrayList13.add(x51.r(LocaleController.getString(R.string.SearchMyChannels), LocaleController.getString(io0Var.U ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.us
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i13) {
                                        case 0:
                                            io0 io0Var2 = io0Var;
                                            io0Var2.U = !io0Var2.U;
                                            io0Var2.N(true);
                                            if (io0Var2.U) {
                                                AndroidUtilities.hideKeyboard(io0Var2.d0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            io0 io0Var3 = io0Var;
                                            io0Var3.T = !io0Var3.T;
                                            io0Var3.N(true);
                                            if (io0Var3.T) {
                                                AndroidUtilities.hideKeyboard(io0Var3.d0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList13.add(x51.q(LocaleController.getString(R.string.SearchMyChannels)));
                        }
                        int size6 = arrayList15.size();
                        if (!io0Var.U) {
                            size6 = Math.min(5, size6);
                        }
                        for (int i36 = 0; i36 < size6; i36++) {
                            x51 v11 = x51.v((TLObject) arrayList15.get(i36));
                            v11.I = true;
                            arrayList13.add(v11);
                        }
                    }
                    MessagesController.ChannelRecommendations cachedChannelRecommendations = MessagesController.getInstance(i35).getCachedChannelRecommendations(0L);
                    if (cachedChannelRecommendations != null) {
                        ArrayList arrayList16 = new ArrayList();
                        ArrayList<TLObject> arrayList17 = cachedChannelRecommendations.chats;
                        int size7 = arrayList17.size();
                        int i37 = 0;
                        while (i37 < size7) {
                            TLObject tLObject = arrayList17.get(i37);
                            i37++;
                            TLObject tLObject2 = tLObject;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                                TLRPC.Chat chat2 = MessagesController.getInstance(i35).getChat(Long.valueOf(chat.id));
                                if (ChatObject.isNotInChat(chat) && (chat2 == null || ChatObject.isNotInChat(chat2))) {
                                    arrayList16.add(chat);
                                }
                            }
                        }
                        if (!arrayList16.isEmpty()) {
                            arrayList13.add(x51.q(LocaleController.getString(R.string.SearchRecommendedChannels)));
                        }
                        int size8 = arrayList16.size();
                        while (i13 < size8) {
                            Object obj5 = arrayList16.get(i13);
                            i13++;
                            arrayList13.add(x51.v((TLRPC.Chat) obj5));
                        }
                        break;
                    } else {
                        arrayList13.add(x51.n(30));
                        arrayList13.add(x51.n(29));
                        arrayList13.add(x51.n(29));
                        arrayList13.add(x51.n(29));
                        arrayList13.add(x51.n(29));
                        break;
                    }
                } else {
                    ArrayList arrayList18 = new ArrayList();
                    ArrayList arrayList19 = io0Var.Q;
                    int size9 = arrayList19.size();
                    int i38 = 0;
                    while (i38 < size9) {
                        Object obj6 = arrayList19.get(i38);
                        i38++;
                        TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
                        TLRPC.Chat chat4 = MessagesController.getInstance(i35).getChat(Long.valueOf(chat3.id));
                        if (ChatObject.isNotInChat(chat3) && (chat4 == null || ChatObject.isNotInChat(chat4))) {
                            arrayList18.add(chat3);
                        }
                    }
                    ArrayList arrayList20 = io0Var.R;
                    int size10 = arrayList20.size();
                    int i39 = 0;
                    while (i39 < size10) {
                        Object obj7 = arrayList20.get(i39);
                        i39++;
                        TLRPC.Chat chat5 = (TLRPC.Chat) obj7;
                        TLRPC.Chat chat6 = MessagesController.getInstance(i35).getChat(Long.valueOf(chat5.id));
                        if (ChatObject.isNotInChat(chat5) && (chat6 == null || ChatObject.isNotInChat(chat6))) {
                            arrayList18.add(chat5);
                        }
                    }
                    ArrayList arrayList21 = io0Var.S;
                    int size11 = arrayList21.size();
                    int i40 = 0;
                    while (i40 < size11) {
                        Object obj8 = arrayList21.get(i40);
                        i40++;
                        TLRPC.Chat chat7 = (TLRPC.Chat) obj8;
                        TLRPC.Chat chat8 = MessagesController.getInstance(i35).getChat(Long.valueOf(chat7.id));
                        if (ChatObject.isNotInChat(chat7) && (chat8 == null || ChatObject.isNotInChat(chat8))) {
                            arrayList18.add(chat7);
                        }
                    }
                    if (!arrayList18.isEmpty()) {
                        if (arrayList18.size() <= 5 || arrayList14.isEmpty()) {
                            arrayList13.add(x51.q(LocaleController.getString(R.string.SearchChannels)));
                        } else {
                            final int i41 = 1;
                            arrayList13.add(x51.r(LocaleController.getString(R.string.SearchChannels), LocaleController.getString(io0Var.T ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.us
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i41) {
                                        case 0:
                                            io0 io0Var2 = io0Var;
                                            io0Var2.U = !io0Var2.U;
                                            io0Var2.N(true);
                                            if (io0Var2.U) {
                                                AndroidUtilities.hideKeyboard(io0Var2.d0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            io0 io0Var3 = io0Var;
                                            io0Var3.T = !io0Var3.T;
                                            io0Var3.N(true);
                                            if (io0Var3.T) {
                                                AndroidUtilities.hideKeyboard(io0Var3.d0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        }
                        int size12 = arrayList18.size();
                        if (!io0Var.T && !arrayList14.isEmpty()) {
                            size12 = Math.min(5, size12);
                        }
                        for (int i42 = 0; i42 < size12; i42++) {
                            arrayList13.add(x51.v((TLObject) arrayList18.get(i42)));
                        }
                    }
                    if (!arrayList14.isEmpty()) {
                        arrayList13.add(x51.q(LocaleController.getString(R.string.SearchMessages)));
                        int size13 = arrayList14.size();
                        int i43 = 0;
                        while (i43 < size13) {
                            Object obj9 = arrayList14.get(i43);
                            i43++;
                            x51 x51Var2 = new x51(33);
                            x51Var2.G = (MessageObject) obj9;
                            arrayList13.add(x51Var2);
                        }
                        if (io0Var.Y) {
                            arrayList13.add(x51.n(1));
                            break;
                        }
                    }
                }
                break;
            case 10:
                a(obj, obj2);
                break;
            case 11:
                b(obj, obj2);
                break;
            case 12:
                c(obj, obj2);
                break;
            case 13:
                d(obj, obj2);
                break;
            case 14:
                ((ArrayList) obj).add(x51.j(-1, ((z30) obj3).X));
                break;
            case 15:
                e(obj, obj2);
                break;
            case 16:
                f(obj, obj2);
                break;
            case 17:
                g(obj, obj2);
                break;
            case 18:
                h(obj, obj2);
                break;
            case 19:
                i(obj, obj2);
                break;
            case 20:
                j(obj, obj2);
                break;
            case 21:
                k41.p((k41) obj3, (String) obj, (Boolean) obj2);
                break;
            default:
                ((o61) obj3).U((ArrayList) obj, (l61) obj2);
                break;
        }
    }
}
