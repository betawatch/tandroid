package org.telegram.ui.Components;

import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class s0 {
    public static final LongSparseArray a = new LongSparseArray();
    public static final LongSparseArray b = new LongSparseArray();

    public static TL_aicompose.AiComposeTone a(int i7, TL_aicompose.InputAiComposeTone inputAiComposeTone) {
        if (inputAiComposeTone == null) {
            return null;
        }
        ArrayList arrayList = org.telegram.messenger.np.u1(i7).T1().b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
            if ((inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneID) && (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.inputAiComposeToneID) inputAiComposeTone).id == ((TL_aicompose.TL_aiComposeTone) aiComposeTone).id) {
                return aiComposeTone;
            }
            if ((inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSlug) && (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) && TextUtils.equals(((TL_aicompose.inputAiComposeToneSlug) inputAiComposeTone).slug, ((TL_aicompose.TL_aiComposeTone) aiComposeTone).slug)) {
                return aiComposeTone;
            }
            if ((inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneDefault) && (aiComposeTone instanceof TL_aicompose.TL_aiComposeToneDefault) && TextUtils.equals(((TL_aicompose.inputAiComposeToneDefault) inputAiComposeTone).tone, ((TL_aicompose.TL_aiComposeToneDefault) aiComposeTone).tone)) {
                return aiComposeTone;
            }
        }
        return null;
    }

    public static r0 b(int i7, long j3) {
        r0 r0Var;
        if (j3 == 0) {
            return null;
        }
        if (!org.telegram.messenger.n5.C(j3)) {
            org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i7);
            d02.k();
            TL_aicompose.inputAiComposeStyle inputaicomposestyle = (TL_aicompose.inputAiComposeStyle) d02.r1.f(j3);
            if (inputaicomposestyle != null) {
                r0 r0Var2 = new r0();
                r0Var2.c = TextUtils.isEmpty(inputaicomposestyle.to_lang) ? null : inputaicomposestyle.to_lang;
                TL_aicompose.InputAiComposeTone d = d(inputaicomposestyle.tone);
                r0Var2.d = d;
                r0Var2.b = inputaicomposestyle.emojify;
                r0Var2.f = r0Var2.c == null ? 1 : 0;
                TL_aicompose.AiComposeTone a10 = a(i7, d);
                String str = (a10 == null || TextUtils.isEmpty(a10.title)) ? null : a10.title;
                String str2 = r0Var2.c;
                if (str2 != null) {
                    String L0 = b31.L0(b31.P0(str2, null, null));
                    if (str != null) {
                        L0 = a8.p0.E(str, " ", L0);
                    }
                    r0Var2.e = L0;
                } else {
                    if (str == null) {
                        str = org.telegram.messenger.hd.N0(2131754963, null);
                    }
                    r0Var2.e = str;
                }
                if (r0Var2.b) {
                    r0Var2.e = a8.p0.s(new StringBuilder(), r0Var2.e, " + Emoji");
                }
                return r0Var2;
            }
        }
        LongSparseArray longSparseArray = a;
        long j10 = (8 * j3) + i7;
        LongSparseArray longSparseArray2 = b;
        if (longSparseArray2.get(j10) != null) {
            r0Var = (r0) longSparseArray.get(j10);
        } else {
            String string = org.telegram.messenger.t0.b.getSharedPreferences("anim_ai_always", 0).getString(c(i7, j3), null);
            if (string != null) {
                try {
                    SerializedData serializedData = new SerializedData(Base64.decode(string, 2));
                    r0Var = new r0();
                    serializedData.readInt32(false);
                    r0Var.f = serializedData.readInt32(false);
                    r0Var.a = serializedData.readBool(false);
                    r0Var.b = serializedData.readBool(false);
                    r0Var.c = serializedData.readBool(false) ? serializedData.readString(false) : null;
                    r0Var.e = serializedData.readString(false);
                    if (serializedData.readBool(false)) {
                        r0Var.d = TL_aicompose.InputAiComposeTone.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                    }
                    serializedData.cleanup();
                } catch (Throwable unused) {
                }
                longSparseArray.put(j10, r0Var);
                longSparseArray2.put(j10, Boolean.TRUE);
            }
            r0Var = null;
            longSparseArray.put(j10, r0Var);
            longSparseArray2.put(j10, Boolean.TRUE);
        }
        if (r0Var == null) {
            return null;
        }
        if (r0Var.a || org.telegram.messenger.n5.C(j3)) {
            return r0Var;
        }
        return null;
    }

    public static String c(int i7, long j3) {
        return i7 + "_" + j3;
    }

    public static TL_aicompose.InputAiComposeTone d(TL_aicompose.InputAiComposeTone inputAiComposeTone) {
        if (((inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneDefault) && TextUtils.isEmpty(((TL_aicompose.inputAiComposeToneDefault) inputAiComposeTone).tone)) || (inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse)) {
            return null;
        }
        return inputAiComposeTone;
    }

    public static void e(int i7, final long j3, r0 r0Var) {
        TL_aicompose.inputAiComposeStyle inputaicomposestyle;
        if (j3 == 0) {
            return;
        }
        boolean z10 = r0Var != null && (r0Var.a || org.telegram.messenger.n5.C(j3));
        r0 r0Var2 = z10 ? r0Var : null;
        LongSparseArray longSparseArray = a;
        LongSparseArray longSparseArray2 = b;
        long j10 = (8 * j3) + i7;
        if (r0Var2 != null || longSparseArray2.get(j10) == null || longSparseArray.get(j10) != null) {
            longSparseArray.put(j10, r0Var2);
            longSparseArray2.put(j10, Boolean.TRUE);
            if (r0Var2 == null) {
                org.telegram.messenger.t0.b.getSharedPreferences("anim_ai_always", 0).edit().remove(c(i7, j3)).apply();
            } else {
                SerializedData serializedData = new SerializedData();
                serializedData.writeInt32(1);
                serializedData.writeInt32(r0Var2.f);
                serializedData.writeBool(r0Var2.a);
                serializedData.writeBool(r0Var2.b);
                serializedData.writeBool(r0Var2.c != null);
                String str = r0Var2.c;
                if (str != null) {
                    serializedData.writeString(str);
                }
                String str2 = r0Var2.e;
                if (str2 == null) {
                    str2 = "";
                }
                serializedData.writeString(str2);
                TL_aicompose.InputAiComposeTone d = d(r0Var2.d);
                serializedData.writeBool(d != null);
                if (d != null) {
                    d.serializeToStream(serializedData);
                }
                org.telegram.messenger.t0.b.getSharedPreferences("anim_ai_always", 0).edit().putString(c(i7, j3), Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
                serializedData.cleanup();
            }
        }
        if (org.telegram.messenger.n5.C(j3)) {
            return;
        }
        final org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(i7);
        if (r0Var == null || z10) {
            inputaicomposestyle = null;
        } else {
            inputaicomposestyle = new TL_aicompose.inputAiComposeStyle();
            inputaicomposestyle.tone = d(r0Var.d);
            inputaicomposestyle.to_lang = TextUtils.isEmpty(r0Var.c) ? null : r0Var.c;
            inputaicomposestyle.emojify = r0Var.b;
        }
        if (org.telegram.messenger.n5.C(j3)) {
            return;
        }
        TLRPC.InputPeer l1 = d02.getMessagesController().l1(j3);
        d02.k();
        final TL_aicompose.inputAiComposeStyle inputaicomposestyle2 = (TL_aicompose.inputAiComposeStyle) d02.r1.f(j3);
        final TL_aicompose.inputAiComposeStyle inputaicomposestyle3 = org.telegram.messenger.si.B0(inputaicomposestyle) ? null : inputaicomposestyle;
        if (org.telegram.messenger.si.j(inputaicomposestyle2, inputaicomposestyle3)) {
            return;
        }
        d02.H1(j3, inputaicomposestyle3);
        TL_aicompose.setChatStyle setchatstyle = new TL_aicompose.setChatStyle();
        setchatstyle.peer = l1;
        setchatstyle.style = inputaicomposestyle3;
        d02.getConnectionsManager().sendRequestTyped(setchatstyle, new d3.b(1), new org.telegram.messenger.r10() { // from class: org.telegram.messenger.zg
            @Override // org.telegram.messenger.r10
            public final void a(Object obj, Object obj2) {
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    a8.d("aicompose.setChatStyle failed: " + tL_error.text);
                    si siVar = si.this;
                    siVar.k();
                    a0.h hVar = siVar.r1;
                    long j11 = j3;
                    if (si.j((TL_aicompose.inputAiComposeStyle) hVar.f(j11), inputaicomposestyle3)) {
                        siVar.H1(j11, inputaicomposestyle2);
                    }
                }
            }
        });
    }
}
