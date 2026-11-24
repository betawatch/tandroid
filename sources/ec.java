// default package

import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class ec {
    public static final LongSparseArray a = new LongSparseArray();
    public static final LongSparseArray b = new LongSparseArray();

    public static TL_aicompose.AiComposeTone a(int i, TL_aicompose.InputAiComposeTone inputAiComposeTone) {
        if (inputAiComposeTone == null) {
            return null;
        }
        ArrayList arrayList = na7.q1(i).O1().b;
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

    public static dc b(int i, long j) {
        dc dcVar;
        if (j == 0) {
            return null;
        }
        if (!cf3.B(j)) {
            hq6 d0 = hq6.d0(i);
            d0.k();
            TL_aicompose.inputAiComposeStyle inputaicomposestyle = (TL_aicompose.inputAiComposeStyle) d0.r1.f(j);
            if (inputaicomposestyle != null) {
                dc dcVar2 = new dc();
                dcVar2.c = TextUtils.isEmpty(inputaicomposestyle.to_lang) ? null : inputaicomposestyle.to_lang;
                TL_aicompose.InputAiComposeTone d = d(inputaicomposestyle.tone);
                dcVar2.d = d;
                dcVar2.b = inputaicomposestyle.emojify;
                dcVar2.f = dcVar2.c == null ? 1 : 0;
                TL_aicompose.AiComposeTone a2 = a(i, d);
                String str = (a2 == null || TextUtils.isEmpty(a2.title)) ? null : a2.title;
                String str2 = dcVar2.c;
                if (str2 != null) {
                    String E0 = rzb.E0(rzb.J0(str2, null, null));
                    if (str != null) {
                        E0 = tb4.y(str, " ", E0);
                    }
                    dcVar2.e = E0;
                } else {
                    if (str == null) {
                        str = k96.M0(2131754963, null);
                    }
                    dcVar2.e = str;
                }
                if (dcVar2.b) {
                    dcVar2.e = b00.j(new StringBuilder(), dcVar2.e, " + Emoji");
                }
                return dcVar2;
            }
        }
        LongSparseArray longSparseArray = a;
        long j2 = (j << 3) + i;
        LongSparseArray longSparseArray2 = b;
        if (longSparseArray2.get(j2) != null) {
            dcVar = (dc) longSparseArray.get(j2);
        } else {
            String string = a.b.getSharedPreferences("anim_ai_always", 0).getString(c(i, j), null);
            if (string != null) {
                try {
                    SerializedData serializedData = new SerializedData(Base64.decode(string, 2));
                    dcVar = new dc();
                    serializedData.readInt32(false);
                    dcVar.f = serializedData.readInt32(false);
                    dcVar.a = serializedData.readBool(false);
                    dcVar.b = serializedData.readBool(false);
                    dcVar.c = serializedData.readBool(false) ? serializedData.readString(false) : null;
                    dcVar.e = serializedData.readString(false);
                    if (serializedData.readBool(false)) {
                        dcVar.d = TL_aicompose.InputAiComposeTone.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                    }
                    serializedData.cleanup();
                } catch (Throwable unused) {
                }
                longSparseArray.put(j2, dcVar);
                longSparseArray2.put(j2, Boolean.TRUE);
            }
            dcVar = null;
            longSparseArray.put(j2, dcVar);
            longSparseArray2.put(j2, Boolean.TRUE);
        }
        if (dcVar == null) {
            return null;
        }
        if (dcVar.a || cf3.B(j)) {
            return dcVar;
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

    public static void e(int i, long j, dc dcVar) {
        TL_aicompose.inputAiComposeStyle inputaicomposestyle;
        if (j != 0) {
            boolean z = dcVar != null && (dcVar.a || cf3.B(j));
            dc dcVar2 = z ? dcVar : null;
            LongSparseArray longSparseArray = a;
            LongSparseArray longSparseArray2 = b;
            long j2 = (j << 3) + i;
            if (dcVar2 != null || longSparseArray2.get(j2) == null || longSparseArray.get(j2) != null) {
                longSparseArray.put(j2, dcVar2);
                longSparseArray2.put(j2, Boolean.TRUE);
                if (dcVar2 == null) {
                    a.b.getSharedPreferences("anim_ai_always", 0).edit().remove(c(i, j)).apply();
                } else {
                    SerializedData serializedData = new SerializedData();
                    serializedData.writeInt32(1);
                    serializedData.writeInt32(dcVar2.f);
                    serializedData.writeBool(dcVar2.a);
                    serializedData.writeBool(dcVar2.b);
                    serializedData.writeBool(dcVar2.c != null);
                    String str = dcVar2.c;
                    if (str != null) {
                        serializedData.writeString(str);
                    }
                    String str2 = dcVar2.e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    serializedData.writeString(str2);
                    TL_aicompose.InputAiComposeTone d = d(dcVar2.d);
                    serializedData.writeBool(d != null);
                    if (d != null) {
                        d.serializeToStream(serializedData);
                    }
                    a.b.getSharedPreferences("anim_ai_always", 0).edit().putString(c(i, j), Base64.encodeToString(serializedData.toByteArray(), 2)).apply();
                    serializedData.cleanup();
                }
            }
            if (cf3.B(j)) {
                return;
            }
            hq6 d0 = hq6.d0(i);
            if (dcVar == null || z) {
                inputaicomposestyle = null;
            } else {
                inputaicomposestyle = new TL_aicompose.inputAiComposeStyle();
                inputaicomposestyle.tone = d(dcVar.d);
                inputaicomposestyle.to_lang = TextUtils.isEmpty(dcVar.c) ? null : dcVar.c;
                inputaicomposestyle.emojify = dcVar.b;
            }
            if (cf3.B(j)) {
                return;
            }
            TLRPC.InputPeer h1 = d0.getMessagesController().h1(j);
            d0.k();
            TL_aicompose.inputAiComposeStyle inputaicomposestyle2 = (TL_aicompose.inputAiComposeStyle) d0.r1.f(j);
            TL_aicompose.inputAiComposeStyle inputaicomposestyle3 = hq6.A0(inputaicomposestyle) ? null : inputaicomposestyle;
            if (hq6.j(inputaicomposestyle2, inputaicomposestyle3)) {
                return;
            }
            d0.F1(j, inputaicomposestyle3);
            TL_aicompose.setChatStyle setchatstyle = new TL_aicompose.setChatStyle();
            setchatstyle.peer = h1;
            setchatstyle.style = inputaicomposestyle3;
            d0.getConnectionsManager().sendRequestTyped(setchatstyle, new hc((byte) 0), new il3(d0, j, inputaicomposestyle3, inputaicomposestyle2));
        }
    }
}
