package org.scilab.forge.jlatexmath;

import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
class PredefMacroInfo extends MacroInfo {
    private int id;

    public PredefMacroInfo(int i7, int i10, int i11) {
        super(i10, i11);
        this.id = i7;
    }

    private static final Object invokeID(int i7, TeXParser teXParser, String[] strArr) {
        try {
            switch (i7) {
                case 0:
                    return PredefMacros.newcommand_macro(teXParser, strArr);
                case 1:
                    return PredefMacros.renewcommand_macro(teXParser, strArr);
                case 2:
                    return PredefMacros.rule_macro(teXParser, strArr);
                case 3:
                case 4:
                    return PredefMacros.hvspace_macro(teXParser, strArr);
                case 5:
                case 6:
                case 7:
                    return PredefMacros.clrlap_macro(teXParser, strArr);
                case 8:
                case 9:
                case 10:
                    return PredefMacros.mathclrlap_macro(teXParser, strArr);
                case 11:
                    return PredefMacros.includegraphics_macro(teXParser, strArr);
                case 12:
                    return PredefMacros.cfrac_macro(teXParser, strArr);
                case 13:
                    return PredefMacros.frac_macro(teXParser, strArr);
                case 14:
                    return PredefMacros.sfrac_macro(teXParser, strArr);
                case 15:
                    return PredefMacros.genfrac_macro(teXParser, strArr);
                case 16:
                    return PredefMacros.over_macro(teXParser, strArr);
                case 17:
                    return PredefMacros.overwithdelims_macro(teXParser, strArr);
                case 18:
                    return PredefMacros.atop_macro(teXParser, strArr);
                case 19:
                    return PredefMacros.atopwithdelims_macro(teXParser, strArr);
                case 20:
                    return PredefMacros.choose_macro(teXParser, strArr);
                case 21:
                    return PredefMacros.underscore_macro(teXParser, strArr);
                case 22:
                    return PredefMacros.mbox_macro(teXParser, strArr);
                case 23:
                    return PredefMacros.text_macro(teXParser, strArr);
                case 24:
                    return PredefMacros.intertext_macro(teXParser, strArr);
                case 25:
                    return PredefMacros.binom_macro(teXParser, strArr);
                case 26:
                    return PredefMacros.mathbf_macro(teXParser, strArr);
                case 27:
                    return PredefMacros.bf_macro(teXParser, strArr);
                case 28:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 29:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case qs.T /* 30 */:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case qs.U /* 31 */:
                    return PredefMacros.mathit_macro(teXParser, strArr);
                case 32:
                    return PredefMacros.it_macro(teXParser, strArr);
                case 33:
                    return PredefMacros.mathrm_macro(teXParser, strArr);
                case 34:
                    return PredefMacros.rm_macro(teXParser, strArr);
                case 35:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 36:
                    return PredefMacros.mathsf_macro(teXParser, strArr);
                case 37:
                    return PredefMacros.sf_macro(teXParser, strArr);
                case 38:
                    return PredefMacros.mathtt_macro(teXParser, strArr);
                case 39:
                    return PredefMacros.tt_macro(teXParser, strArr);
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case qs.o0 /* 51 */:
                case qs.p0 /* 52 */:
                case qs.q0 /* 53 */:
                case qs.r0 /* 54 */:
                case qs.s0 /* 55 */:
                case qs.t0 /* 56 */:
                case qs.u0 /* 57 */:
                    return PredefMacros.accentbis_macros(teXParser, strArr);
                case qs.v0 /* 58 */:
                    return PredefMacros.T_macro(teXParser, strArr);
                case qs.w0 /* 59 */:
                    return PredefMacros.accentbis_macros(teXParser, strArr);
                case qs.x0 /* 60 */:
                    return PredefMacros.accent_macro(teXParser, strArr);
                case qs.y0 /* 61 */:
                    return PredefMacros.grkaccent_macro(teXParser, strArr);
                case qs.z0 /* 62 */:
                case qs.A0 /* 63 */:
                case 64:
                case 65:
                case qs.D0 /* 66 */:
                case qs.E0 /* 67 */:
                case qs.F0 /* 68 */:
                case qs.G0 /* 69 */:
                case qs.H0 /* 70 */:
                case qs.I0 /* 71 */:
                case qs.J0 /* 72 */:
                case qs.K0 /* 73 */:
                case qs.L0 /* 74 */:
                case qs.M0 /* 75 */:
                    return PredefMacros.accent_macros(teXParser, strArr);
                case qs.N0 /* 76 */:
                    return PredefMacros.nbsp_macro(teXParser, strArr);
                case qs.O0 /* 77 */:
                    return PredefMacros.smallmatrixATATenv_macro(teXParser, strArr);
                case qs.P0 /* 78 */:
                    return PredefMacros.matrixATATenv_macro(teXParser, strArr);
                case qs.Q0 /* 79 */:
                    return PredefMacros.overrightarrow_macro(teXParser, strArr);
                case 80:
                    return PredefMacros.overleftarrow_macro(teXParser, strArr);
                case qs.S0 /* 81 */:
                    return PredefMacros.overleftrightarrow_macro(teXParser, strArr);
                case qs.T0 /* 82 */:
                    return PredefMacros.underrightarrow_macro(teXParser, strArr);
                case qs.U0 /* 83 */:
                    return PredefMacros.underleftarrow_macro(teXParser, strArr);
                case qs.V0 /* 84 */:
                    return PredefMacros.underleftrightarrow_macro(teXParser, strArr);
                case qs.W0 /* 85 */:
                    return PredefMacros.xleftarrow_macro(teXParser, strArr);
                case qs.X0 /* 86 */:
                    return PredefMacros.xrightarrow_macro(teXParser, strArr);
                case qs.Y0 /* 87 */:
                    return PredefMacros.underbrace_macro(teXParser, strArr);
                case qs.Z0 /* 88 */:
                    return PredefMacros.overbrace_macro(teXParser, strArr);
                case qs.a1 /* 89 */:
                    return PredefMacros.underbrack_macro(teXParser, strArr);
                case qs.b1 /* 90 */:
                    return PredefMacros.overbrack_macro(teXParser, strArr);
                case qs.c1 /* 91 */:
                    return PredefMacros.underparen_macro(teXParser, strArr);
                case qs.d1 /* 92 */:
                    return PredefMacros.overparen_macro(teXParser, strArr);
                case qs.e1 /* 93 */:
                case qs.f1 /* 94 */:
                    return PredefMacros.sqrt_macro(teXParser, strArr);
                case qs.g1 /* 95 */:
                    return PredefMacros.overline_macro(teXParser, strArr);
                case 96:
                    return PredefMacros.underline_macro(teXParser, strArr);
                case qs.i1 /* 97 */:
                    return PredefMacros.mathop_macro(teXParser, strArr);
                case qs.j1 /* 98 */:
                    return PredefMacros.mathpunct_macro(teXParser, strArr);
                case qs.k1 /* 99 */:
                    return PredefMacros.mathord_macro(teXParser, strArr);
                case qs.l1 /* 100 */:
                    return PredefMacros.mathrel_macro(teXParser, strArr);
                case 101:
                    return PredefMacros.mathinner_macro(teXParser, strArr);
                case qs.n1 /* 102 */:
                    return PredefMacros.mathbin_macro(teXParser, strArr);
                case qs.o1 /* 103 */:
                    return PredefMacros.mathopen_macro(teXParser, strArr);
                case qs.p1 /* 104 */:
                    return PredefMacros.mathclose_macro(teXParser, strArr);
                case qs.q1 /* 105 */:
                    return PredefMacros.joinrel_macro(teXParser, strArr);
                case qs.r1 /* 106 */:
                    return PredefMacros.smash_macro(teXParser, strArr);
                case qs.s1 /* 107 */:
                    return PredefMacros.vdots_macro(teXParser, strArr);
                case qs.t1 /* 108 */:
                    return PredefMacros.ddots_macro(teXParser, strArr);
                case qs.u1 /* 109 */:
                    return PredefMacros.iddots_macro(teXParser, strArr);
                case qs.v1 /* 110 */:
                    return PredefMacros.nolimits_macro(teXParser, strArr);
                case qs.w1 /* 111 */:
                    return PredefMacros.limits_macro(teXParser, strArr);
                case qs.x1 /* 112 */:
                    return PredefMacros.normal_macro(teXParser, strArr);
                case qs.y1 /* 113 */:
                    return PredefMacros.leftparenthesis_macro(teXParser, strArr);
                case qs.z1 /* 114 */:
                    return PredefMacros.leftbracket_macro(teXParser, strArr);
                case qs.A1 /* 115 */:
                    return PredefMacros.left_macro(teXParser, strArr);
                case qs.B1 /* 116 */:
                    return PredefMacros.middle_macro(teXParser, strArr);
                case qs.C1 /* 117 */:
                    return PredefMacros.cr_macro(teXParser, strArr);
                case qs.D1 /* 118 */:
                    return PredefMacros.multicolumn_macro(teXParser, strArr);
                case qs.E1 /* 119 */:
                    return PredefMacros.hdotsfor_macro(teXParser, strArr);
                case 120:
                    return PredefMacros.arrayATATenv_macro(teXParser, strArr);
                case qs.F1 /* 121 */:
                    return PredefMacros.alignATATenv_macro(teXParser, strArr);
                case qs.G1 /* 122 */:
                    return PredefMacros.alignedATATenv_macro(teXParser, strArr);
                case qs.H1 /* 123 */:
                    return PredefMacros.flalignATATenv_macro(teXParser, strArr);
                case qs.I1 /* 124 */:
                    return PredefMacros.alignatATATenv_macro(teXParser, strArr);
                case qs.J1 /* 125 */:
                    return PredefMacros.alignedatATATenv_macro(teXParser, strArr);
                case qs.K1 /* 126 */:
                    return PredefMacros.multlineATATenv_macro(teXParser, strArr);
                case qs.L1 /* 127 */:
                    return PredefMacros.gatherATATenv_macro(teXParser, strArr);
                case 128:
                    return PredefMacros.gatheredATATenv_macro(teXParser, strArr);
                case qs.N1 /* 129 */:
                    return PredefMacros.shoveright_macro(teXParser, strArr);
                case qs.O1 /* 130 */:
                    return PredefMacros.shoveleft_macro(teXParser, strArr);
                case qs.P1 /* 131 */:
                    return PredefMacros.backslashcr_macro(teXParser, strArr);
                case qs.Q1 /* 132 */:
                    return PredefMacros.newenvironment_macro(teXParser, strArr);
                case 133:
                    return PredefMacros.renewenvironment_macro(teXParser, strArr);
                case 134:
                    return PredefMacros.makeatletter_macro(teXParser, strArr);
                case qs.R1 /* 135 */:
                    return PredefMacros.makeatother_macro(teXParser, strArr);
                case qs.S1 /* 136 */:
                case qs.T1 /* 137 */:
                    return PredefMacros.fbox_macro(teXParser, strArr);
                case qs.U1 /* 138 */:
                    return PredefMacros.stackrel_macro(teXParser, strArr);
                case qs.V1 /* 139 */:
                    return PredefMacros.stackbin_macro(teXParser, strArr);
                case qs.W1 /* 140 */:
                    return PredefMacros.accentset_macro(teXParser, strArr);
                case qs.X1 /* 141 */:
                    return PredefMacros.underaccent_macro(teXParser, strArr);
                case qs.Y1 /* 142 */:
                    return PredefMacros.undertilde_macro(teXParser, strArr);
                case qs.Z1 /* 143 */:
                    return PredefMacros.overset_macro(teXParser, strArr);
                case qs.a2 /* 144 */:
                    return PredefMacros.Braket_macro(teXParser, strArr);
                case qs.b2 /* 145 */:
                    return PredefMacros.Set_macro(teXParser, strArr);
                case qs.c2 /* 146 */:
                    return PredefMacros.underset_macro(teXParser, strArr);
                case qs.d2 /* 147 */:
                    return PredefMacros.boldsymbol_macro(teXParser, strArr);
                case qs.e2 /* 148 */:
                    return PredefMacros.LaTeX_macro(teXParser, strArr);
                case qs.f2 /* 149 */:
                    return PredefMacros.GeoGebra_macro(teXParser, strArr);
                case qs.g2 /* 150 */:
                    return PredefMacros.big_macro(teXParser, strArr);
                case qs.h2 /* 151 */:
                    return PredefMacros.Big_macro(teXParser, strArr);
                case qs.i2 /* 152 */:
                    return PredefMacros.bigg_macro(teXParser, strArr);
                case qs.j2 /* 153 */:
                    return PredefMacros.Bigg_macro(teXParser, strArr);
                case qs.k2 /* 154 */:
                    return PredefMacros.bigl_macro(teXParser, strArr);
                case qs.l2 /* 155 */:
                    return PredefMacros.Bigl_macro(teXParser, strArr);
                case qs.m2 /* 156 */:
                    return PredefMacros.biggl_macro(teXParser, strArr);
                case qs.n2 /* 157 */:
                    return PredefMacros.Biggl_macro(teXParser, strArr);
                case qs.o2 /* 158 */:
                    return PredefMacros.bigr_macro(teXParser, strArr);
                case qs.p2 /* 159 */:
                    return PredefMacros.Bigr_macro(teXParser, strArr);
                case qs.q2 /* 160 */:
                    return PredefMacros.biggr_macro(teXParser, strArr);
                case qs.r2 /* 161 */:
                    return PredefMacros.Biggr_macro(teXParser, strArr);
                case qs.s2 /* 162 */:
                    return PredefMacros.displaystyle_macro(teXParser, strArr);
                case qs.t2 /* 163 */:
                    return PredefMacros.textstyle_macro(teXParser, strArr);
                case qs.u2 /* 164 */:
                    return PredefMacros.scriptstyle_macro(teXParser, strArr);
                case qs.v2 /* 165 */:
                    return PredefMacros.scriptscriptstyle_macro(teXParser, strArr);
                case qs.w2 /* 166 */:
                    return PredefMacros.sideset_macro(teXParser, strArr);
                case qs.x2 /* 167 */:
                    return PredefMacros.prescript_macro(teXParser, strArr);
                case qs.y2 /* 168 */:
                    return PredefMacros.rotatebox_macro(teXParser, strArr);
                case qs.z2 /* 169 */:
                    return PredefMacros.reflectbox_macro(teXParser, strArr);
                case qs.A2 /* 170 */:
                    return PredefMacros.scalebox_macro(teXParser, strArr);
                case qs.B2 /* 171 */:
                    return PredefMacros.resizebox_macro(teXParser, strArr);
                case qs.C2 /* 172 */:
                    return PredefMacros.raisebox_macro(teXParser, strArr);
                case qs.D2 /* 173 */:
                    return PredefMacros.shadowbox_macro(teXParser, strArr);
                case qs.E2 /* 174 */:
                    return PredefMacros.ovalbox_macro(teXParser, strArr);
                case qs.F2 /* 175 */:
                    return PredefMacros.doublebox_macro(teXParser, strArr);
                case qs.G2 /* 176 */:
                    return PredefMacros.phantom_macro(teXParser, strArr);
                case qs.H2 /* 177 */:
                    return PredefMacros.hphantom_macro(teXParser, strArr);
                case qs.I2 /* 178 */:
                    return PredefMacros.vphantom_macro(teXParser, strArr);
                case qs.J2 /* 179 */:
                    return PredefMacros.spATbreve_macro(teXParser, strArr);
                case qs.K2 /* 180 */:
                    return PredefMacros.spAThat_macro(teXParser, strArr);
                case qs.L2 /* 181 */:
                    return PredefMacros.definecolor_macro(teXParser, strArr);
                case qs.M2 /* 182 */:
                    return PredefMacros.textcolor_macro(teXParser, strArr);
                case qs.N2 /* 183 */:
                    return PredefMacros.fgcolor_macro(teXParser, strArr);
                case qs.O2 /* 184 */:
                    return PredefMacros.bgcolor_macro(teXParser, strArr);
                case qs.P2 /* 185 */:
                    return PredefMacros.colorbox_macro(teXParser, strArr);
                case qs.Q2 /* 186 */:
                    return PredefMacros.fcolorbox_macro(teXParser, strArr);
                case qs.R2 /* 187 */:
                    return PredefMacros.cedilla_macro(teXParser, strArr);
                case qs.S2 /* 188 */:
                    return PredefMacros.IJ_macro(teXParser, strArr);
                case qs.T2 /* 189 */:
                    return PredefMacros.IJ_macro(teXParser, strArr);
                case qs.U2 /* 190 */:
                    return PredefMacros.TStroke_macro(teXParser, strArr);
                case qs.V2 /* 191 */:
                    return PredefMacros.TStroke_macro(teXParser, strArr);
                case qs.W2 /* 192 */:
                    return PredefMacros.LCaron_macro(teXParser, strArr);
                case qs.X2 /* 193 */:
                    return PredefMacros.tcaron_macro(teXParser, strArr);
                case qs.Y2 /* 194 */:
                    return PredefMacros.LCaron_macro(teXParser, strArr);
                case qs.Z2 /* 195 */:
                    return PredefMacros.ogonek_macro(teXParser, strArr);
                case qs.a3 /* 196 */:
                    return PredefMacros.cong_macro(teXParser, strArr);
                case qs.b3 /* 197 */:
                    return PredefMacros.doteq_macro(teXParser, strArr);
                case qs.c3 /* 198 */:
                    return PredefMacros.jlmDynamic_macro(teXParser, strArr);
                case qs.d3 /* 199 */:
                    return PredefMacros.jlmExternalFont_macro(teXParser, strArr);
                case qs.e3 /* 200 */:
                    return PredefMacros.jlmText_macro(teXParser, strArr);
                case qs.f3 /* 201 */:
                    return PredefMacros.jlmTextit_macro(teXParser, strArr);
                case qs.g3 /* 202 */:
                    return PredefMacros.jlmTextbf_macro(teXParser, strArr);
                case 203:
                    return PredefMacros.jlmTextitbf_macro(teXParser, strArr);
                case qs.i3 /* 204 */:
                    return PredefMacros.DeclareMathSizes_macro(teXParser, strArr);
                case qs.j3 /* 205 */:
                    return PredefMacros.magnification_macro(teXParser, strArr);
                case qs.k3 /* 206 */:
                    return PredefMacros.hline_macro(teXParser, strArr);
                case qs.l3 /* 207 */:
                case 208:
                case qs.m3 /* 209 */:
                case qs.n3 /* 210 */:
                case qs.o3 /* 211 */:
                case qs.p3 /* 212 */:
                case qs.q3 /* 213 */:
                case qs.r3 /* 214 */:
                case qs.s3 /* 215 */:
                case qs.t3 /* 216 */:
                    return PredefMacros.size_macros(teXParser, strArr);
                case qs.u3 /* 217 */:
                    return PredefMacros.jlatexmathcumsup_macro(teXParser, strArr);
                case qs.v3 /* 218 */:
                    return PredefMacros.jlatexmathcumsub_macro(teXParser, strArr);
                case qs.w3 /* 219 */:
                    return PredefMacros.hstrok_macro(teXParser, strArr);
                case qs.x3 /* 220 */:
                    return PredefMacros.Hstrok_macro(teXParser, strArr);
                case qs.y3 /* 221 */:
                    return PredefMacros.dstrok_macro(teXParser, strArr);
                case qs.z3 /* 222 */:
                    return PredefMacros.Dstrok_macro(teXParser, strArr);
                case qs.A3 /* 223 */:
                    return PredefMacros.dotminus_macro(teXParser, strArr);
                case qs.B3 /* 224 */:
                    return PredefMacros.ratio_macro(teXParser, strArr);
                case qs.C3 /* 225 */:
                    return PredefMacros.smallfrowneq_macro(teXParser, strArr);
                case qs.D3 /* 226 */:
                    return PredefMacros.geoprop_macro(teXParser, strArr);
                case 227:
                    return PredefMacros.minuscolon_macro(teXParser, strArr);
                case qs.E3 /* 228 */:
                    return PredefMacros.minuscoloncolon_macro(teXParser, strArr);
                case qs.F3 /* 229 */:
                    return PredefMacros.simcolon_macro(teXParser, strArr);
                case qs.G3 /* 230 */:
                    return PredefMacros.simcoloncolon_macro(teXParser, strArr);
                case qs.H3 /* 231 */:
                    return PredefMacros.approxcolon_macro(teXParser, strArr);
                case qs.I3 /* 232 */:
                    return PredefMacros.approxcoloncolon_macro(teXParser, strArr);
                case TLRPC.LAYER /* 233 */:
                    return PredefMacros.coloncolon_macro(teXParser, strArr);
                case qs.J3 /* 234 */:
                    return PredefMacros.equalscolon_macro(teXParser, strArr);
                case qs.K3 /* 235 */:
                    return PredefMacros.equalscoloncolon_macro(teXParser, strArr);
                case qs.L3 /* 236 */:
                    return PredefMacros.colonminus_macro(teXParser, strArr);
                case qs.M3 /* 237 */:
                    return PredefMacros.coloncolonminus_macro(teXParser, strArr);
                case qs.N3 /* 238 */:
                    return PredefMacros.colonequals_macro(teXParser, strArr);
                case qs.O3 /* 239 */:
                    return PredefMacros.coloncolonequals_macro(teXParser, strArr);
                case qs.P3 /* 240 */:
                    return PredefMacros.colonsim_macro(teXParser, strArr);
                case qs.Q3 /* 241 */:
                    return PredefMacros.coloncolonsim_macro(teXParser, strArr);
                case qs.R3 /* 242 */:
                    return PredefMacros.colonapprox_macro(teXParser, strArr);
                case qs.S3 /* 243 */:
                    return PredefMacros.coloncolonapprox_macro(teXParser, strArr);
                case qs.T3 /* 244 */:
                    return PredefMacros.kern_macro(teXParser, strArr);
                case qs.U3 /* 245 */:
                    return PredefMacros.char_macro(teXParser, strArr);
                case qs.V3 /* 246 */:
                case qs.W3 /* 247 */:
                    return PredefMacros.romannumeral_macro(teXParser, strArr);
                case qs.X3 /* 248 */:
                    return PredefMacros.textcircled_macro(teXParser, strArr);
                case qs.Y3 /* 249 */:
                    return PredefMacros.textsc_macro(teXParser, strArr);
                case qs.Z3 /* 250 */:
                    return PredefMacros.sc_macro(teXParser, strArr);
                case qs.a4 /* 251 */:
                case qs.b4 /* 252 */:
                case qs.c4 /* 253 */:
                case qs.d4 /* 254 */:
                case qs.e4 /* 255 */:
                case 256:
                case qs.g4 /* 257 */:
                case qs.h4 /* 258 */:
                case qs.i4 /* 259 */:
                case qs.j4 /* 260 */:
                    return PredefMacros.muskip_macros(teXParser, strArr);
                case qs.k4 /* 261 */:
                    return PredefMacros.quad_macro(teXParser, strArr);
                case qs.l4 /* 262 */:
                    return PredefMacros.surd_macro(teXParser, strArr);
                case qs.m4 /* 263 */:
                    return PredefMacros.iint_macro(teXParser, strArr);
                case qs.n4 /* 264 */:
                    return PredefMacros.iiint_macro(teXParser, strArr);
                case qs.o4 /* 265 */:
                    return PredefMacros.iiiint_macro(teXParser, strArr);
                case qs.p4 /* 266 */:
                    return PredefMacros.idotsint_macro(teXParser, strArr);
                case qs.q4 /* 267 */:
                    return PredefMacros.int_macro(teXParser, strArr);
                case qs.r4 /* 268 */:
                    return PredefMacros.oint_macro(teXParser, strArr);
                case qs.s4 /* 269 */:
                    return PredefMacros.lmoustache_macro(teXParser, strArr);
                case qs.t4 /* 270 */:
                    return PredefMacros.rmoustache_macro(teXParser, strArr);
                case qs.u4 /* 271 */:
                    return PredefMacros.insertBreakMark_macro(teXParser, strArr);
                case qs.v4 /* 272 */:
                    return PredefMacros.jlmXML_macro(teXParser, strArr);
                case qs.w4 /* 273 */:
                    return PredefMacros.above_macro(teXParser, strArr);
                case qs.x4 /* 274 */:
                    return PredefMacros.abovewithdelims_macro(teXParser, strArr);
                case qs.y4 /* 275 */:
                    return PredefMacros.st_macro(teXParser, strArr);
                case qs.z4 /* 276 */:
                    return PredefMacros.fcscore_macro(teXParser, strArr);
                case qs.A4 /* 277 */:
                    return PredefMacros.textstyle_macros(teXParser, strArr);
                case qs.B4 /* 278 */:
                    return PredefMacros.qquad_macro(teXParser, strArr);
                case qs.C4 /* 279 */:
                    return PredefMacros.longdiv_macro(teXParser, strArr);
                case qs.D4 /* 280 */:
                    return PredefMacros.questeq_macro(teXParser, strArr);
                case qs.E4 /* 281 */:
                    return PredefMacros.bangle_macro(teXParser, strArr);
                case qs.F4 /* 282 */:
                    return PredefMacros.brace_macro(teXParser, strArr);
                case qs.G4 /* 283 */:
                    return PredefMacros.brack_macro(teXParser, strArr);
                default:
                    return null;
            }
        } catch (Exception e10) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + teXParser.getLine() + ":" + teXParser.getCol() + "\n" + e10.getMessage());
        }
    }

    @Override // org.scilab.forge.jlatexmath.MacroInfo
    public Object invoke(TeXParser teXParser, String[] strArr) {
        return invokeID(this.id, teXParser, strArr);
    }

    public PredefMacroInfo(int i7, int i10) {
        super(i10);
        this.id = i7;
    }
}
