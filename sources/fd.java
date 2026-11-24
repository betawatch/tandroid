// default package

import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class fd {
    public static final LongSparseArray a = new LongSparseArray();
    public static final LongSparseArray b = new LongSparseArray();

    public static TL_aicompose.AiComposeTone a(int i, TL_aicompose.InputAiComposeTone inputAiComposeTone) {
        if (inputAiComposeTone == null) {
            return null;
        }
        ArrayList arrayList = oc7.r1(i).P1().b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
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

    public static ed b(int i, long j) {
        ed edVar;
        if (j == 0) {
            return null;
        }
        if (!pg3.B(j)) {
            hs6 d0 = hs6.d0(i);
            d0.k();
            TL_aicompose.inputAiComposeStyle inputaicomposestyle = (TL_aicompose.inputAiComposeStyle) d0.r1.f(j);
            if (inputaicomposestyle != null) {
                ed edVar2 = new ed();
                edVar2.c = TextUtils.isEmpty(inputaicomposestyle.to_lang) ? null : inputaicomposestyle.to_lang;
                TL_aicompose.InputAiComposeTone d = d(inputaicomposestyle.tone);
                edVar2.d = d;
                edVar2.b = inputaicomposestyle.emojify;
                edVar2.f = edVar2.c == null ? 1 : 0;
                TL_aicompose.AiComposeTone a2 = a(i, d);
                String str = (a2 == null || TextUtils.isEmpty(a2.title)) ? null : a2.title;
                String str2 = edVar2.c;
                if (str2 != null) {
                    String E0 = s1c.E0(s1c.J0(str2, null, null));
                    if (str != null) {
                        E0 = kt6.o(str, " ", E0);
                    }
                    edVar2.e = E0;
                } else {
                    if (str == null) {
                        str = jb6.M0(2131754963, null);
                    }
                    edVar2.e = str;
                }
                if (edVar2.b) {
                    edVar2.e = b10.j(new StringBuilder(), edVar2.e, " + Emoji");
                }
                return edVar2;
            }
        }
        LongSparseArray longSparseArray = a;
        long j2 = (j << 3) + i;
        LongSparseArray longSparseArray2 = b;
        if (longSparseArray2.get(j2) != null) {
            edVar = (ed) longSparseArray.get(j2);
        } else {
            String string = a.b.getSharedPreferences("anim_ai_always", 0).getString(c(i, j), null);
            if (string != null) {
                try {
                    SerializedData serializedData = new SerializedData(Base64.decode(string, 2));
                    edVar = new ed();
                    serializedData.readInt32(false);
                    edVar.f = serializedData.readInt32(false);
                    edVar.a = serializedData.readBool(false);
                    edVar.b = serializedData.readBool(false);
                    edVar.c = serializedData.readBool(false) ? serializedData.readString(false) : null;
                    edVar.e = serializedData.readString(false);
                    if (serializedData.readBool(false)) {
                        edVar.d = TL_aicompose.InputAiComposeTone.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                    }
                    serializedData.cleanup();
                } catch (Throwable unused) {
                }
                longSparseArray.put(j2, edVar);
                longSparseArray2.put(j2, Boolean.TRUE);
            }
            edVar = null;
            longSparseArray.put(j2, edVar);
            longSparseArray2.put(j2, Boolean.TRUE);
        }
        if (edVar == null) {
            return null;
        }
        if (edVar.a || pg3.B(j)) {
            return edVar;
        }
        return null;
    }

    public static String c(int i, long j) {
        return i + "_" + j;
    }

    public static TL_aicompose.InputAiComposeTone d(TL_aicompose.InputAiComposeTone inputAiComposeTone) {
        if (((inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneDefault) && TextUtils.isEmpty(((TL_aicompose.inputAiComposeToneDefault) inputAiComposeTone).tone)) || (inputAiComposeTone instanceof TL_aicompose.inputAiComposeToneSingleUse)) {
            return null;
        }
        return inputAiComposeTone;
    }

    public static void e(int i, long j, ed edVar) {
        TL_aicompose.inputAiComposeStyle inputaicomposestyle;
        if (j != 0) {
            boolean z = edVar != null && (edVar.a || pg3.B(j));
            ed edVar2 = z ? edVar : null;
            LongSparseArray longSparseArray = a;
            LongSparseArray longSparseArray2 = b;
            long j2 = (j << 3) + i;
            if (edVar2 != null || longSparseArray2.get(j2) == null || longSparseArray.get(j2) != null) {
                longSparseArray.put(j2, edVar2);
                longSparseArray2.put(j2, Boolean.TRUE);
                if (edVar2 == null) {
                    a.b.getSharedPreferences("anim_ai_always", 0).edit().remove(c(i, j)).apply();
                } else {
                    SerializedData serializedData = new SerializedData();
                    serializedData.writeInt32(1);
                    serializedData.writeInt32(edVar2.f);
                    serializedData.writeBool(edVar2.a);
                    serializedData.writeBool(edVar2.b);
                    serializedData.writeBool(edVar2.c != null);
                    String str = edVar2.c;
                    if (str != null) {
                        serializedData.writeString(str);
                    }
                    String str2 = edVar2.e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    serializedData.writeString(str2);
                    TL_aicompose.InputAiComposeTone d = d(edVar2.d);
                    serializedData.writeBool(d != null);
                    if (d != null) {
                        d.serializeToStream(serializedData);
                    }
                    a.b.getSharedPreferences("anim_ai_always", 0).edit().putString(c(i, j), Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
                    serializedData.cleanup();
                }
            }
            if (pg3.B(j)) {
                return;
            }
            hs6 d0 = hs6.d0(i);
            if (edVar == null || z) {
                inputaicomposestyle = null;
            } else {
                inputaicomposestyle = new TL_aicompose.inputAiComposeStyle();
                inputaicomposestyle.tone = d(edVar.d);
                inputaicomposestyle.to_lang = TextUtils.isEmpty(edVar.c) ? null : edVar.c;
                inputaicomposestyle.emojify = edVar.b;
            }
            if (pg3.B(j)) {
                return;
            }
            TLRPC.InputPeer i1 = d0.getMessagesController().i1(j);
            d0.k();
            TL_aicompose.inputAiComposeStyle inputaicomposestyle2 = (TL_aicompose.inputAiComposeStyle) d0.r1.f(j);
            TL_aicompose.inputAiComposeStyle inputaicomposestyle3 = hs6.A0(inputaicomposestyle) ? null : inputaicomposestyle;
            if (hs6.j(inputaicomposestyle2, inputaicomposestyle3)) {
                return;
            }
            d0.F1(j, inputaicomposestyle3);
            TL_aicompose.setChatStyle setchatstyle = new TL_aicompose.setChatStyle();
            setchatstyle.peer = i1;
            setchatstyle.style = inputaicomposestyle3;
            d0.getConnectionsManager().sendRequestTyped(setchatstyle, new kc((byte) 0), new tm3(d0, j, inputaicomposestyle3, inputaicomposestyle2));
        }
    }
}
