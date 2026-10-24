package eb;

import j$.util.Objects;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class m extends i {
    public final Serializable a;

    public m(Boolean bool) {
        Objects.requireNonNull(bool);
        this.a = bool;
    }

    public static boolean r(m mVar) {
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
        if (r(this) && r(mVar)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? n().equals(mVar.n()) : q().longValue() == mVar.q().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : gb.d.i(m())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : gb.d.i(mVar.m())) == 0;
        }
        double p5 = p();
        double p9 = mVar.p();
        if (p5 != p9) {
            return Double.isNaN(p5) && Double.isNaN(p9);
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.a;
        if (serializable == null) {
            return 31;
        }
        if (r(this)) {
            doubleToLongBits = q().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(q().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override // eb.i
    public final String m() {
        Serializable serializable = this.a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return q().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final BigInteger n() {
        Serializable serializable = this.a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (r(this)) {
            return BigInteger.valueOf(q().longValue());
        }
        String m10 = m();
        gb.d.d(m10);
        return new BigInteger(m10);
    }

    public final boolean o() {
        Serializable serializable = this.a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(m());
    }

    public final double p() {
        return this.a instanceof Number ? q().doubleValue() : Double.parseDouble(m());
    }

    public final Number q() {
        Serializable serializable = this.a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new gb.h((String) serializable);
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
