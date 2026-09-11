package db;

import j$.util.Objects;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class m extends i {
    public final Serializable a;

    public m(Boolean bool) {
        Objects.requireNonNull(bool);
        this.a = bool;
    }

    public static boolean s(m mVar) {
        Serializable serializable = mVar.a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        Serializable serializable = mVar.a;
        Serializable serializable2 = this.a;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (s(this) && s(mVar)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? o().equals(mVar.o()) : r().longValue() == mVar.r().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : fb.d.i(n())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : fb.d.i(mVar.n())) == 0;
        }
        double q6 = q();
        double q10 = mVar.q();
        if (q6 != q10) {
            return Double.isNaN(q6) && Double.isNaN(q10);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.a;
        if (serializable == null) {
            return 31;
        }
        if (s(this)) {
            doubleToLongBits = r().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(r().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override // db.i
    public final String n() {
        Serializable serializable = this.a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return r().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final BigInteger o() {
        Serializable serializable = this.a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (s(this)) {
            return BigInteger.valueOf(r().longValue());
        }
        String n10 = n();
        fb.d.d(n10);
        return new BigInteger(n10);
    }

    public final boolean p() {
        Serializable serializable = this.a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(n());
    }

    public final double q() {
        return this.a instanceof Number ? r().doubleValue() : Double.parseDouble(n());
    }

    public final Number r() {
        Serializable serializable = this.a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new fb.h((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public m(Number number) {
        Objects.requireNonNull(number);
        this.a = number;
    }

    public m(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }
}
