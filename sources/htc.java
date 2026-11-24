// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class htc extends TLObject {
    public long a = System.currentTimeMillis();
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public Bitmap i;
    public byte[] j;

    public static htc a(cv0 cv0Var) {
        htc htcVar = new htc();
        String J0 = gl.J0(cv0Var.getUrl(), true);
        htcVar.b = J0;
        if (TextUtils.isEmpty(J0)) {
            return null;
        }
        if (cv0Var.K) {
            htcVar.c = cv0Var.L;
        }
        htcVar.d = cv0Var.r;
        if (cv0Var.s) {
            htcVar.e = cv0Var.x;
        }
        if (cv0Var.w) {
            htcVar.f = cv0Var.y;
        }
        if (cv0Var.N) {
            htcVar.i = cv0Var.P;
        }
        return htcVar;
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        this.a = inputSerializedData.readInt64(z);
        this.b = inputSerializedData.readString(z);
        this.c = inputSerializedData.readString(z);
        this.d = inputSerializedData.readString(z);
        this.e = inputSerializedData.readInt32(z);
        this.f = inputSerializedData.readInt32(z);
        if (inputSerializedData.readInt32(z) == 1450380236) {
            this.i = null;
        } else {
            this.j = inputSerializedData.readByteArray(z);
            this.i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.j));
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.a);
        String str = this.b;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str2 = this.c;
        if (str2 == null) {
            str2 = "";
        }
        outputSerializedData.writeString(str2);
        String str3 = this.d;
        outputSerializedData.writeString(str3 != null ? str3 : "");
        outputSerializedData.writeInt32(this.e);
        outputSerializedData.writeInt32(this.f);
        if (this.i == null) {
            outputSerializedData.writeInt32(TLRPC.TL_null.constructor);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = Build.VERSION.SDK_INT;
        Bitmap bitmap = this.i;
        if (i >= 30) {
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            bitmap.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
