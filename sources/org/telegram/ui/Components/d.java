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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(Object obj, Object obj2) {
        nz nzVar = (nz) this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        wy wyVar = nzVar.R1;
        if (wyVar == null || !(wyVar.getDrawable() instanceof CompoundEmoji.CompoundEmojiDrawable)) {
            return;
        }
        ((CompoundEmoji.CompoundEmojiDrawable) nzVar.R1.getDrawable()).update(num.intValue(), num2.intValue());
        String str = (String) nzVar.R1.getTag();
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
        ny nyVar = (ny) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = nyVar.s;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayList2.get(i10);
            i10++;
            gy gyVar = (gy) obj3;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = gyVar.b;
            if (tL_messages_stickerSet != null) {
                boolean z10 = tL_messages_stickerSet.set.id == nyVar.d;
                int i11 = py.a;
                h61 K = h61.K(py.class);
                long j3 = tL_messages_stickerSet.set.id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.B = j3;
                K.G = tL_messages_stickerSet;
                K.e = z10;
                arrayList.add(K);
            } else {
                TLRPC.StickerSetCovered stickerSetCovered = gyVar.a;
                if (stickerSetCovered != null) {
                    arrayList.add(py.a(stickerSetCovered, gyVar, stickerSetCovered.set.id == nyVar.d));
                }
            }
        }
    }

    private final void c(Object obj, Object obj2) {
        iz izVar = (iz) this.b;
        ArrayList arrayList = (ArrayList) obj;
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        ArrayList arrayList2 = izVar.E;
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
                boolean z10 = tL_messages_stickerSet.set.id == izVar.d;
                int i11 = py.a;
                h61 K = h61.K(py.class);
                long j3 = tL_messages_stickerSet.set.id;
                K.d = (int) ((j3 >>> 32) ^ j3);
                K.B = j3;
                K.G = tL_messages_stickerSet;
                K.e = z10;
                arrayList.add(K);
            }
        }
        ArrayList arrayList3 = izVar.J;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj4 = arrayList3.get(i12);
            i12++;
            gy gyVar = (gy) obj4;
            TLRPC.StickerSet stickerSet = gyVar.c;
            if (longSparseIntArray.indexOfKey(stickerSet.id) < 0) {
                longSparseIntArray.append(stickerSet.id, 1);
                arrayList.add(py.a(gyVar.a, gyVar, stickerSet.id == izVar.d));
            }
        }
    }

    private final void d(Object obj, Object obj2) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.b;
        float[] fArr = FragmentContextView.P0;
        fragmentContextView.z0 = !((Boolean) obj2).booleanValue();
        MediaController mediaController = MediaController.getInstance();
        boolean z10 = fragmentContextView.V;
        org.telegram.ui.ActionBar.b1 b1Var = fragmentContextView.H;
        float floatValue = ((Float) obj).floatValue();
        b1Var.getClass();
        mediaController.setPlaybackSpeed(z10, (floatValue * 2.8f) + 0.2f);
    }

    private final void e(Object obj, Object obj2) {
        h40 h40Var = (h40) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = new ArrayList(0);
        h40Var.c = arrayList2;
        arrayList2.addAll(HashtagSearchController.getInstance(h40Var.a).history);
        if (h40Var.c.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < h40Var.c.size(); i10++) {
            String str = (String) h40Var.c.get(i10);
            if (str.startsWith("#") || str.startsWith("$")) {
                arrayList.add(h61.c(i10 + 1, str.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str.substring(1)));
            }
        }
        arrayList.add(h61.c(0, R.drawable.msg_clear_recent, LocaleController.getString(R.string.ClearHistory)));
    }

    private final void f(Object obj, Object obj2) {
        ai.v8 v8Var;
        i40 i40Var = (i40) this.b;
        ArrayList arrayList = (ArrayList) obj;
        ArrayList arrayList2 = i40Var.O;
        int i10 = 0;
        boolean z10 = i40Var.P && (v8Var = i40Var.Q) != null && v8Var.i.size() > 0;
        if (z10) {
            ai.v8 v8Var2 = i40Var.Q;
            int i11 = gg.m1.a;
            h61 K = h61.K(gg.m1.class);
            K.G = v8Var2;
            arrayList.add(K);
        }
        i40Var.R = z10;
        while (i10 < arrayList2.size()) {
            int i12 = i10 + 1;
            MessageObject messageObject = (MessageObject) arrayList2.get(i10);
            h61 h61Var = new h61(33);
            h61Var.d = i12;
            h61Var.G = messageObject;
            arrayList.add(h61Var);
            i10 = i12;
        }
        if (i40Var.S || !i40Var.V) {
            arrayList.add(h61.q(-2, 1));
            arrayList.add(h61.q(-3, 1));
            arrayList.add(h61.q(-4, 1));
        }
        if (i40Var.R || !z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new aq(i40Var, 20));
    }

    private final void g(Object obj, Object obj2) {
        z70 z70Var = (z70) this.b;
        Bitmap bitmap = (Bitmap) obj;
        Bitmap bitmap2 = (Bitmap) obj2;
        b80 b80Var = z70Var.x;
        b80Var.f.setAlpha(1.0f);
        if (b80Var.u) {
            z70Var.c = bitmap;
        }
        fh.b bVar = b80Var.n;
        if (bVar != null) {
            bVar.a(bitmap2);
            gh.d.c(b80Var.n, z70Var);
            ViewGroup viewGroup = b80Var.A;
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
            arrayList.add(h61.q(-1, 7));
            arrayList.add(h61.q(-2, 7));
            arrayList.add(h61.q(-3, 7));
            lh0Var.Q = false;
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(lh0Var.w);
        if (isEmpty) {
            if (!arrayList2.isEmpty()) {
                arrayList.add(h61.r(LocaleController.getString(R.string.SearchPostsHeaderNews)));
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj3 = arrayList2.get(i10);
                i10++;
                h61 h61Var = new h61(33);
                h61Var.G = (MessageObject) obj3;
                arrayList.add(h61Var);
            }
        } else {
            if (!arrayList3.isEmpty()) {
                arrayList.add(h61.r(LocaleController.getString(R.string.SearchPostsHeaderFound)));
            }
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj4 = arrayList3.get(i10);
                i10++;
                h61 h61Var2 = new h61(33);
                h61Var2.G = (MessageObject) obj4;
                arrayList.add(h61Var2);
            }
        }
        if (lh0Var.v || ((lh0Var.M && !lh0Var.N) || (!isEmpty && !arrayList3.isEmpty() && !lh0Var.s))) {
            arrayList.add(h61.q(lh0Var.L * 3, 7));
            arrayList.add(h61.q((lh0Var.L * 3) + 1, 7));
            arrayList.add(h61.q((lh0Var.L * 3) + 2, 7));
        }
        lh0Var.Q = arrayList.isEmpty();
    }

    private final void i(Object obj, Object obj2) {
        sm0 sm0Var = (sm0) this.b;
        sm0Var.c = (Bitmap) obj;
        Paint paint = new Paint(1);
        sm0Var.e = paint;
        Bitmap bitmap = sm0Var.c;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        sm0Var.d = bitmapShader;
        paint.setShader(bitmapShader);
        sm0Var.f = new Matrix();
        fh.b bVar = sm0Var.h;
        bVar.a((Bitmap) obj2);
        gh.d.c(bVar, sm0Var.s);
        ViewGroup viewGroup = sm0Var.y;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    private final void j(Object obj, Object obj2) {
        ry0 ry0Var = (ry0) this.b;
        CharSequence charSequence = (CharSequence) obj;
        ry0Var.h.setText(charSequence);
        TLRPC.TL_stickers_renameStickerSet tL_stickers_renameStickerSet = new TLRPC.TL_stickers_renameStickerSet();
        tL_stickers_renameStickerSet.stickerset = MediaDataController.getInputStickerSet(ry0Var.S.set);
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
        h61 a2;
        TL_iv.RichMessage richMessage;
        h61 a10;
        TL_iv.RichMessage richMessage2;
        String substring;
        String str;
        h61 a11;
        TL_iv.RichMessage richMessage3;
        String substring2;
        String substring3;
        boolean z10;
        String str2;
        MediaController.AudioEntry audioEntry;
        w61 w61Var;
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
                w61 w61Var2 = (w61) obj2;
                boolean[] zArr = e0Var.p0;
                boolean[] zArr2 = e0Var.q0;
                d0 d0Var = e0Var.x0;
                arrayList.add(h61.C(null));
                arrayList.add(h61.m(e0Var.v0));
                arrayList.add(h61.C(null));
                w61Var2.E = 1;
                w61Var2.U();
                d0 d0Var2 = e0Var.w0;
                int selectedTab = d0Var2 != null ? d0Var2.getSelectedTab() : 0;
                int i14 = 6;
                int i15 = 7;
                if (selectedTab == 0) {
                    String str4 = e0Var.r0;
                    if (str4 == null || str4.equalsIgnoreCase(TranslateController.UNKNOWN_LANGUAGE)) {
                        arrayList.add(z41.b(3, LocaleController.getString(R.string.AIEditorOriginalText), null, null, null));
                    } else {
                        String C = u41.C(e0Var.r0, null, zArr2);
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
                            C = u41.y(C);
                        }
                        arrayList.add(z41.b(3, substring2, C, substring3, null));
                    }
                    arrayList.add(e0Var.i0() ? e0Var.j0(4, e0Var.Y, false) : d51.a(4, e0Var.X, e0Var.P0, new b(e0Var, 4), null, null));
                    String C2 = u41.C(e0Var.s0, zArr, null);
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
                        C2 = u41.y(C2);
                    }
                    arrayList.add(z41.a(5, str, sa.e.v(C2, ""), substring, new b(e0Var, i12), e0Var.t0, new b(e0Var, i14), null));
                    if (e0Var.i0()) {
                        boolean z12 = e0Var.Z;
                        if (z12 || (richMessage3 = e0Var.b0) == null) {
                            richMessage3 = e0Var.Y;
                        }
                        a11 = e0Var.j0(6, richMessage3, z12);
                    } else {
                        boolean z13 = e0Var.Z;
                        a11 = d51.a(z13 ? 7 : 6, e0Var.a0, false, null, null, !z13 ? new b(e0Var, i15) : null);
                    }
                    arrayList.add(a11);
                } else if (selectedTab == 1) {
                    arrayList.add(h61.k(d0Var));
                    if (d0Var.getSelectedTone() instanceof z) {
                        arrayList.add(h61.j(10, e0Var.z0));
                        w61Var2.T();
                        arrayList.add(h61.B(11, null));
                        w61Var2.U();
                    }
                    if ((d0Var.getSelectedTab() >= 0 || e0Var.t0) && (!(d0Var.getSelectedTone() instanceof z) || TextUtils.equals(e0Var.A0.getText().toString(), e0Var.I0))) {
                        arrayList.add(z41.a(7, LocaleController.getString(R.string.AIEditorResult), null, null, null, e0Var.t0, new b(e0Var, i14), null));
                        if (e0Var.i0()) {
                            boolean z14 = e0Var.c0;
                            if (z14 || (richMessage2 = e0Var.e0) == null) {
                                richMessage2 = e0Var.Y;
                            }
                            a10 = e0Var.j0(8, richMessage2, z14);
                        } else {
                            boolean z15 = e0Var.c0;
                            a10 = d51.a(z15 ? 7 : 6, e0Var.d0, false, null, null, !z15 ? new b(e0Var, i15) : null);
                        }
                        arrayList.add(a10);
                    } else {
                        arrayList.add(z41.a(5, LocaleController.getString(R.string.AIEditorOriginal), null, null, null, e0Var.t0, new b(e0Var, i14), null));
                        arrayList.add(e0Var.i0() ? e0Var.j0(6, e0Var.Y, false) : d51.a(e0Var.c0 ? 7 : 6, e0Var.X, false, null, null, null));
                    }
                } else if (selectedTab == 2) {
                    arrayList.add(z41.b(3, LocaleController.getString(R.string.AIEditorOriginal), null, null, null));
                    arrayList.add(e0Var.i0() ? e0Var.j0(4, e0Var.Y, false) : d51.a(4, e0Var.X, e0Var.P0, new b(e0Var, 4), null, null));
                    arrayList.add(z41.b(5, LocaleController.getString(R.string.AIEditorResult), null, null, null));
                    if (e0Var.i0()) {
                        boolean z16 = e0Var.f0;
                        if (z16 || (richMessage = e0Var.h0) == null) {
                            richMessage = e0Var.Y;
                        }
                        a2 = e0Var.j0(6, richMessage, z16);
                    } else {
                        boolean z17 = e0Var.f0;
                        a2 = d51.a(z17 ? 7 : 6, e0Var.g0, false, null, null, !z17 ? new b(e0Var, i15) : null);
                    }
                    arrayList.add(a2);
                }
                w61Var2.T();
                arrayList.add(h61.C(null));
                break;
            case 1:
                q.P((q) obj3, (ArrayList) obj, (w61) obj2);
                break;
            case 2:
                y yVar = (y) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                arrayList2.add(h61.C(null));
                arrayList2.add(h61.m(yVar.X));
                arrayList2.add(h61.C(null));
                arrayList2.add(h61.k(yVar.a0));
                arrayList2.add(h61.C(null));
                arrayList2.add(h61.k(yVar.b0));
                arrayList2.add(h61.C(null));
                if (yVar.j0 != null) {
                    h61 e7 = h61.e(1, LocaleController.getString(R.string.AIEditorDeleteStyle));
                    e7.r = true;
                    arrayList2.add(e7);
                    arrayList2.add(h61.C(null));
                }
                arrayList2.add(h61.m(yVar.c0));
                break;
            case 3:
                ((g0) obj3).O((ArrayList) obj, (w61) obj2);
                break;
            case 4:
                ((ChatActivityEnterView) obj3).f0((Canvas) obj, (Utilities.Callback0Return) obj2);
                break;
            case 5:
                jj jjVar = (jj) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                w61 w61Var3 = (w61) obj2;
                int i16 = jjVar.P;
                ArrayList arrayList4 = jjVar.M;
                MessagesController.SavedMusicList savedMusicList = jjVar.J;
                ArrayList arrayList5 = jjVar.K;
                HashSet hashSet = jjVar.I;
                ArrayList arrayList6 = jjVar.L;
                arrayList3.add(h61.E(-100, AndroidUtilities.dp(1.0f)));
                int size = arrayList3.size();
                if (TextUtils.isEmpty(jjVar.y)) {
                    w61Var3.U();
                    int i17 = 0;
                    while (i17 < jjVar.H.size()) {
                        MediaController.AudioEntry audioEntry2 = (MediaController.AudioEntry) jjVar.H.get(i17);
                        audioEntry2.messageObject.setQuery(str3);
                        h61 a12 = org.telegram.ui.Cells.i7.a(audioEntry2, new zi(jjVar, 0));
                        a12.L(hashSet.contains(audioEntry2));
                        a12.d = -1;
                        arrayList3.add(a12);
                        i17++;
                        str3 = null;
                    }
                    if (jjVar.G) {
                        arrayList3.add(h61.q(11, 4));
                        arrayList3.add(h61.q(12, 4));
                        arrayList3.add(h61.q(13, 4));
                    }
                    w61Var3.T();
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
                                int i19 = jjVar.l0;
                                jjVar.l0 = i19 - 1;
                                w61Var = w61Var3;
                                i10 = i18;
                                audioEntry.id = i19;
                                audioEntry.messageObject = messageObject;
                            } else {
                                w61Var = w61Var3;
                                i10 = i18;
                            }
                            i18 = i10 + 1;
                            w61Var3 = w61Var;
                        }
                    }
                    w61 w61Var4 = w61Var3;
                    if (savedMusicList != null && arrayList5 != null && !arrayList5.isEmpty()) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(h61.B(-98, null));
                        }
                        w61Var4.U();
                        arrayList3.add(h61.t(45, LocaleController.getString(R.string.AudioSearchProfile)));
                        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                            MediaController.AudioEntry audioEntry3 = (MediaController.AudioEntry) arrayList5.get(i20);
                            h61 a13 = org.telegram.ui.Cells.i7.a(audioEntry3, new zi(jjVar, 0));
                            a13.L(hashSet.contains(audioEntry3));
                            arrayList3.add(a13);
                        }
                        if (savedMusicList.loading) {
                            arrayList3.add(h61.q(41, 4));
                            arrayList3.add(h61.q(42, 4));
                            arrayList3.add(h61.q(43, 4));
                        }
                        if (!savedMusicList.loading && !savedMusicList.endReached) {
                            h61 c10 = h61.c(jjVar.R, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c10.q = true;
                            arrayList3.add(c10);
                        }
                        w61Var4.T();
                    }
                    if (arrayList6 != null && (!arrayList6.isEmpty() || jjVar.U >= 0 || jjVar.W)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(h61.B(-98, null));
                        }
                        w61Var4.U();
                        arrayList3.add(h61.t(((jjVar.U >= 0 || jjVar.W) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                            MediaController.AudioEntry audioEntry4 = (MediaController.AudioEntry) arrayList6.get(i21);
                            audioEntry4.messageObject.setQuery(jjVar.y);
                            h61 a14 = org.telegram.ui.Cells.i7.a(audioEntry4, new zi(jjVar, 0));
                            a14.L(hashSet.contains(audioEntry4));
                            arrayList3.add(a14);
                        }
                        if (jjVar.U >= 0 || jjVar.W) {
                            arrayList3.add(h61.q(21, 4));
                            arrayList3.add(h61.q(22, 4));
                            arrayList3.add(h61.q(23, 4));
                        }
                        if (jjVar.c0) {
                            h61 c11 = h61.c(i16, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c11.q = true;
                            arrayList3.add(c11);
                        }
                        w61Var4.T();
                    }
                } else {
                    String lowerCase = jjVar.y.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    boolean z18 = false;
                    for (int i22 = 0; i22 < jjVar.H.size(); i22++) {
                        MediaController.AudioEntry audioEntry5 = (MediaController.AudioEntry) jjVar.H.get(i22);
                        String str5 = audioEntry5.author;
                        if (str5 != null) {
                            String lowerCase2 = str5.toLowerCase();
                            String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                            if (lowerCase2.startsWith(lowerCase) || org.telegram.messenger.bi.u(" ", lowerCase, lowerCase2) || translitSafe2.startsWith(translitSafe) || org.telegram.messenger.bi.u(" ", translitSafe, translitSafe2)) {
                                z10 = true;
                                str2 = audioEntry5.title;
                                if (str2 == null) {
                                    String lowerCase3 = str2.toLowerCase();
                                    boolean z19 = z10;
                                    String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                                    z10 = z19 || lowerCase3.startsWith(lowerCase) || org.telegram.messenger.bi.u(" ", lowerCase, lowerCase3) || translitSafe3.startsWith(translitSafe) || org.telegram.messenger.bi.u(" ", translitSafe, translitSafe3);
                                }
                                if (z10) {
                                    if (!z18) {
                                        if (arrayList3.size() > size) {
                                            arrayList3.add(h61.B(-97, null));
                                        }
                                        w61Var3.U();
                                        arrayList3.add(h61.t(10, LocaleController.getString(R.string.AudioSearchLocal)));
                                        z18 = true;
                                    }
                                    audioEntry5.messageObject.setQuery(jjVar.y);
                                    h61 a15 = org.telegram.ui.Cells.i7.a(audioEntry5, new zi(jjVar, 0));
                                    a15.L(hashSet.contains(audioEntry5));
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
                    w61Var3.T();
                    if (arrayList6 != null && (!arrayList6.isEmpty() || jjVar.U >= 0 || jjVar.W)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(h61.B(-98, null));
                        }
                        w61Var3.U();
                        arrayList3.add(h61.t(((jjVar.U >= 0 || jjVar.W) && arrayList6.isEmpty()) ? 25 : 20, LocaleController.getString(R.string.AudioSearchChats)));
                        for (int i23 = 0; i23 < arrayList6.size(); i23++) {
                            MediaController.AudioEntry audioEntry6 = (MediaController.AudioEntry) arrayList6.get(i23);
                            audioEntry6.messageObject.setQuery(jjVar.y);
                            h61 a16 = org.telegram.ui.Cells.i7.a(audioEntry6, new zi(jjVar, 0));
                            a16.L(hashSet.contains(audioEntry6));
                            arrayList3.add(a16);
                        }
                        if (jjVar.U >= 0 || jjVar.W) {
                            arrayList3.add(h61.q(21, 4));
                            arrayList3.add(h61.q(22, 4));
                            arrayList3.add(h61.q(23, 4));
                        }
                        if (jjVar.c0) {
                            h61 c12 = h61.c(i16, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c12.q = true;
                            arrayList3.add(c12);
                        }
                        w61Var3.T();
                    }
                    if (arrayList4 != null && (!arrayList4.isEmpty() || jjVar.d0 >= 0 || jjVar.m0)) {
                        if (arrayList3.size() > size) {
                            arrayList3.add(h61.B(-96, null));
                        }
                        w61Var3.U();
                        arrayList3.add(h61.t(((jjVar.d0 >= 0 || jjVar.m0) && arrayList4.isEmpty()) ? 35 : 30, LocaleController.getString(R.string.AudioSearchGlobal)));
                        int size3 = arrayList4.size();
                        for (int i24 = 0; i24 < size3; i24++) {
                            MediaController.AudioEntry audioEntry7 = (MediaController.AudioEntry) arrayList4.get(i24);
                            audioEntry7.messageObject.setQuery(jjVar.y);
                            h61 a17 = org.telegram.ui.Cells.i7.a(audioEntry7, new zi(jjVar, 0));
                            a17.L(hashSet.contains(audioEntry7));
                            arrayList3.add(a17);
                        }
                        if (jjVar.d0 >= 0 || jjVar.m0) {
                            arrayList3.add(h61.q(31, 4));
                            arrayList3.add(h61.q(32, 4));
                            arrayList3.add(h61.q(33, 4));
                        }
                        if (jjVar.g0) {
                            h61 c13 = h61.c(jjVar.Q, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                            c13.q = true;
                            arrayList3.add(c13);
                        }
                        w61Var3.T();
                    }
                }
                if (arrayList3.size() <= size && !jjVar.G) {
                    if (TextUtils.isEmpty(jjVar.y)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFiles);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i25 = hj.a;
                        h61 K = h61.K(hj.class);
                        K.l = string3;
                        K.m = string4;
                        arrayList3.add(K);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(jjVar.y.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, jjVar.y));
                        int i26 = hj.a;
                        h61 K2 = h61.K(hj.class);
                        K2.l = string5;
                        K2.m = replaceTags;
                        arrayList3.add(K2);
                    }
                }
                arrayList3.add(h61.B(-99, null));
                break;
            case 6:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj3;
                boolean z20 = ChatAttachAlertPhotoLayout.q1;
                chatAttachAlertPhotoLayout.getClass();
                ((Runnable) obj2).run();
                chatAttachAlertPhotoLayout.setStarsPrice(((Long) obj).longValue());
                break;
            case 7:
                pr.P((pr) obj3, (ArrayList) obj);
                break;
            case 8:
                final us usVar = (us) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                int i27 = usVar.N;
                y2 y2Var = usVar.h0;
                ArrayList arrayList8 = usVar.T;
                ts tsVar = usVar.Q;
                boolean z21 = usVar.P;
                HashSet hashSet2 = new HashSet();
                if (TextUtils.isEmpty(usVar.e0)) {
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
                    usVar.X = arrayList7.size();
                    if (!arrayList10.isEmpty() && !z21) {
                        if (arrayList10.size() > 5) {
                            final int i29 = 1;
                            arrayList7.add(h61.s(LocaleController.getString(R.string.SearchAppsMine), LocaleController.getString(usVar.U ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.rs
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i29) {
                                        case 0:
                                            us usVar2 = usVar;
                                            usVar2.V = !usVar2.V;
                                            usVar2.N(true);
                                            break;
                                        default:
                                            us usVar3 = usVar;
                                            usVar3.U = !usVar3.U;
                                            usVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList7.add(h61.r(LocaleController.getString(R.string.SearchAppsMine)));
                        }
                        for (int i30 = 0; i30 < arrayList10.size() && (i30 < 5 || usVar.U); i30++) {
                            TLRPC.User user2 = (TLRPC.User) arrayList10.get(i30);
                            if (!hashSet2.contains(Long.valueOf(user2.id))) {
                                hashSet2.add(Long.valueOf(user2.id));
                                h61 w10 = h61.w(user2);
                                w10.q = true;
                                w10.t = true;
                                w10.H = y2Var;
                                arrayList7.add(w10);
                            }
                        }
                    }
                    hashSet2.clear();
                    usVar.Y = arrayList7.size();
                    ArrayList arrayList11 = tsVar.h;
                    if (arrayList11.isEmpty()) {
                        if (tsVar.c || !tsVar.e) {
                            if (!z21) {
                                arrayList7.add(h61.p(30));
                            }
                            arrayList7.add(h61.p(29));
                            arrayList7.add(h61.p(29));
                            arrayList7.add(h61.p(29));
                            arrayList7.add(h61.p(29));
                        }
                        z11 = false;
                    } else {
                        if (!z21) {
                            arrayList7.add(h61.r(LocaleController.getString(R.string.SearchAppsPopular)));
                        }
                        boolean z22 = false;
                        for (int i31 = 0; i31 < arrayList11.size(); i31++) {
                            TLRPC.User user3 = (TLRPC.User) arrayList11.get(i31);
                            if (!hashSet2.contains(Long.valueOf(user3.id))) {
                                hashSet2.add(Long.valueOf(user3.id));
                                h61 w11 = h61.w(user3);
                                w11.q = true;
                                w11.r = true;
                                w11.t = true;
                                w11.H = y2Var;
                                arrayList7.add(w11);
                                z22 = true;
                            }
                        }
                        if (tsVar.c || !tsVar.e) {
                            arrayList7.add(h61.p(29));
                            arrayList7.add(h61.p(29));
                            arrayList7.add(h61.p(29));
                        }
                        z11 = z22;
                    }
                    if (z11) {
                        arrayList7.add(h61.C(usVar.W));
                        break;
                    }
                } else {
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.addAll(usVar.R);
                    arrayList12.addAll(usVar.S);
                    if (!arrayList12.isEmpty()) {
                        if (arrayList12.size() <= 5 || arrayList8.isEmpty() || z21) {
                            arrayList7.add(h61.r(LocaleController.getString(R.string.SearchApps)));
                        } else {
                            final int i32 = 0;
                            arrayList7.add(h61.s(LocaleController.getString(R.string.SearchApps), LocaleController.getString(usVar.V ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.rs
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i32) {
                                        case 0:
                                            us usVar2 = usVar;
                                            usVar2.V = !usVar2.V;
                                            usVar2.N(true);
                                            break;
                                        default:
                                            us usVar3 = usVar;
                                            usVar3.U = !usVar3.U;
                                            usVar3.N(true);
                                            break;
                                    }
                                }
                            }));
                        }
                        int size4 = arrayList12.size();
                        if (!usVar.V && !arrayList8.isEmpty() && !z21) {
                            size4 = Math.min(5, size4);
                        }
                        for (int i33 = 0; i33 < size4; i33++) {
                            h61 w12 = h61.w((TLObject) arrayList12.get(i33));
                            w12.t = true;
                            w12.H = y2Var;
                            arrayList7.add(w12);
                        }
                    }
                    if (!arrayList8.isEmpty() && !z21) {
                        arrayList7.add(h61.r(LocaleController.getString(R.string.SearchMessages)));
                        int size5 = arrayList8.size();
                        int i34 = 0;
                        while (i34 < size5) {
                            Object obj4 = arrayList8.get(i34);
                            i34++;
                            h61 h61Var = new h61(33);
                            h61Var.G = (MessageObject) obj4;
                            arrayList7.add(h61Var);
                        }
                        if (usVar.b0) {
                            arrayList7.add(h61.p(1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                final lo0 lo0Var = (lo0) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                ArrayList arrayList14 = lo0Var.P;
                ArrayList arrayList15 = lo0Var.V;
                int i35 = lo0Var.N;
                if (TextUtils.isEmpty(lo0Var.b0)) {
                    if (arrayList15 != null && !arrayList15.isEmpty()) {
                        if (arrayList15.size() > 5) {
                            arrayList13.add(h61.s(LocaleController.getString(R.string.SearchMyChannels), LocaleController.getString(lo0Var.U ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.vs
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i13) {
                                        case 0:
                                            lo0 lo0Var2 = lo0Var;
                                            lo0Var2.U = !lo0Var2.U;
                                            lo0Var2.N(true);
                                            if (lo0Var2.U) {
                                                AndroidUtilities.hideKeyboard(lo0Var2.d0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            lo0 lo0Var3 = lo0Var;
                                            lo0Var3.T = !lo0Var3.T;
                                            lo0Var3.N(true);
                                            if (lo0Var3.T) {
                                                AndroidUtilities.hideKeyboard(lo0Var3.d0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        } else {
                            arrayList13.add(h61.r(LocaleController.getString(R.string.SearchMyChannels)));
                        }
                        int size6 = arrayList15.size();
                        if (!lo0Var.U) {
                            size6 = Math.min(5, size6);
                        }
                        for (int i36 = 0; i36 < size6; i36++) {
                            h61 w13 = h61.w((TLObject) arrayList15.get(i36));
                            w13.I = true;
                            arrayList13.add(w13);
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
                            arrayList13.add(h61.r(LocaleController.getString(R.string.SearchRecommendedChannels)));
                        }
                        int size8 = arrayList16.size();
                        while (i13 < size8) {
                            Object obj5 = arrayList16.get(i13);
                            i13++;
                            arrayList13.add(h61.w((TLRPC.Chat) obj5));
                        }
                        break;
                    } else {
                        arrayList13.add(h61.p(30));
                        arrayList13.add(h61.p(29));
                        arrayList13.add(h61.p(29));
                        arrayList13.add(h61.p(29));
                        arrayList13.add(h61.p(29));
                        break;
                    }
                } else {
                    ArrayList arrayList18 = new ArrayList();
                    ArrayList arrayList19 = lo0Var.Q;
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
                    ArrayList arrayList20 = lo0Var.R;
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
                    ArrayList arrayList21 = lo0Var.S;
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
                            arrayList13.add(h61.r(LocaleController.getString(R.string.SearchChannels)));
                        } else {
                            final int i41 = 1;
                            arrayList13.add(h61.s(LocaleController.getString(R.string.SearchChannels), LocaleController.getString(lo0Var.T ? R.string.ShowLess : R.string.ShowMore), new View.OnClickListener() { // from class: org.telegram.ui.Components.vs
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    switch (i41) {
                                        case 0:
                                            lo0 lo0Var2 = lo0Var;
                                            lo0Var2.U = !lo0Var2.U;
                                            lo0Var2.N(true);
                                            if (lo0Var2.U) {
                                                AndroidUtilities.hideKeyboard(lo0Var2.d0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                        default:
                                            lo0 lo0Var3 = lo0Var;
                                            lo0Var3.T = !lo0Var3.T;
                                            lo0Var3.N(true);
                                            if (lo0Var3.T) {
                                                AndroidUtilities.hideKeyboard(lo0Var3.d0.getParentActivity().getCurrentFocus());
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }));
                        }
                        int size12 = arrayList18.size();
                        if (!lo0Var.T && !arrayList14.isEmpty()) {
                            size12 = Math.min(5, size12);
                        }
                        for (int i42 = 0; i42 < size12; i42++) {
                            arrayList13.add(h61.w((TLObject) arrayList18.get(i42)));
                        }
                    }
                    if (!arrayList14.isEmpty()) {
                        arrayList13.add(h61.r(LocaleController.getString(R.string.SearchMessages)));
                        int size13 = arrayList14.size();
                        int i43 = 0;
                        while (i43 < size13) {
                            Object obj9 = arrayList14.get(i43);
                            i43++;
                            h61 h61Var2 = new h61(33);
                            h61Var2.G = (MessageObject) obj9;
                            arrayList13.add(h61Var2);
                        }
                        if (lo0Var.Y) {
                            arrayList13.add(h61.p(1));
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
                ((ArrayList) obj).add(h61.j(-1, ((a40) obj3).X));
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
                u41.p((u41) obj3, (String) obj, (Boolean) obj2);
                break;
            default:
                ((z61) obj3).S((ArrayList) obj, (w61) obj2);
                break;
        }
    }
}
